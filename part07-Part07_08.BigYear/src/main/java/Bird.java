
import java.util.ArrayList;
import java.util.List;

public class Bird {
    private String name;
    private String latinName;
    private List<String> observations;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public List<String> getObservation() {
        return observations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public void addObservation(String observation) {
        observations.add(observation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" (");
        sb.append(latinName);
        sb.append("): ");
        sb.append(observations.size());
        sb.append(" observations");
        return sb.toString();
    }
}
