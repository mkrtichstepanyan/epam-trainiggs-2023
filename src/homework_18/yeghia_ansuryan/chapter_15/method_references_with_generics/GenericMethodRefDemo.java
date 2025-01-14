package homework_18.yeghia_ansuryan.chapter_15.method_references_with_generics;

public class GenericMethodRefDemo {
    static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {

        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"one", "two", "three", "two"};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching,vals, 4);
        System.out.println("vals contains " + count + " 4s");

        count = myOp(MyArrayOps::<String>countMatching, strs, "two");
        System.out.println("strs contains " + count + " twos");
    }
}
