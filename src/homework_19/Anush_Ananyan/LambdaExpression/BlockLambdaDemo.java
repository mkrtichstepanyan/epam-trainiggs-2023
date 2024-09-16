package homework_19.Anush_Ananyan.LambdaExpression;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int resulte = 1;
            for (int i = 1; i <= n; i++) {
                resulte = i * resulte;
            }
            return resulte;
        };
        System.out.println("The factorial of 3 is " + factorial.func(3));
        System.out.println("The factorial of 5 is " + factorial.func(5));
    }
}
