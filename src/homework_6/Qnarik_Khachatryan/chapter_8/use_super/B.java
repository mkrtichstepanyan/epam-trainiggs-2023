package homework_6.Qnarik_Khachatryan.chapter_8.use_super;

//create a subclass by extending class A.java

class B extends A {
    int i; //this i hides the i in A.java

    B(int a, int b) {
        super.i = a; // i in A.java
        i = b; // i in B
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
