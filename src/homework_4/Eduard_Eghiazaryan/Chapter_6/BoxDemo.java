
package homework_4.Eduard_Eghiazaryan.Chapter_6;


public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.depth * mybox.height * mybox.width;
        System.out.println("Volume is: " + vol);
    }
}
