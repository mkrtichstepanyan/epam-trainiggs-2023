package homework_6.Roza_Petrosyan.chapter_8.Override;

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k is: " + k);
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
