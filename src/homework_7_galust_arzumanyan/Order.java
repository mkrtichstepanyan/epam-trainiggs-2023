package homework_7_galust_arzumanyan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas = new Pizza[MAX_PIZZA_AMOUNT];
    private List<Drink> drinks = new ArrayList<>();

    Order() {
        orderNumber = initialId++;
    }

    public void addPizza(String pizzaName, PizzaType type, Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("You ordered over than maximum limit!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        pizzas[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    public void addDrink(String drinkName, DrinkType type, int quantity) {
        drinks.add(new Drink(drinkName, type, quantity));
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {
        double orderPrice = 0.0;
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                orderPrice += pizza.calculatePrice();
            }
        }
        for (Drink drink : drinks) {
            if (drink != null) {
                orderPrice += drink.calculatePrice();
            }
        }
        return orderPrice;
    }


    public void printOrderAttributes() {

        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                System.out.println("Pizza Name: " + pizza.getName() + "\n"
                        + "Pizza Type: " + pizza.getPizzaType().getName() + " "
                        + pizza.getPizzaType().getPrice() + " $" + "\n"
                        + "Ingredients: " + Arrays.toString(pizza.getIngredients()) + "\n"
                        + "Price: " + pizza.calculatePrice() + "\n"
                        + "Quantity: " + pizza.getQuantity() + "\n"
                        + "-------*************---------");
            }
        }
        if (drinks != null) {
            System.out.println("Drinks: ");
            for (Drink drink : drinks) {
                System.out.println("Drink Name: " + drink.getName() + "\n"
                        + "Bootle: " + drink.getDrinkType().getBootle() + " L" + "\n"
                        + "Price: " + drink.calculatePrice() + " $" + "\n"
                        + "Quantity: " + drink.getQuantity() + "\n"
                        + "----------************-----------");
            }
        }
    }

    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            validPizzaName = customer.getName() + "_" + pizzaIndex;
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getIndex() {
        return index;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }
}
