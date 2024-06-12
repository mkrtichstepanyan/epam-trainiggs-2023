package homework_17.Davit_Poghosyan;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class GenericLinkedList<T> implements List, Comparable, Cloneable {
    Node<T> head;
    Node<T> tail;
    private int size = 0;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            System.out.println("The list is empty");
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (Object item : this) {
            if (item.equals(0)) {
                System.out.println("The list contains " + o);
            }
        }
        System.out.println("The list doesn't contain " + o);
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        // not implement
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        Node temp = new Node(o);
        if (this.head == null) {
            head = temp;
        } else {
            Node h = head;
            while (h.next != null) {
                h = h.next;
            }
            h.next = temp;
        }
        size++;
        return true;
    }


    @Override
    public boolean remove(Object o) {
        Node prev = new Node(null);
        prev.next = head;
        Node next = head.next;
        Node newtemp = head;
        boolean exists = false;
        if (head.data == o) {
            head = head.next;
            exists = true;
        }
        while (newtemp.next != null) {
            if (String.valueOf(newtemp.data).equals(
                    String.valueOf(o))) {
                prev.next = next;
                exists = true;
                break;
            }
            prev = newtemp;
            newtemp = newtemp.next;
            next = newtemp.next;
        }
        if (exists == false
                && String.valueOf(newtemp.data).equals(
                String.valueOf(o))) {
            prev.next = null;
            exists = true;
        }
        if (exists) {
            size--;
        } else {
            System.out.println(
                    "The linked list does not contain the given value.");
        }
        return false;
    }


    @Override
    public boolean addAll(Collection c) {
        boolean add = false;
        for (Object o : c.toArray()) {
            add = add((T) o);
        }
        return add;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        boolean add = false;
        for (Object o : c.toArray()) {
            add(index++, o);
            add = true;
        }
        return add;
    }

    @Override
    public boolean retainAll(Collection c) {
        // not implement
        return false;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getData();
    }

    @Override
    public Object set(int index, Object element) {
        if (element == null)
            return null;

        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        node.setData((T) element);
        return node;
    }

    @Override
    public void add(int index, Object element) {
    }

    @Override
    public Object remove(int index) {
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.getNext();
            }
            T removed = node.getNext().data;
            node.next = node.getNext().getNext();
            size--;
            return removed;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
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
        return null;
    }


    @Override
    public boolean removeAll(Collection c) {
        for (Object o:c){
            remove(0);
            return true;
        }
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
}

