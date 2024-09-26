package homework_19.Roza_Petrosyan.chapter_30.stream_demo;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Original list: " + myList);

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()) {
            System.out.println("Minimum value: " + minVal.get());
        }
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()) {
            System.out.println("Maximum value: " + maxVal.get());
        }

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.println("Sorted stream: ");
        sortedStream.forEach((n) -> System.out.println(n + " "));


        Stream<Integer> oddVals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        System.out.print("Odd values: ");
        oddVals.forEach((n) -> System.out.println(n + " "));
        System.out.println();

        oddVals = myList.stream().filter((n) -> (n % 2) == 1).filter((n) -> n > 5);
        System.out.println("Odd values greater than 5: ");
        oddVals.forEach((n) -> System.out.println(n + " "));
        System.out.println();
    }
}
