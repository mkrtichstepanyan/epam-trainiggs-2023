package homework_3.Anushik__Gevorgyan.chapter_5;

public class TypeInferenceInFor {
    public static void main(String[] args) {
        System.out.println("Values of x: ");
        for (var x = 2.5; x < 100.0; x = x * 2)
            System.out.println(x + " ");

        System.out.println();

        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("Value in nums array: ");
        for (var v : nums)
            System.out.println(v + " ");

        System.out.println();
    }
}
