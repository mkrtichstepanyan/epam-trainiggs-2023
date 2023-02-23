package homework_6.Qnarik_Khachatryan.chapter_8.dispatch;

class Dispatch {
    public static void main(String[] args) {
        A a = new A(); // object of type A.java
        B b = new B(); // object of type B
        C c = new C(); // object of type C

        A r; //obtain a reference of type A.java

        r = a; // r refers to an A.java object
        r.callme(); // calls A.java's version of callme

        r = b; // r refers to a B object
        r.callme(); // calls B's version of callme

        r = c; // r refers to a C object
        r.callme(); // calls C's version of callme
    }
}
