package homework_4.Arsen_Kazaryan.chapter_6;

public class BoxDemo6 {
    public static void main(String[] args) {

        Box myBox1 = new Box();
        Box myBox2 = new Box();

        double volume;

        volume = myBox1.volume();
        System.out.println("Volume = " + volume);

        volume = myBox2.volume();
        System.out.print("Volume = " + volume);
    }
}
