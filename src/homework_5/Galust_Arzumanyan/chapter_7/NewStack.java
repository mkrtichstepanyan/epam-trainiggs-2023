package homework_5.Galust_Arzumanyan.chapter_7;

public class NewStack {
    private int[] stack;
    private int tos;

    NewStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stack.length - 1)
            System.out.println(" Stack is full ");
        else
            stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println(" Stack underflow ");
            return 0;
        } else
            return stack[tos--];
    }
}
