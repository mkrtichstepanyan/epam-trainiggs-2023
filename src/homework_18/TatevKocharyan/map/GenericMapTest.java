package homework_18.TatevKocharyan.map;

import homework_18.TatevKocharyan.entity.Address;
import homework_18.TatevKocharyan.entity.User;

public class GenericMapTest {
    public static void main(String[] args) {
        Address address=new Address("Ijevan","Kamo","30");
        User user = new User("Hakob", "Hakobyan", "hakob@gmail.com", "555555", 25,address);
        User user1 = new User("Karine", "Hakobyan", "karine@gmail.com", "111111", 20,address);
        GenericMap<User, String> genericMap = new GenericMap<>();
        genericMap.put(user1, "Georgia");
        genericMap.put(user, "Armenia");
        genericMap.put(user, "Russian");
        System.out.println(genericMap.toString());
        Node<User, String> userStringNode = genericMap.get(user);
        System.out.println(userStringNode);
    }
}
