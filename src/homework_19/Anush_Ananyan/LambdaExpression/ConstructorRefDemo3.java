package homework_19.Anush_Ananyan.LambdaExpression;

public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFuncCons2<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFuncCons2<MyClassGen<Double>, Double> myClassCons = MyClassGen<Double>::new;

        MyClassGen<Double> mc = myClassFactory(myClassCons, 100.1);

        System.out.println("val in mc is " + mc.getVal());

        MyFuncCons2<MyClass2, String> myClassCons2 = MyClass2::new;

        MyClass2 mc2 = myClassFactory(myClassCons2, "Lambda");
        System.out.println("str in mc2 is " + mc2.getVal());

    }
}
