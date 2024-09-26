package homework_20.yeghia_ansuryan;

public class BoundedBlockingBuffer <T extends Integer> {
    private double number;

    private boolean valueSet;

    public synchronized void put(T data) {
        System.out.println("put has been called");
        if (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number = data.doubleValue();
//            this.number *= data;
        System.out.println("the put(): ' after initialization ' : " + number);
        valueSet = true;
        notify();
    }

    public synchronized double pick() {
        if (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = false;
        notify();
        return number;
    }
}
