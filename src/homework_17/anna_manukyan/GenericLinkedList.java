package homework_17.anna_manukyan;

import java.util.*;

public class GenericLinkedList<T> implements List<T>, Cloneable {

    private int size;
    private int index;
    private Node<T> head;
    private Node<T> tail;
    private Node<T> currentNode;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Node<T> item = head; item != null; item = item.next) {
            if (o.equals(item.element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        Node<T> current = head;

        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                if (current != null) {
                    return true;
                }
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[size];
        int i = 0;
        for (Node<T> item = head; item != null; item = item.next) {
            objects[i++] = item.element;
        }
        return objects;
    }

    @Override
    public Object[] toArray(Object[] a) {
        // not implement
        return new Object[0];
    }

    @Override
    public boolean add(T o) {
        Node<T> last = tail;
        Node<T> newNode = new Node<>(o, last, null);
        tail = newNode;
        if (last == null) {
            head = newNode;
        } else {
            last.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o != null) {
            for (Node<T> item = head; item != null; item = item.next) {
                if (o.equals(item.element)) {
                    if (item.prev == null) {
                        head = item.next;
                    } else {
                        item.prev.next = item.next;
                    }
                    if (item.next == null) {
                        tail = item.prev;
                    } else {
                        item.next.prev = item.prev;
                        item.next = null;
                    }
                    item.prev = null;
                    item = null;
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        boolean added = false;
        for (Object o : c.toArray()) {
            added = add((T) o);
        }
        return added;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        checkIndexPos(index);
        for (Object o : c.toArray()) {
            add(index++, o);
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        // not implement
        return false;
    }

    @Override
    public void clear() {
        for (Node<T> item = head; item != null; ) {
            item.element = null;
            item.prev = null;
            item.next = null;
            item = item.next;
        }
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        int currentIndex = 0;
        checkIndexPos(index);
        if (index == currentIndex) {
            currentNode = head;
            return head.element;
        } else {
            for (Node<T> item = head; item != null; item = item.next) {
                currentIndex++;
                if (index == currentIndex) {
                    currentNode = item.next;
                    return item.next.element;
                }
            }
        }
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        get(index);
        currentNode.element = (T) element;
        return currentNode.element;
    }

    @Override
    public void add(int index, Object element) {
        checkIndexPos(index);
        get(index);
        Node<T> prev = currentNode.prev;
        Node<T> newNode = new Node<>((T) element, prev, currentNode);
        currentNode.prev = newNode;
        if (prev == null) {
            head = newNode;
        } else {
            prev.next = newNode;
        }
        size++;
    }

    @Override
    public T remove(int index) {
        checkIndexPos(index);
        get(index);
        Node<T> next = currentNode.next;
        Node<T> prev = currentNode.prev;
        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
        }

        if (next == null) {
            tail = prev;
        } else {
            next.prev = prev;
        }

        currentNode.element = null;
        size--;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<T> item = head; item != null; item = item.next) {
                if (item.element == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<T> item = head; item != null; item = item.next) {
                if (item.element == o) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = size;
        if (o == null) {
            for (Node<T> item = head; item != null; item = item.next) {
                index--;
                if (item.element == null) {
                    return index;
                }
            }
        } else {
            for (Node<T> item = head; item != null; item = item.next) {
                index--;
                if (item.element == o) {
                    return index;
                }
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        // not implement
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        // not implement
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        List<T> subList = new ArrayList<>();
        checkIndexPos(fromIndex);
        checkIndexPos(toIndex);
        if (toIndex<fromIndex) {
            throw new IllegalArgumentException("Second index must be greater than first.");
        }
        get(fromIndex);
        for (Node<T> item = currentNode; item != null; item = item.next) {
            if (indexOf(item.element) <= toIndex) {
                subList.add(item.element);
            }
        }
        return subList;
    }


    @Override
    public boolean removeAll(Collection c) {
        boolean isRemoved = false;
        for (Object o : c.toArray()) {
            if (contains(o)) {
                isRemoved = remove(o);
                if (!isRemoved) {
                    System.out.println("Collection does not contains " + o.toString() + " object. And can not remove this object");
                    return isRemoved;
                }
            } else {
                System.out.println("No such an element");
                System.out.println(o.toString());
                System.exit(1);
            }
        }
        return isRemoved;
    }

    @Override
    public boolean containsAll(Collection c) {
        boolean isContains = false;
        for (Object o : c.toArray()) {
            if (contains(o)) {
                isContains = true;
            } else {
                isContains = false;
            }
            if (!isContains) {
                System.out.println("Collection does not contains " + o.toString() + " object.");
                return isContains;
            }
        }
        return isContains;
    }

    private void checkIndexPos(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("Wrong index");
        }
    }
}
