package homework_18.araksya_ghazaryan.entity;

import java.util.Objects;

public final class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private int age;
    private Address address;

    public User(String name, String surname, String email, String password, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.address =  new Address(address.getCountry(),address.getCity(),address.getHomeNumber());
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || !this.getClass().equals(o.getClass())) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(password, user.password);
    }
    public int hashCode(){
        int hashCode = this.age;
        hashCode = hashCode * 31 + (this.name == null ? 0 : this.name.hashCode());
        hashCode = hashCode * 31 + (this.surname == null ? 0 : this.surname.hashCode());
        hashCode = hashCode * 31 + (this.password == null ? 0 : this.password.hashCode());
        hashCode = hashCode * 31 + (this.email == null ? 0 : this.email.hashCode());
        return hashCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
