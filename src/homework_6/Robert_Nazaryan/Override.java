package homework_6.Robert_Nazaryan;

public class Override {
    public static void main(String[] args) {
        Overrid1 subOb = new Overrid1(1,2,3);

        subOb.show("This is k: "); //this calls show () in Overrid1
        subOb.show(); // this calls show() in Overrid

    }
}
