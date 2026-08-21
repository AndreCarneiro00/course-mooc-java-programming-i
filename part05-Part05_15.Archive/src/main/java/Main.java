
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> identifiers = new ArrayList<>();

        System.out.println("==Items==");
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String archiveId = scanner.nextLine();
            
            if (archiveId.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }

            if (identifiers.contains(archiveId)) {
                continue;
            }

            identifiers.add(archiveId);
            System.out.println(archiveId + ": " + name);
        }

    }
}
