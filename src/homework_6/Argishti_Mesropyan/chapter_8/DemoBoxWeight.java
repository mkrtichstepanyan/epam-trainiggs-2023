package homework_6.Argishti_Mesropyan.chapter_8;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is: " + vol);
        System.out.println("weight of mybox1 is: "  + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is: " + vol);
        System.out.println("weight of mybox2 is: " + mybox2.weight);
    }
}
