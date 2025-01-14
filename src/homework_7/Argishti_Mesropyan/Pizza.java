package homework_7.Argishti_Mesropyan;

public class Pizza {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    private final String name;
    private final PizzaType pizzaType;
    private final Ingredient[] ingredients = new Ingredient[10];
    private int currentIngredientIndex= 0;
    private final int quantity;

    Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;

        for (int i=1; i < ingredients.length; i++) {
            this.addIngredient(ingredients[i]);
        }
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (int i = 0; i< currentIngredientIndex; i++) {
            ingredientPrice += ingredients[i].getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public void addIngredient(Ingredient ingredient) {
        if (currentIngredientIndex ==  MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Pizza is full");
            return;
        }

        for (int i = 0; i < currentIngredientIndex; i++) {
            if (ingredients[i] == ingredient) {
                System.out.println("Please, select another ingredient, this one already in use");
                return;
            }
        }
        ingredients[currentIngredientIndex] = ingredient;
        currentIngredientIndex++;

    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return pizzaType.getName();
    }

    public double getBasePrice() {
        return pizzaType.getPrice();
    }

    public int getIngredineQty() {
        return currentIngredientIndex;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
}
