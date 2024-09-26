package homework_19.Roza_Petrosyan.chapter_15.generic_constructor_reference;
public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;
        MyClass<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("val in mc is " + mc.getVal());

        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;
        MyClass2 mc2 = myClassFactory(myClassCons2, "Lambda");
        System.out.println("str in mc2 is " + mc2.getVal());
    }
}
