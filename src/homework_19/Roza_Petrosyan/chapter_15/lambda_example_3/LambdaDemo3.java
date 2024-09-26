package homework_19.Roza_Petrosyan.chapter_15.lambda_example_3;

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2)) {
            System.out.println("2 is a factor of 10");
        }
        if (!isFactor.test(10, 3)) {
            System.out.println("3 is not a factor of 10");
        }
    }
}
