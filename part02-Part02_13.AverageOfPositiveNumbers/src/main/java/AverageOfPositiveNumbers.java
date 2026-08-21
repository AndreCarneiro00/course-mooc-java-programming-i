
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num >= 0) {
                sum += num;
                count += 1;
            }
        }
        
        if (count == 0) {
            System.out.println("Cannot calculate the average");
            return;
        }
        System.out.println("Average of the numbers: " + (sum / (count * 1.0)));
    }
}
