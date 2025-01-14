package homework_17.rafik_pahlevanyan.linked_list;

public class Node<T> {
    T item;
    Node<T> nextItem;
    Node<T> prevItem;

    public Node(T item, Node<T> nextItem, Node<T> prevItem) {
        this.item = item;
        this.nextItem = nextItem;
        this.prevItem = prevItem;
    }

    public Node() {
    }

    public Node(T element) {
        item = element;
    }

    @Override
    public String toString() {
        if (item == null) {
            return "Node: null";
        } else {
            return "Item: " + item.toString();
        }
    }

}
