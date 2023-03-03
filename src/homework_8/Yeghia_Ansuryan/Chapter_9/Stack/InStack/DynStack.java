package homework_8.Yeghia_Ansuryan.Chapter_9.Stack.InStack;

import homework_8.Yeghia_Ansuryan.Chapter_9.Stack.IntStack;

public class DynStack implements IntStack {
    private int[] stck;
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            int[] temp = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underfllow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }

}