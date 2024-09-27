package homework_20.Anush_Ananyan.BoundedBlockingBuffer;

public class Buffer<T> {

    private T data;
    boolean valueSet = false;

    public Buffer(T data) {
        this.data = data;
    }

    synchronized public void put(T data) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        valueSet = true;
        System.out.println("Put: " + data);
        notifyAll();
    }

    public synchronized T take() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Take: " + data);
        valueSet = false;
        notifyAll();
        return data;
    }

    public T getData() {
        return data;
    }
}
