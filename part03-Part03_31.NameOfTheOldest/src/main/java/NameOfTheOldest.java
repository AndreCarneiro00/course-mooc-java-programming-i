
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        Map<Integer, String> oldestMap = new HashMap<>();
        while (true) { 
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int age = Integer.valueOf(input.split(",")[1]);
            String name = input.split(",")[0];
            oldest = Math.max(oldest, age);
            oldestMap.put(age, name);
        }
        System.out.println("Name of the oldest: " + oldestMap.get(oldest));

    }
}
