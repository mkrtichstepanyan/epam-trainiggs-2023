package homework_7.Lilit_Adamyan;

// is a
// has a
public class Pizza extends Product {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int quantity;

    public Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity, Customer customer) {
        super(name, pizzaType.getPrice(), quantity);
        if (name.length() >= 4 && name.length() <= 20) {
            this.name = customer.getName() + "_" + quantity;
        } else {
            this.name = name;
        }
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS];
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        for (Ingredient ingredient : ingredients) {
            addIngredient(ingredient);
        }
    }
    public Pizza(String name, PizzaType pizzaType, int quantity) {
        super(name, pizzaType.getPrice(),quantity);
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredients != null && ingredients.length == MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Maximum number of ingredients has been reached.");
            return;
        }
        if (ingredients == null) {
            ingredients = new Ingredient[1];
            ingredients[0] = ingredient;
        } else {
            Ingredient[] newIngredients = new Ingredient[ingredients.length + 1];
            System.arraycopy(ingredients, 0, newIngredients, 0, ingredients.length);
            newIngredients[newIngredients.length - 1] = ingredient;
            ingredients = newIngredients;
        }
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return super.calculatePrice() + this.pizzaType.getPrice() + ingredientPrice;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
