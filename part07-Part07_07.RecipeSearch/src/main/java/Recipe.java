
import java.util.List;

public class Recipe {
    private String name;
    private int cookingTime;
    List<String> ingredients;

    public Recipe(String name, int cookingTime, List<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public Recipe() {
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }

    public String getName() {
        return name;
    }

    public Integer getCookingTime() {
        return cookingTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCookingTime(Integer cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
