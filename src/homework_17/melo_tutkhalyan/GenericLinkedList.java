package homework_17.melo_tutkhalyan;

import homework_17.mkrtich_stepanyan.Node;

import java.util.*;

public class GenericLinkedList<E> implements List<E>, Comparable, Cloneable {

    private Element head;

    private Element tail;

    private int size;


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public E[] toArray() {
        E[] array = (E[]) new Object[this.size];
        int i = 0;
        Element<E> curr = this.head;
        while (curr!= null){
            array[i++] = curr.value;
            curr= curr.next;
        }
        return array;
    }

    @Override
    public Object[] toArray(Object[] a) {
        // not implement
        return new Object[0];
    }

    @Override
    public boolean add(E element) {
        Element<E> element1 = new Element<E>(element);
        if (this.size == 0) {
            this.head = element1;
        } else {
            this.tail.next = element1;
        }
        element1.prev = this.tail;
        this.tail = element1;
        this.size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (this.size > 0) {
            Element<E> curr = this.head;
            for (int i = 0; i < this.size; i++) {
                if (curr.value == o) {
                    this.unlink(i, curr);
                    return true;
                }
                curr = curr.next;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object o : c) {
            this.add((E) o);
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        if (index < 0 || index >= this.size) {
            throw new RuntimeException("Wrong index");
        }
        Element<E> curr = (Element<E>) this.get(index);
        int count = 0;
        for (Object o : c) {
            curr.value = (E) o;
            curr = curr.next;
            count++;
        }
        size += count;
        return true;
    }

    @Override
    public boolean retainAll(Collection c) {
        // not implement
        return false;
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= this.size) {
            throw new RuntimeException("Wrong index");
        }
        Element<E> current;
        if (index <= this.size / 2) {
            current = this.head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = this.tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return (E) current;
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= this.size) {
            throw new RuntimeException("Wrong index");
        }
        Element<E> curr  = (Element<E>) this.get(index);
        E oldvalue = curr.value;
        curr.value = element;
         return oldvalue;
    }

    @Override
    public void add(int index, Object element) {
        Element<E> curr = (Element<E>) this.get(index);
        curr.value = (E) element;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new RuntimeException("Wrong index");
        }
        Element<E> curr = (Element<E>) this.get(index);
        this.unlink(index, curr);
        return (E) curr;
    }

    @Override
    public int indexOf(Object element) {
        int index = 0;
        Element<E> element1;
        if (element == null) {
            for (element1 = this.head; element1 != null; element1 = element1.next) {
                if (element1.value == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (element1 = this.head; element1 != null; element1 = element1.next) {
                if (element1.value.equals(element)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object element) {
        int index = this.size -1;
        Element<E> element1;
        if (element == null) {
            for (element1 = this.tail; element1 != null; element1 = element1.prev) {
                if (element1.value == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (element1 = this.tail; element1 != null; element1 = element1.prev) {
                if (element1.value.equals(element)) {
                    return index;
                }
                index++;
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
        if (toIndex < fromIndex || fromIndex >= this.size || fromIndex < 0 || toIndex > this.size) {
            throw new RuntimeException("Illegal index");
        }
        List<E> list = new LinkedList<E>();
        Element<E> curr = this.head;
        int count = 0;
        while (curr != null) {
            if (count >= fromIndex && count < toIndex) {
                list.add(curr.value);
            }
            curr = curr.next;
            count++;
        }

        return list;
    }


    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public void unlink(int index, Element<E> curr) {
        if (index != 0) {
            curr.prev.next = curr.next;
        } else {
            curr.next.prev = null;
            this.head = curr.next;
        }
        if (index != this.size - 1) {
            curr.next.prev = curr.prev;
        } else {
            curr.prev.next = null;
            this.tail = curr.prev;
        }
        curr.next = curr.prev = null;
        this.size--;
    }

    public String toString() {
        String ret = "[";
        Element<E> cur = this.head;
        int index = 0;
        while (cur != null && index < size) {
            ret = ret + cur.value;
            if (index < this.size - 1) {
                ret = ret + ", ";
            }
            cur = cur.next;
            index++;
        }

        ret = ret + "]";
        return ret;
    }

    public Element getHead() {
        return head;
    }

    public void setHead(Element head) {
        this.head = head;
    }

    public Element getTail() {
        return tail;
    }

    public void setTail(Element tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
