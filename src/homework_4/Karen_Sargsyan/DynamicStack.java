package homework_4.Karen_Sargsyan;

public class DynamicStack {
    int[] array;
    int index;

    public DynamicStack(int size) {
        array = new int[size];
        index = -1;
    }

    public DynamicStack() {
        array = new int[10];
        index = -1;
    }

    void push(int element) {
        if (index >= array.length * 0.75) {
            int size = array.length * 2;
            int[] newArray = new int[size];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[++index] = element;

    }

    int pop() {
        if (index < 0) {
            System.out.println("The stack is empty!");
            return -1;
        } else {
            int temp = array[index];
            array[index--] = 0;
            return temp;
        }
    }

}
