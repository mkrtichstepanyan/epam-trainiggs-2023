package homework_21.Roza_Petrosyan.parallel_sorting;

import java.util.concurrent.TimeUnit;

public class SelectionSort extends AbstractSorter {

    @Override
    public long getTime(int[] array) {
        long start = System.nanoTime();
        sort(array);
        long end = System.nanoTime();
        return TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
    }
    public int[] sort(int[] array) {
        int size = array.length;
        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;
            for (int i = step + 1; i < size; i++) {
                if (array[i] < array[min_idx]) {
                    step = i;
                }
            }
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
        return array;
    }
}
