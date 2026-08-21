
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.valueOf(scanner.nextLine());
        int limit = Integer.valueOf(scanner.nextLine());
        
        divisibleByThreeInRange(start, limit);
    }

    public static void divisibleByThreeInRange(int start, int limit) {
        for (int i = start; i <= limit; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
