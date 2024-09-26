package homework_19.Roza_Petrosyan.chapter_30.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555",
                "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444",
                "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333",
                "Mary@HerbSchildt.com"));

        Stream<NamePhone> namAndPhone = myList.stream().
                map((a) -> new NamePhone(a.name, a.phoneNum));
        List<NamePhone> npList = namAndPhone.collect(Collectors.toList());
        System.out.println("Names and phone numbers in a List");
        for (NamePhone e : npList) {
            System.out.println(e.name + ": " + e.phoneNum);
        }

        namAndPhone = myList.stream().
                map((a) -> new NamePhone(a.name, a.phoneNum));

        Set<NamePhone> npSet = namAndPhone.collect(Collectors.toSet());
        System.out.println("\nNames and phone numbers in a set");
        for (NamePhone e : npSet) {
            System.out.println(e.name + ": " + e.phoneNum);
        }
    }
}
