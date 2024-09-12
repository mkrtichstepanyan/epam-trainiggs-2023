package homework_21.Roza_Petrosyan.chapter_29.atonic;

public class AtomThread implements Runnable{
    String name;

    AtomThread(String n) {
        name = n;
    }

    public void run() {
        System.out.println("Starting " + name);
        for (int i = 1; i <=3 ; i++) {
            Shared.ai.getAndSet(i);
        }
    }
}
