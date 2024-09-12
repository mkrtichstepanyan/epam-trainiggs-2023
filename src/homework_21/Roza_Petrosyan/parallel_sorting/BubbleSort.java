package homework_21.Roza_Petrosyan.parallel_sorting;

import java.util.concurrent.TimeUnit;

public class BubbleSort extends AbstractSorter {
    @Override
    public long getTime(int[] array) {
        long start = System.nanoTime();
        sort(array);
        long end = System.nanoTime();
        return TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
    }

    public int[] sort(int[] array) {
        for (int max = array.length - 1; max > 0; max--) {
            boolean swapped = false;
            for (int i = 0; i < max; i++) {
                int left = array[i];
                int right = array[i + 1];
                if (left > right) {
                    array[i + 1] = left;
                    array[i] = right;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return array;
    }
}
