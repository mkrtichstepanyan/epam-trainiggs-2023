package homework_19.Anush_Ananyan.List;

import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        ExtendedList<String> list = new ExtendedList<>();
        ExtendedList<String> list2 = new ExtendedList<>();
        list.add("Anna");
        list.add("Karen");
        list.add("Emma");
        list.add("Artak");

        System.out.println(list);

        System.out.println(list.map(String::toUpperCase));

        list.fill(() -> "Vahe", 2);
        System.out.println(list);

        list2.fill(() -> "Ani", 3);
        System.out.println(list2.forAll((n) -> n.equals("Ani")));
        System.out.println(list.forAll((n) -> n.equals("Anna")));

        System.out.println(list.partition((n) -> n.length() == 4));

        System.out.println(list.reduce((a, b) -> a + "|" + b, "list of names: "));
    }
}
