package homework_18.melo_tutkhalyan.entity;

public class User {

    private String name;
    private String surname;
    private Address address;
    private int age;

    public User(String name, String surname, Address address, int age) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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
        if (!(obj instanceof User)) {
            return false;
        }
        User otherUser = (User) obj;
        return this.name != null && this.name.equals(otherUser.name)
                && this.surname != null && this.surname.equals(otherUser.surname)
                && this.address != null && this.address.equals(otherUser.address)
                && this.age == otherUser.age;
    }

    @Override
    public int hashCode() {
        int hashCode = age;
        hashCode = hashCode * 31 + (this.name == null ? 0 : this.name.hashCode());
        hashCode = hashCode * 31 + (this.surname == null ? 0 : this.surname.hashCode());
        hashCode = hashCode * 31 + (this.address == null ? 0 : this.address.hashCode());
        return hashCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                ", age=" + age +
                '}';
    }

}
