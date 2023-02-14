package homework_4.gevorg_arghushyan.chapter_7;

public class OverloadDemo {
    void test (){
        System.out.println("Параметры отсуствуют");
    }
    void test (int a) {
        System.out.println("a: " + a);
    }
    void test (int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }
    double test (double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Результат вызова ob.test(123.25): " + result);
    }
}
