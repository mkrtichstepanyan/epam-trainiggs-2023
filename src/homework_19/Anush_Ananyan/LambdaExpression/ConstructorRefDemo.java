package homework_19.Anush_Ananyan.LambdaExpression;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFuncCons myClassCons = MyClass::new;

        MyClass mc = myClassCons.func(100);

        System.out.println("val in mc is" + mc.getVal());
    }
}
