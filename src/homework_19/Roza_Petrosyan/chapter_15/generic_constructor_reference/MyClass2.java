package homework_19.Roza_Petrosyan.chapter_15.generic_constructor_reference;

public class MyClass2 {
    String str;
    MyClass2(String s) {
        str = s;
    }
    MyClass2() {
        str = "";
    }

    String getVal(){
        return str;
    }
}
