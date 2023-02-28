package homework_8.aram_mehrabyan.interfaces.interfacevariable;

public class FixedStack implements InStack {
    private int[] stck;
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else
            return stck[tos--];


    }
}
