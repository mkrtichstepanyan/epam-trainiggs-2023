package homework_7.Anna_Manukyan;



// is a
// has a
public class Pizza extends Food{
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private static final double BASE_COST = 1;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int quantity;

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
        return this.pizzaType.getPrice() + ingredientPrice + BASE_COST;
    }

    public double calculateBasePrice() {
        return BASE_COST + pizzaType.getPrice();
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredients.length == MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Pizza is full");
        } else {
            isExistInPizza(ingredient);
        }
    }

    public static void printPizzaIngredients(Pizza pizza) {
        Ingredient[] pizzaIngredients = pizza.getIngredients();
        for (Ingredient ingredient : pizzaIngredients) {
            System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " €");
        }
    }

    private boolean isExistInPizza(Ingredient ingredient) {
        for (int i = 0; i < ingredients.length; i++) {
            if (ingredient.equals(ingredients[i])) {
                System.out.println("This ingredient is already exist!");
                return false;
            } else {
                ingredients[i++] = ingredient;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }
}

