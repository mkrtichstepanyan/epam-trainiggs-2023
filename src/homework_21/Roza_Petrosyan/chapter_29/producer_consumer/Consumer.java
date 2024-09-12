package homework_21.Roza_Petrosyan.chapter_29.producer_consumer;

public class Consumer implements Runnable{
    Q q;

    Consumer(Q q) {
        this.q = q;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            q.get();
        }
    }
}
