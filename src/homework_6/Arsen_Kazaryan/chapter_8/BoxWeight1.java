package homework_6.Arsen_Kazaryan.chapter_8;

public class BoxWeight1 extends Box{
    double weight;

    BoxWeight1(homework_6.Davit_Poghosyan.chapter_8.BoxWeight1 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight1() {
        super();
        weight = -1;
    }

    BoxWeight1(double len, double m) {
        super(len);
        weight = m;
    }

    public BoxWeight1(BoxWeight1 mybox1) {

    }
}
