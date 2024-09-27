package homework_5.Galust_Arzumanyan.chapter_7;


// This method is used to demonstrate improved stack class that uses the length array member
public class NewTestStack {
    public static void main(String[] args) {
        NewStack mystack1 = new NewStack(5);
        NewStack mystack2 = new NewStack(8);
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);
        System.out.println(" Stack in mystack1 ");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());
        System.out.println(" Stack in mystack2 ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
