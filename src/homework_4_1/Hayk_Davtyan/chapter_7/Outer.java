package homework_4_1.Hayk_Davtyan.chapter_7;

public class Outer {
    int outer_x = 100;
    void test(){
        for (int i = 0; i < 10; i++) {
            class Inner{
                void display(){
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
           // Inner.display();
        }
    }
}
