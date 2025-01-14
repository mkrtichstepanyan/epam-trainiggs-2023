package homework_16.Qnarik_Khachatryan.chapter_20;

import java.util.ArrayDeque;

class ArrayDequeDemo {
    public static void main(String[] args) {
        //Create an array deque.
        ArrayDeque<String> adq = new ArrayDeque<>();

        //Use an ArrayDeque like a stack.
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.print("Popping the stack: ");

        while (adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }
        System.out.println();

    }
}
