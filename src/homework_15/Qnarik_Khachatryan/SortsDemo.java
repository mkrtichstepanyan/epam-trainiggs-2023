package homework_15.Qnarik_Khachatryan;

import static homework_15.Qnarik_Khachatryan.BubbleSort.bubbleSort;
import static homework_15.Qnarik_Khachatryan.SelectionSort.selectionSort;
import static homework_15.Qnarik_Khachatryan.InsertionSort.insertionSort;

public class SortsDemo {
    public static void main(String[] args) {


        int[] arrayToSort = {21, 10, 1, -15, 2, 5, 55};
//        printArray(bubbleSort(arrayToSort));
//        printArray(selectionSort(arrayToSort));
        printArray(insertionSort(arrayToSort));


    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
