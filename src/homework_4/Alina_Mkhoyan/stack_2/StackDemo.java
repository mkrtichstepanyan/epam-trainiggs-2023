package homework_4.Alina_Mkhoyan.stack_2;

public class StackDemo {
    public static void main(String[] args) {

        Stack stack = new Stack();

        for (int i = 0; i < 11; i++) {
            stack.push(i);
        }

        System.out.println("---------------");
        stack.refactoringPush(10);
        System.out.println("---------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("Pop element : " + stack.pop());
        }

    }
}