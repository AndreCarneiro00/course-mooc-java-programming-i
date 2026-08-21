
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) { 
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] splitted = input.split(" ");
            System.out.println(splitted[splitted.length - 1]);
        }

    }
}
