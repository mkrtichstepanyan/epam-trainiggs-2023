package homework_6.Anushik_Gevorgyan.chapter_8;

class BoxWeight1 extends Box1 {
    double weight;

    BoxWeight1(BoxWeight1 ob) {
        super();
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

}
