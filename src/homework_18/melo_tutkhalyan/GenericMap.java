package homework_18.melo_tutkhalyan;

import java.util.Arrays;
import java.util.Map;

public class GenericMap<K, V> {

    private int size;
    private Node<K, V>[] table;
    private static final double LOAD_FACTOR = 0.75D;

    @SuppressWarnings("unchecked")
    public GenericMap() {
        this.table = new Node[16];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public V get(K key) {
        int index = indexOfTable(key);
        Node<K, V> head = this.table[index];
        if (head != null) {
            for (Node<K, V> node = head; node != null; node = node.next) {
                if (node.getKey().equals(key)) {
                    return node.getValue();
                }
            }
        }
        return null;
    }

    public V put(K key, V value) {
        int index = indexOfTable(key);
        Node<K, V> head = this.table[index];
        if (head != null) {
            for (Node<K, V> node = head; node != null; node = node.next) {
                if (node.getKey().equals(key)) {
                    V oldValue = node.getValue();
                    node.setValue(value);
                    return oldValue;
                }
            }
        }
        this.table[index] = new Node<>(key, value, head);
        this.size++;
        this.extend();
        return value;
    }

    public boolean containsKey(K key) {
        int index = this.indexOfTable(key);
        Node<K, V> head = this.table[index];
        if (head != null) {
            for (Node<K, V> node = head; node != null; node = node.next) {
                if (node.getKey().equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (Node<K, V> head : table) {
            if (head != null) {
                if (value == null) {
                    for (Node<K, V> node = head; node != null; node = node.next) {
                        if (node.getValue() == null) {
                            return true;
                        }
                    }
                } else {
                    for (Node<K, V> node = head; node != null; node = node.next) {
                        if (node.getValue().equals(value)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(this.table, null);
        this.size = 0;
    }

    public void extend() {
        if (this.size > (this.table.length * this.LOAD_FACTOR) && (this.table.length < (1 << 30))) {
            this.size = 0;
            Node<K, V>[] oldTable = this.table;
            this.table = new Node[this.table.length * 2];
            for (Node<K, V> head : oldTable) {
                if (head != null) {
                }
                for (Node<K, V> node = head; node != null; node = node.next) {
                    this.put(node.getKey(), node.getValue());
                }
            }
        }
    }

    private int indexOfTable(K key) {
        int hashCode = key.hashCode();
        return hashCode % this.table.length;
    }

}
