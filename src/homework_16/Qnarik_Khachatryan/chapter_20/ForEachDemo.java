package homework_16.Qnarik_Khachatryan.chapter_20;

//Use the for-each for loop to cycle through a collection

import java.util.ArrayList;

class ForEachDemo {
    public static void main(String[] args) {

        //Create an array list for integers
        ArrayList<Integer> vals = new ArrayList<>();

        //Add values to the array list.
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        //Use the loop to display the values.
        System.out.print("Contents of vals: ");
        for (int v : vals) {
            System.out.print(v + " ");
        }
        System.out.println();

        // Now sum the values by using a for loop.
        int sum = 0;
        for (int v : vals) {
            sum += v;
        }
        System.out.println("Sum of values: " + sum);
    }
}
