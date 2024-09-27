package homework_5.Galust_Arzumanyan.pizza;

public class PizzaDemo {
    public static void main(String[] args) {

        // New customer1 with 2 pizza orders
        User user = new User();
        Order order1 = new Order(user, 2);


        Pizza pizza = new Pizza("Margherita", 1);
        pizza.setQuantity(1);
        pizza.setPizzaName(pizza.getPizzaName(), order1.getOrderNumber());
        pizza.addIngredient(Ingredients.addTomatoPaste());
        pizza.addIngredient(Ingredients.addCheese());
        pizza.addIngredient(Ingredients.addGarlic());

        Pizza pizza1 = new Pizza("PepperoniOro", 3);
        pizza1.setQuantity(2);
        pizza1.setPizzaName(pizza1.getPizzaName(), order1.getOrderNumber());
        pizza1.addIngredient(Ingredients.addTomatoPaste());
        pizza1.addIngredient(Ingredients.addCheese());
        pizza1.addIngredient(Ingredients.addGarlic());

        order1.setPizzas(pizza, pizza1);


        PrintCheck check1 = new PrintCheck(order1, user);
        check1.displayOrder(pizza);
        check1.displayOrder(pizza1);


        check1.printCheck();


    }
}