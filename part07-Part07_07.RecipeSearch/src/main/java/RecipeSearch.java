
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String filename = scanner.nextLine();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        List<Recipe> recipes = FileParser.parseRecipes(filename);
        while (true) { 
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if (command.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    recipe.print();
                }
            }

            if (command.equals("find name")) {
                System.out.println("Searched word:");
                String searchedWord = scanner.nextLine();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(searchedWord)) {
                        recipe.print();
                    }
                }
            }

            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                Integer maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getCookingTime() <= maxCookingTime) {
                        recipe.print();
                    }
                }
            }

            if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        recipe.print();
                    }
                }
            }

            if (command.equals("stop")) {
                break;
            }

            
        }

    }

}
