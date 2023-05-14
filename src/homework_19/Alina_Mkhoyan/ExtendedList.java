package homework_19.Alina_Mkhoyan;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExtendedList<T> extends ArrayList<T> {

    /**
     * implement a method that will apply the given function to all elements of the extendedList
     *
     * @param function mapper function
     * @param <R>      the type of the element in the returned collection.
     * @return extended list of R type
     */
    public <R> ExtendedList<R> map(Function<T, R> function) {
        ExtendedList<R> result = new ExtendedList<>();
        for (T t : this) {
            R r = function.apply(t);
            result.add(r);
        }
        return result;
    }

    /**
     * Implement a method that will fill the array with the elements provided by supplier function
     *
     * @param supplier the function that will generate an element for the Extended List.
     * @param count    the amount fo the elements that should be generated.
     */
    public void fill(Supplier<T> supplier, int count) {
        for (int i = 0; i < count; i++) {
            T element = supplier.get();
            add(element);
        }
    }

    /**
     * Implement a method that will apply the given predicate and return true if the predicate returns true for all elements in the ExtendedList
     *
     * @param predicate function to make a test
     * @return true if test is true for all elements in the ExtendedList, otherwise return false
     */
    public boolean forAll(Predicate<T> predicate) {
        for (T t : this) {
            if (!predicate.test(t)) {
                return false;
            }
        }
        return true;
    }
    /**
     * Implement a method that will divide the extended list into two partitions by the given predicate
     *
     * @param predicate function to make a test
     * @return the list of partitions, usually this should contain two extended list 1. the test is true 2. the test is false
     */
    public List<ExtendedList<T>> partition(Predicate<T> predicate) {
        ExtendedList<T> trueList = new ExtendedList<>();
        ExtendedList<T> falseList = new ExtendedList<>();
        for (T t : this) {
            if (predicate.test(t)) {
                trueList.add(t);
            } else {
                falseList.add(t);
            }
        }
        List<ExtendedList<T>> result = new ArrayList<>();
        result.add(trueList);
        result.add(falseList);
        return result;
    }

    /**
     * Implement a method that will apply the given Binary Operator to all elements of the Extended List
     *
     * @param binaryOperator
     * @param identity initial value.
     * @return the resulted value
     */
    public T reduce(BinaryOperator<T> binaryOperator, T identity) {
        T result = identity;
        for (T t : this) {
            result = binaryOperator.apply(result, t);
        }
        return result;
    }
}