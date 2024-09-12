package homework_21.Roza_Petrosyan.chapter_29.exchanger;

import java.util.concurrent.Exchanger;

public class UseString implements Runnable{
    Exchanger<String> ex;
    String str;
    UseString(Exchanger<String> c) {
        ex = c;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                str = ex.exchange(new String());
                System.out.println("Got: " + str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
