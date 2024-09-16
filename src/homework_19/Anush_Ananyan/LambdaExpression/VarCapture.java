package homework_19.Anush_Ananyan.LambdaExpression;

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;
        MyFunc myLambda = (n) -> {
            int v = num + n;
            //num++
            return v;
        };
       // num = 9;
        System.out.println(myLambda.func(7));
    }
}
