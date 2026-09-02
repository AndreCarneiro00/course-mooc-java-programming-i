
import java.util.ArrayList;
import java.util.List;

public class Database {
    List<Bird> birds;
    public Database() {
        this.birds = new ArrayList<>();
    }

    public void add(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }

    public void addObservation(String name, String obs) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation(obs);
                break;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void printOne(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                break;
            }
        }
    }

    public List<Bird> getBirds() {
        return birds;
    }
}
