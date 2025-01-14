package homework_7.Shushanik_araqelyan_pizza;



// is a
// has a
public class Pizza extends Product{
    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int quantity;
private int indexingredient ;
    Pizza(String name, PizzaType pizzaType, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public void addIngredient(Ingredient ingredient) {
        // todo implement a method tht will add ingredient into the list.

        if (indexingredient >= MAX_ALLOWED_INGREDIENTS) {
            System.out.println("The pizza is already full");

        } else {
           ingredients[indexingredient++]=ingredient;


        }

    }



    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}

