package homework_21.Roza_Petrosyan.chapter_29.callable;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {
    int stop;
    Factorial(int v) {
        stop = v;
    }
    public Integer call() {
        int fact = 1;
        for (int i = 0; i <= stop ; i++) {
            fact *= i;
        }
        return fact;
    }
}
