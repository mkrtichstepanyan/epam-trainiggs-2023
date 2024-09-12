package homework_21.Roza_Petrosyan.parallel_sorting;

import java.util.concurrent.TimeUnit;

public class QuickSort extends AbstractSorter {
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    };

    @Override
    public long getTime(int[] array) {
        long start = System.nanoTime();
        sort(array);
        long end = System.nanoTime();
        return TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
    }
}
