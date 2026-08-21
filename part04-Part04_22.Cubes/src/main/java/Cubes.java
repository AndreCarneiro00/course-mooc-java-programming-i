
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            int convertedInput = Integer.valueOf(input);
            System.out.println(convertedInput * convertedInput * convertedInput);
        }
    }
}
