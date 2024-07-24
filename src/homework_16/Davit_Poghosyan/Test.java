package homework_16.Davit_Poghosyan;

public class Test {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(10);
        array.add(1);
        array.add(2);
        array.add(3);
        int[] arr = {4,5,6};
        array.addAll(arr);
        for (int i = 0 ; i < array.getSize(); i++){
            System.out.println(array.get(i));
        }
        System.out.println(array.indexOf(3));
    }
}