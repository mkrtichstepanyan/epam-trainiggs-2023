package homework_20.Anush_Ananyan.Chapter_11.SynchronizedBlock;

public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
