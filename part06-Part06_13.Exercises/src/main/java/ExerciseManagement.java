import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String exercise) {
        exercises.add(new Exercise(exercise));
    }

    public void markAsComplete(String ex) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(ex)) {
                exercise.setCompleted(true);
            }
        }
    }

    public boolean isComplete(String checkCompletion) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(checkCompletion)) {
                return exercise.isCompleted();
            }
        }

        return false;
    }
}
