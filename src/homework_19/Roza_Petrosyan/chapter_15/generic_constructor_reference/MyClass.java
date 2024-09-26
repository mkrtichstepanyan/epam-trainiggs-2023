package homework_19.Roza_Petrosyan.chapter_15.generic_constructor_reference;

public class MyClass<T> {
    private T val;
    MyClass(T v) {
        val = v;
    }

    MyClass(){
        val = null;
    }

    T getVal(){
        return val;
    }
}
