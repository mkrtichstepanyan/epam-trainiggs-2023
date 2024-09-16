package homework_7_galust_arzumanyan;

public class PizzaType {
    private static final double BASE_PRICE = 1.0;

    public static final PizzaType REGULAR =
            new PizzaType("Regular", BASE_PRICE, 1);
    public static final PizzaType CALZONE =
            new PizzaType("Calzone", BASE_PRICE, 1.5);

    private String name;
    private double price;

    private double additionalPrice;

    PizzaType(String name, double basePrice, double additionalPrice) {
        this.name = name;
        this.price = basePrice + additionalPrice;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }
}
