package homework_20.Anush_Ananyan.Chapter_11.SynchronizedBlock;

public class Callme {
    protected void call (String msg){
        System.out.print("[" + msg );
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.print("]");
    }
}
