package homework_4.Anna_Manukyan.chapter_6.BoxExample;

//This class declares an object of Box4 class
public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 box1 = new Box4();
        Box4 box2 = new Box4();
        double vol;

        box1.width = 10;
        box1.height = 15;
        box1.depth = 20;

        box2.width = 10;
        box2.height = 5;
        box2.depth = 53;

        vol = box1.volume();
        System.out.println("Volume of box 1 is " + vol);

        vol = box2.volume();
        System.out.println("Volume of box 2 is " + vol);
    }
}
