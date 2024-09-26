package homework_18.melo_tutkhalyan.entity;

public class Address {

    private String address;

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address otherAddress = (Address) obj;
        return this.address !=null && this.address.equals(otherAddress.address);
    }

    @Override
    public int hashCode() {
       return address.hashCode();
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
