
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int i = 0;
        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");
        while (true) {
            // System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                if (i == 0) { break; }
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
                break;
            } else if (input.contains("add")) {
                int numberToAdd = Integer.valueOf(input.split(" ")[1]);
                if (first + numberToAdd > 100) {
                    first = 100;
                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");
                    continue;
                }
                if (numberToAdd < 0) { 
                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");
                    continue;
                }
                first += numberToAdd;
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
            } else if (input.contains("remove")) {
                int numberToRemove = Integer.valueOf(input.split(" ")[1]);
                if (numberToRemove > second) {
                    second = 0;
                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");
                    continue;
                }
                second -= numberToRemove;
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
            } else if (input.contains("move")) {
                if (first == 0) {
                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");
                    continue;
                }
                int numberToMove = Integer.valueOf(input.split(" ")[1]);
                if (numberToMove < 0) {
                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");
                    continue;
                }
                int newFirst = first - numberToMove;
                int newSecond = second + numberToMove;
                if (numberToMove > first) {
                    newSecond += newFirst;
                    newFirst = 0;
                }
                if (newFirst < 0) {
                    newFirst = 0;
                }
                if (newSecond > 100) {
                    newSecond = 100;
                }
                first = newFirst;
                second = newSecond;
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
            }
        }
    }

}
