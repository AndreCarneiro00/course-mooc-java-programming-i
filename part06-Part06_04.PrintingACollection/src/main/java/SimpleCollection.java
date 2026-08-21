
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) { 
            return "The collection " + name + " is empty.";
        } else if (this.elements.size() == 1)  {
            String msg = "The collection " + name + " has " + this.elements.size() + " element:";
            for (String element : this.elements) {
                msg += "\n" + element;
            }
            return msg;
        }
        else {
            String msg = "The collection " + name + " has " + this.elements.size() + " elements:";
            for (String element : this.elements) {
                msg += "\n" + element;
            }
            return msg;
        }
    }
    
}
