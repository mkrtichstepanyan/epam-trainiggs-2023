package homework_5.Galust_Arzumanyan.pizza;

public class Order {
    private int orderNumber;
    private User user;
    private int pizzaCount;
    private Pizza[] pizzas;

    public Order(User customer) {
        this.orderNumber = (int) Math.floor(Math.random() * 90000) + 10000;
        this.user = customer;
        this.pizzaCount = 10;
        this.pizzas = new Pizza[10];
    }

    public Order(User customer, int pizzaCount) {
        this.orderNumber = (int) Math.floor(Math.random() * 90000) + 10000;
        this.user = customer;
        this.pizzaCount = pizzaCount;
        this.pizzas = new Pizza[pizzaCount];
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getPizzaCount() {
        return pizzaCount;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza... pizza) {
        if (pizzaCount > 10) {
            System.out.println("You can order maximum 10 pizzas");
            pizzaCount = 10;
        } else if (pizza == null) {
            System.out.println("You don't choose any pizza");
            pizzaCount = 1;
        }
        for (int i = 0; i < pizzas.length; i++) {
            this.pizzas = pizza;
        }
    }
}
