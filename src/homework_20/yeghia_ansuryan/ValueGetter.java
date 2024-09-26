package homework_20.yeghia_ansuryan;

public class ValueGetter implements Runnable {
    BoundedBlockingBuffer buffer;

    ValueGetter(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Output is : " + buffer.pick());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
