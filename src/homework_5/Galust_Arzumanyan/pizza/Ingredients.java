package homework_5.Galust_Arzumanyan.pizza;

public class Ingredients {
    private String toppingName;
    private double toppingCost;

    Ingredients(String toppingName, double toppingCost) {
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    public String getToppingName() {

        return toppingName;
    }

    public double getToppingCost() {

        return toppingCost;
    }

    public static Ingredients addTomatoPaste() {

        return new Ingredients("Tomato paste", 1);
    }

    public static Ingredients addCheese() {

        return new Ingredients("Cheese", 1);
    }

    public static Ingredients addSalami() {

        return new Ingredients("Salami", 1.5);
    }

    public static Ingredients addBacon() {

        return new Ingredients("Bacon", 1.2);
    }

    public static Ingredients addGarlic() {

        return new Ingredients("Garlic", 0.3);
    }

    public static Ingredients addCorn() {

        return new Ingredients("Corn", 0.7);
    }

    public static Ingredients addPepperoni() {

        return new Ingredients("Pepperoni", 0.6);
    }

    public static Ingredients addOlives() {

        return new Ingredients("Olives", 0.5);
    }

}
