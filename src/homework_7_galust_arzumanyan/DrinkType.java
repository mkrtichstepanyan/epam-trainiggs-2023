package homework_7_galust_arzumanyan;

public class DrinkType {

    public static final DrinkType COLA = new DrinkType(3, 2);
    public static final DrinkType BEER = new DrinkType(1, 1);
    public static final DrinkType VODKA = new DrinkType(2, 3);

    private int bootle;
    private double price;

    DrinkType(int bootle, double price) {
        this.bootle = bootle;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getBootle() {
        return bootle;
    }
}