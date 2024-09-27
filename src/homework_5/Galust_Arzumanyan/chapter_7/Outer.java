package homework_5.Galust_Arzumanyan.chapter_7;


class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 10;

        void display() {
            System.out.println("Display outer_x = " + outer_x);
        }
    }
    /** This will return error, because the 'y' variable is local for 'Inner' class
     void showy(){
     System.out.println(y);
     }
     */
}
