package homework_21.Roza_Petrosyan.chapter_29.phaser_onAdvance;

import java.util.concurrent.Phaser;

public class MyThread implements Runnable {
    Phaser phsr;
    String name;

    MyThread(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
    }

    public void run() {
        while (!phsr.isTerminated()) {
            System.out.println("Thread " + name +
                    " Beginning Phase " + phsr.getPhase());
        }
        phsr.arriveAndAwaitAdvance();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
