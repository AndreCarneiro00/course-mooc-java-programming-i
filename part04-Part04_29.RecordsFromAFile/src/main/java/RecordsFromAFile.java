
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String[] data = fileScanner.nextLine().split(",");
                String year = "year";
                if (Integer.valueOf(data[1]) > 1 || Integer.valueOf(data[1]) == 0) {
                    year += "s";
                }
                System.out.println(data[0] + ", age: " + data[1] + " " + year);
            }
        } catch (Exception e) {
            System.out.println();
        }
    }
}
