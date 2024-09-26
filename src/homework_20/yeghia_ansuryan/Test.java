package homework_20.yeghia_ansuryan;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        BoundedBlockingBuffer<Integer> boundedBlockingBuffer = new BoundedBlockingBuffer<>();

        Thread thread1 = new Thread(new InputMaker(boundedBlockingBuffer));
        Thread thread2 = new Thread(new ValueGetter(boundedBlockingBuffer));

        thread1.start();
        thread2.start();
        Thread.sleep(10000);

        System.out.println("Status of the thread 1: " + thread1.getState());
        System.out.println("Status of the thread 2: " + thread2.getState());

    }
}
