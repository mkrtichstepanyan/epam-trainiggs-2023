package homework_9.Karen_Sargsyan.pizza;

public interface AddIngredient {
    default void isDuplicate(Basic[] ingredients) {
        int indexOfIngredients = ingredients.length - 1;
        for (int i = 0; i <= indexOfIngredients; i++) {
            if (ingredients[indexOfIngredients] != null) {
                String tempIng = ingredients[i].getName();
                for (int j = 0; j <= indexOfIngredients; j++) {
                    if (ingredients[j].getName().equals(tempIng) && j != i) {
                        System.out.println(tempIng + " already exists in your list !");
                        return;
                    }
                }
            }
        }
    }

}
