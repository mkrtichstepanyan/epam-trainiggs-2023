package homework_5.Galust_Arzumanyan.pizza;

public class PrintCheck {
    private final Pizza[] pizzas;
    private final Order order;
    private final User customer;
    private double pizzaPrice = 0;


    PrintCheck(Order order, User customer) {
        this.order = order;
        this.customer = customer;
        this.pizzas = order.getPizzas();
    }


    public void displayOrder(Pizza pizza) {
        System.out.println("[" + order.getOrderNumber() + " : " + customer.getCustomerNumber() + " : " + pizza.getPizzaName() + " : " + pizza.getQuantity() + "]");
    }


    public void printCheck() {
        System.out.println("*********************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Customer: " + customer.getCustomerNumber());
        for (Pizza pizza : pizzas) {
            System.out.println("Pizza: " + pizza.getPizzaName());
            System.out.println("-----------------------------------");
            System.out.println("Pizza Base " + pizza.getPizzaType() + " " + pizza.getCrustCost());
            for (Ingredients ing : pizza.getIngredients()) {
                if (ing == null) {
                    break;
                } else {
                    System.out.println(ing.getToppingName() + " " + ing.getToppingCost());
                }
            }
            System.out.println("-----------------------------------");
            System.out.println("Amount " + pizza.calculatePizzaCost());
            System.out.println("Quantity " + pizza.getQuantity());

            pizzaPrice += pizza.calculatePizzaCost() * pizza.getQuantity();
        }
        System.out.println("**************************************");
        System.out.println("Total amount: " + pizzaPrice);
        System.out.println();
    }
}
