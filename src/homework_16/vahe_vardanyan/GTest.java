package homework_16.vahe_vardanyan;

import homework_6.Zara_Avetyan.A;

import java.util.ArrayList;
import java.util.Arrays;

public class GTest {
    public static void main(String[] args) {
        GenericDynamicArray<String> DynArray = new GenericDynamicArray<>();
        GenericDynamicArray<Integer> array = new GenericDynamicArray<>();
        DynArray.addAll(Arrays.asList("A", "B", "C"));
        System.out.println(DynArray);
        DynArray.addByIndex(1, "D");
        System.out.println(DynArray);
        DynArray.addAllByIndex(0, Arrays.asList("V", "A", "H", "E"));
        System.out.println(DynArray);
        DynArray.addAll(Arrays.asList("J", "A", "V", "A"));
        System.out.println(DynArray);

        System.out.println("Add method");
        array.add(7);
        array.add(25);
        array.add(20);
        array.add(30);
        array.add(50);
        array.add(70);
        array.add(90);
        System.out.println(array.toString());
        System.out.println("Before sorting:" + array);
        array.sort();
        System.out.println("After sorting:" + array);


        System.out.println("___________________________________________");

        System.out.println("addAll method");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(55, 60, 77, 80));
        array.addAll(list);
        System.out.println(array.toString());

        System.out.println("clear method");
        array.clear();
        System.out.println(array.toString());

        System.out.println("clone method");
        array.add(15);
        array.add(20);
        array.add(25);
        GenericDynamicArray clone = array.clone();
        System.out.println(clone.toString());

        System.out.println("contains method");
        System.out.println(array.contains(20));
        System.out.println(array.contains(30));

        System.out.println("containsAll method");
        list = new ArrayList<>(Arrays.asList(10, 20, 30));
        System.out.println(array.containsAll(list));
        array.addAll(list);
        System.out.println(array.containsAll(list));

        System.out.println("indexOf method");
        System.out.println(array.indexOf(20));
        System.out.println(array.indexOf(50));

        System.out.println("remove method");
        array.remove(20);
        System.out.println(array.toString());

        System.out.println("removeAll method");
        list = new ArrayList<>(Arrays.asList(10, 30));
        array.removeAll(list);
        System.out.println(array.toString());

        System.out.println("isEmpty method");
        System.out.println(array.isEmpty());
        array.clear();
        System.out.println(array.isEmpty());

        System.out.println("subList method");
        array.addAll(new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70)));
        GenericDynamicArray subList = array.subList(2, 5);
        System.out.println(subList.toString());

        System.out.println("set method");
        array.set(3, 33);
        System.out.println(array.toString());

        System.out.println("removeRange method");
        array.removeRange(2, 5);
        System.out.println(subList.toString());

        System.out.println("-----------------------");
        System.out.println(array);
    }
    }

