package homework_4.Eduard_Eghiazaryan.Chapter_6;



public class Stack {
    int[] stack = new int[10];
    int tos;
    Stack() {
        tos = -1;
    }
    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is full.");
        else
            stack[++tos] = item;
    }
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stack[tos--];
    }
}
