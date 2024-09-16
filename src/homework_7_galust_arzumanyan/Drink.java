package homework_7_galust_arzumanyan;

public class Drink extends Product {
    private double litre;
    private DrinkType drinkType;

    public Drink(String name, DrinkType drinkType, int quantity) {
        super(name, drinkType.getPrice(), quantity);
        this.drinkType = drinkType;
    }

    public double getLitre() {
        return litre;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

    public double calculatePrice() {
        return getQuantity() * getPrice();
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public void printProductDetails() {
        System.out.println(getName() + " (" + getLitre() + "L"
                + " " + getPrice() + " $" + ")");
    }
}