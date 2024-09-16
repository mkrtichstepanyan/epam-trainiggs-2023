package homework_7_galust_arzumanyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Galust");
        customer.setPhoneNumber("+37477777777");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.TOMATO_PASTE};
        Ingredient[] ingredients1 = {Ingredient.CORN};
        order.addPizza("Pizza", PizzaType.CALZONE, ingredients, 2);
        order.addDrink("Vodka", DrinkType.VODKA, 8);
        order.addDrink("Cola-Cola", DrinkType.COLA, 5);
        order.addDrink("Beer", DrinkType.BEER, 3);
        Printer.printCheck(order);
    }
}

