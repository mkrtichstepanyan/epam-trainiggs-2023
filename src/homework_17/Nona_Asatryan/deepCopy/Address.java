package homework_17.Nona_Asatryan.deepCopy;


class Address implements Cloneable {
    private String name;
    private Address next;

    public Address(String name) {
        this.name = name;
    }

    public Address(String name, Address next) {
        this.name = name;
        this.next = next;
    }

    public void setNext(Address next) {
        this.next = next;
    }

    public Address getNext() {
        return next;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address clone = (Address) super.clone();
        if (next != null) {
            clone.setNext((Address) next.clone());
        }
        return clone;
    }

    @Override
    public String toString() {
        return name;
    }
}

