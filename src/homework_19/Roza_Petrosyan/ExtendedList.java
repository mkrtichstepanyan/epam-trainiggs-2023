package homework_19.Roza_Petrosyan;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExtendedList<T> extends ArrayList<T> {
    private final ExtendedList<T> extendedList = this;

    /**
     * implement a method that will apply the given function to all elements of the extendedList
     *
     * @param function mapper function
     * @param <R>      the type of the element in the returned collection.
     * @return extended list of R type
     */
    public <R> ExtendedList<R> map(Function<T, R> function) {
        ExtendedList<R> newExtendedList = new ExtendedList<>();
        for (T element : extendedList) {
            R apply = function.apply(element);
            newExtendedList.add(apply);
        }
        return newExtendedList;
    }

    /**
     * Implement a method that will fill the array with the elements provided by supplier function
     *
     * @param supplier the function that will generate an element for the Extended List.
     * @param count    the amount fo the elements that should be generated.
     */
    public void fill(Supplier<T> supplier, int count) {
        List<T> collect = Stream.generate(supplier).
                limit(count).
                toList();
        extendedList.addAll(collect);
    }

    /**
     * Implement a method that will apply the given predicate and return true if the predicate returns true for all elements in the ExtendedList
     *
     * @param predicate function to make a test
     * @return true if test is true for all elements in the ExtendedList, otherwise return false
     */
    public boolean forAll(Predicate<T> predicate) {
        int count = 0;
        for (T element : extendedList) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return count == extendedList.size();
    }

    /**
     * Implement a method that will divide the extended list into two partitions by the given predicate
     *
     * @param predicate function to make a test
     * @return the list of partitions, usually this should contain two extended list 1. the test is true 2. the test is false
     */
    public List<ExtendedList<T>> partition(Predicate<T> predicate) {
        List<ExtendedList<T>> list = new ExtendedList<>();
        ExtendedList<T> trueList = new ExtendedList<>();
        ExtendedList<T> falseList = new ExtendedList<>();
        for (T element : extendedList) {
            if (predicate.test(element)) {
                trueList.add(element);
            } else {
                falseList.add(element);
            }
        }
        list.add(trueList);
        list.add(falseList);
        return list;
    }

    /**
     * Implement a method that will apply the given Binary Operator to all elements of the Extended List
     *
     * @param binaryOperator
     * @param identity initial value.
     * @return the resulted value
     */
    public T reduce(BinaryOperator<T> binaryOperator, T identity) {
        if (extendedList.isEmpty()) {
            return identity;
        }
        T result = binaryOperator.apply(extendedList.get(0), extendedList.get(1));
        for (int i = 2; i < extendedList.size(); i++) {
            if(result != null){
                result = binaryOperator.apply(result, extendedList.get(i));
            }
        }
        return result;
    }
}
