package homework_16.Davit_Poghosyan.GenericDynamicArray;

public class Test {
    public static void main(String[] args) {
        GenericDynamicArray<String> array = new GenericDynamicArray(10);
        array.add("Hello");
        array.add("Good");
        for (int i = 0; i < array.getSize(); i++) {
            System.out.println(array.get(i));
            System.out.println(array.contains("Hello"));
            System.out.println(array.get(1));
        }
    }
}
