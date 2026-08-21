import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) { 
            String command = this.scanner.nextLine();

            switch (command) {
                case "stop":
                    return;
                case "add":
                    System.out.println("To add: ");
                    String task = this.scanner.nextLine();
                    this.todoList.add(task);
                    break;
                case "list":
                    this.todoList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    int number = Integer.valueOf(this.scanner.nextLine());
                    this.todoList.remove(number);
                    break;
                default:
                    System.out.println("Unkown command!");
            }
        }
    }
}
