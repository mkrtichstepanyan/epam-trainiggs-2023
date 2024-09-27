package homework_5.Galust_Arzumanyan.chapter_7;


// This method is used to demonstrate the difference between public and private
class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;
        // ob.c = 100;
        ob.setc(100);
        System.out.println(" a,b and c; " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
