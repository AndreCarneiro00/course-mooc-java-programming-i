import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        String longestName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parsedRow = input.split(",");
            sum += Integer.valueOf(parsedRow[1]);
            count += 1;
            if (longestName.length() - 1 < parsedRow[0].length() - 1) {
                longestName = parsedRow[0];
            }
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((1.0 * sum) / count));

    }
}
