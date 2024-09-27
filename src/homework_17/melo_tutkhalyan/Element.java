package homework_17.melo_tutkhalyan;

public class Element<E> {

    E value;
    Element<E> next;
    Element<E> prev;

    public Element(E value) {
        this.value = value;
    }
}
