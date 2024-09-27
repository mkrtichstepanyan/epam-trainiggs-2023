package homework_20.Anush_Ananyan.BoundedBlockingBuffer;

public class Consumer implements Runnable {
    private Buffer buffer;
    Thread t;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
        t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            buffer.take();
        }
    }
}
