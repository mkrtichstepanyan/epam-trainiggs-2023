package homework_19.Anush_Ananyan.LambdaExpression;

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc revers = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Lambda reversed is " + revers.func("Lambda"));
        System.out.println("Expression reversed is " + revers.func("Expression"));
    }
}
