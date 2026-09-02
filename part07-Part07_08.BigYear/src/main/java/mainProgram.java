
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        Database db = new Database();
        while (true) { 
            System.out.println("?");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();

                System.out.println("Name in Latin:");
                String latinName = scan.nextLine();

                db.add(name, latinName);
            }

            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();

                db.addObservation(name, "Obs");
            }

            if (command.equals("All")) {
                db.printAll();
            }

            if (command.equals("One")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                db.printOne(name);
            }
        }
    }

}
