package homework_6.Inesa_Mkrtchyan.Chapter_8;

class Triangle_abs extends Figure_abs{
    Triangle_abs(double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
