package homework_19.Vahe_Vardanyan;

public class ExtendedListDemo {
    public static void main(String[] args) {
        ExtendedList<Integer> intList = new ExtendedList<>();
        intList.add(11);
        intList.add(22);
        intList.add(33);
        intList.add(-44);
        intList.add(55);
        intList.add(65);

        System.out.println("Extend list");
        intList.forEach(System.out::println);

        System.out.println("Mapped list");
        ExtendedList<Integer> mappedList = intList.map((element) -> 2 * element);
        mappedList.forEach(System.out::println);

        System.out.println("Generated elements");
        intList.fill(() -> 77, 2);
        intList.forEach(System.out::println);

        System.out.println("Elements  checking");
        System.out.println(intList.forAll((n) -> n > 0));

        System.out.println("Elements Partitioning");
        System.out.println(intList.partition((n) -> n % 2 == 0));

        System.out.println("Reduce element");
        Integer reduce = intList.reduce(Integer::sum, 0);
        System.out.println(reduce);

    }
}
