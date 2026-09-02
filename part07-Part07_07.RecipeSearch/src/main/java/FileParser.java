import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FileParser {
    public static List<Recipe> parseRecipes(String fileName) {
        List<Recipe> recipes = new ArrayList<>();
        Recipe recipe = new Recipe();
        List<String> ingredients = new ArrayList<>();
        int counter = 0;
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (counter == 0) {
                    recipe.setName(row);
                }

                if (counter == 1) {
                    recipe.setCookingTime(Integer.valueOf(row));
                }

                if (counter >= 2) {
                    ingredients.add(row);
                }

                counter++;
                if (row.isBlank()) {
                    recipe.setIngredients(ingredients);
                    recipes.add(recipe);
                    recipe = new Recipe();
                    ingredients = new ArrayList<>();
                    counter = 0;
                }
            }
            
            recipe.setIngredients(ingredients);
            recipes.add(recipe);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return recipes;
    }
}
