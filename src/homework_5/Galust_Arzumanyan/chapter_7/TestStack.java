package homework_5.Galust_Arzumanyan.chapter_7;


// This method is used to demonstrate an integer stack that can hold 10 values
class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);
        System.out.println(" Stack in mystack1: ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());
        System.out.println(" Stack in mystack2: ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());

    }
}
