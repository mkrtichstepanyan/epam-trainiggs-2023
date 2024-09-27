package homework_20.Anush_Ananyan.BoundedBlockingBuffer;

public class Demo {
    public static void main(String[] args) {
        Buffer<String> buffer = new Buffer<>("Hi");

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);
    }
}
