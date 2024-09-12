package homework_21.Roza_Petrosyan.chapter_29.recursive_action;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }
        System.out.println("A portion of the original sequence");
        for (int i = 0; i < 10; i++) {
            System.out.println(nums[i] + " ");
        }
        System.out.println("\n");
        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);
        fjp.invoke(task);
        System.out.println("A portion of the transformed sequence" +
                "(to four decimal places)");
        for (int i = 0; i < 10; i++) {
            System.out.format("%.4f",nums[i]);
            System.out.println();
        }
    }
}
