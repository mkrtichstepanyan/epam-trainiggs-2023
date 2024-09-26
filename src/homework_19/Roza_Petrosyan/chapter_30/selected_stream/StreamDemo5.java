package homework_19.Roza_Petrosyan.chapter_30.selected_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555",
                "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444",
                "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333",
                "Mary@HerbSchildt.com"));
        System.out.println("Original values in myList: ");
        myList.stream().forEach((a) -> {
            System.out.println(a.name + " " + a.phoneNum + " " + a.email);
        });
        System.out.println();
        Stream<NamePhone> nameAndPhone = myList.stream().
                filter((a)-> a.name.equals("James")).
                map((a) -> new NamePhone(a.name, a.phoneNum));
        System.out.println("List of names and phone numbers: ");
        nameAndPhone.forEach((a) -> {
            System.out.println(a.name + " " + a.phoneNum);
        });
    }
}
