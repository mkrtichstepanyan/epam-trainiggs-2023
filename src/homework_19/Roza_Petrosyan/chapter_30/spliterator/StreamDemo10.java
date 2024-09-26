package homework_19.Roza_Petrosyan.chapter_30.spliterator;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");
        Stream<String> myStream = myList.stream();
        Spliterator<String> spliterator = myStream.spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();
        if (spliterator2 != null) {
            System.out.println("Output from spliteratpr2: ");
            spliterator2.forEachRemaining((n) -> System.out.println(n));
        }
        System.out.println("\nOutput from spliterator");
        spliterator.forEachRemaining((n) -> System.out.println(n));

    }
}
