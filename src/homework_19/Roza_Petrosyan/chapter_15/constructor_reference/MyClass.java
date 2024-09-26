package homework_19.Roza_Petrosyan.chapter_15.constructor_reference;

public class MyClass {
    private int val;
    MyClass(int v){
        val = v;
    }
    MyClass() {
        val = 0;
    }
    int getVal(){
        return val;
    }
}
