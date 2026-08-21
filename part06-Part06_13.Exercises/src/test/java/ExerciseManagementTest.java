
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {
    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeggining() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addExercise() {
        management.add("test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("test");
        assertTrue(management.exerciseList().contains("test"));
    }

    @Test
    public void exerciseCanBeMarkedAsComplete() {
        management.add("new exercise");
        management.markAsComplete("new exercise");
        assertTrue(management.isComplete("new exercise"));
    }
}
