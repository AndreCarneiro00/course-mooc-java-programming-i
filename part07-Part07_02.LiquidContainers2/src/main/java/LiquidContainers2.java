
import java.util.Scanner;

public class LiquidContainers2 {

    public static void print(Container first, Container second) {
        System.out.println("First: " + first.toString());
        System.out.println("Second: " + second.toString());
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        print(first, second);
        while (true) {
            // System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.contains("add")) {
                int numberToAdd = Integer.valueOf(input.split(" ")[1]);
                first.add(numberToAdd);
            } else if (input.contains("remove")) {
                int numberToRemove = Integer.valueOf(input.split(" ")[1]);
                second.remove(numberToRemove);
            } else if (input.contains("move")) {
                int numberToMove = Integer.valueOf(input.split(" ")[1]);
                first.move(numberToMove, second);
            }
            print(first, second);
        }
    }

}
