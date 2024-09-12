package homework_21.Roza_Petrosyan.parallel_sorting;

import java.util.concurrent.TimeUnit;

public class MergeSort extends AbstractSorter {
    @Override
    public long getTime(int[] array) {
        long start = System.nanoTime();
        sort(array);
        long end = System.nanoTime();
        return TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
    }

    public int[] sort(int[] array) {
        if (array.length > 1) {
            // Obtain the first half
            int mid = array.length / 2;
            int[] firstHalf = new int[mid];
            System.arraycopy(array, 0, firstHalf, 0, mid);

            // Obtain the second half
            int[] secondHalf = new int[array.length - mid];
            System.arraycopy(array, mid, secondHalf, 0, array.length - mid);

            // Recursively sort the two halves
            sort(firstHalf);
            sort(secondHalf);

            //Merge firstHalf with secondHalf into our array
            merge(firstHalf, secondHalf, array);
        }
        return array;
    }

    private static void merge(int[] firstHalf, int[] secondHalf, int[] array) {
        int currentIndexFirst = 0;
        int currentIndexSecond = 0;
        int currentIndexArray = 0;

        while (currentIndexFirst < firstHalf.length && currentIndexSecond < secondHalf.length) {
            if (firstHalf[currentIndexFirst] < secondHalf[currentIndexSecond]) {
                array[currentIndexArray] = firstHalf[currentIndexFirst];
                currentIndexArray++;
                currentIndexFirst++;
            } else {
                array[currentIndexArray] = secondHalf[currentIndexSecond];
                currentIndexArray++;
                currentIndexSecond++;
            }
        }

        while (currentIndexFirst < firstHalf.length) {
            array[currentIndexArray] = firstHalf[currentIndexFirst];
            currentIndexArray++;
            currentIndexFirst++;
        }

        while (currentIndexSecond < secondHalf.length) {
            array[currentIndexArray] = secondHalf[currentIndexSecond];
            currentIndexArray++;
            currentIndexSecond++;
        }
    }
}
