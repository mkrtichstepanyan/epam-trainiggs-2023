package homework_20.Anush_Ananyan.BoundedBlockingBuffer;

public class Producer implements Runnable {
    private Buffer buffer;
    Thread t;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
        t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        buffer.put(buffer.getData());
    }
}

