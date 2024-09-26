package homework_20.yeghia_ansuryan;

class InputMaker implements Runnable {
    BoundedBlockingBuffer buffer;

    InputMaker(BoundedBlockingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Input value is: " + i);
            buffer.put(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
