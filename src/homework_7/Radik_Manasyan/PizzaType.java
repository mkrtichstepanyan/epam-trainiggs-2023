package homework_7.Radik_Manasyan;

public class PizzaType {
    private static final double BASE_PRICE = 1.0;

    public static final PizzaType REGULAR =
            new PizzaType("Regular", BASE_PRICE, 0);
    public static final PizzaType CALZONE =
            new PizzaType("Calzone", BASE_PRICE, 0.5);

    private String name;
    private double price;


    PizzaType(String name, double basePrice, double additionalPrice) {
        this.name = name;
        this.price = basePrice + additionalPrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
