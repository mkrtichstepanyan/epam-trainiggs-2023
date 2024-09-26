package homework_19.Roza_Petrosyan;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExtendedListWithStreams<T> extends ArrayList<T> {
    private final ExtendedListWithStreams<T> extendedList = this;

    /**
     * implement a method that will apply the given function to all elements of the extendedList
     *
     * @param function mapper function
     * @param <R>      the type of the element in the returned collection.
     * @return extended list of R type
     */
    public <R> ExtendedListWithStreams<R> map(Function<T, R> function) {
        return extendedList
                .stream()
                .map(function)
                .collect(Collectors.toCollection(ExtendedListWithStreams::new));
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
        return extendedList
                .stream()
                .allMatch(predicate);
    }

    /**
     * Implement a method that will divide the extended list into two partitions by the given predicate
     *
     * @param predicate function to make a test
     * @return the list of partitions, usually this should contain two extended list 1. the test is true 2. the test is false
     */
    public List<ExtendedListWithStreams<T>> partition(Predicate<T> predicate) {
        ExtendedListWithStreams<T> left = extendedList
                .stream()
                .filter(predicate)
                .collect(Collectors.toCollection(ExtendedListWithStreams::new));
        ExtendedListWithStreams<T> right = extendedList
                .stream()
                .filter(predicate.negate())
                .collect(Collectors.toCollection(ExtendedListWithStreams::new));
        return List.of(left, right);
    }

    /**
     * Implement a method that will apply the given Binary Operator to all elements of the Extended List
     *
     * @param binaryOperator
     * @param identity initial value.
     * @return the resulted value
     */
    public T reduce(BinaryOperator<T> binaryOperator, T identity) {
        T result = extendedList.stream().reduce(identity, binaryOperator);
        result = (T) result.toString().substring(3,result.toString().length());
        return result;
    }
}
