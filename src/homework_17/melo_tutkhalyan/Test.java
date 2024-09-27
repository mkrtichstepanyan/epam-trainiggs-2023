package homework_17.melo_tutkhalyan;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        GenericLinkedList<Integer> list = new GenericLinkedList<Integer>();
        list.add(5);
        list.add(9);
        list.add(1);
        list.add(15);
//        System.out.println(list.indexOf(15));
//        list.add(1,22);
//        System.out.println(list.indexOf(22));
//        Integer i = 15;
//        System.out.println(list.remove(i));
        list.set(2, 7);
        System.out.println(list.toString());
//        System.out.println(list.subList(1,3).toString());
        System.out.println(list.lastIndexOf(15));


    }
}
