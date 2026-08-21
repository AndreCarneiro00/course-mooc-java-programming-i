import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        Random draw = new Random();
        int randInt = draw.nextInt(jokes.size());
        return jokes.get(randInt);

    }

    public void printJokes() {
        System.out.println("Printing jokes:");
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
