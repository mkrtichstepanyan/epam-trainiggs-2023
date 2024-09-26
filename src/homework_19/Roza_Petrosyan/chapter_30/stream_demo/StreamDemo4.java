package homework_19.Roza_Petrosyan.chapter_30.stream_demo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);
        Stream<Double> sqrtTotStrm = myList.stream().map((a) -> Math.sqrt(a));
        double productOfSqrtRoots = sqrtTotStrm.reduce(1.0, (a, b) -> a * b);
        System.out.println("Product of square roots is " + productOfSqrtRoots);
    }
}
