import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Pages: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
        }

        System.out.println("What information will be printed?");
        String toBePrinted = scanner.nextLine();

        if (toBePrinted.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getYear());
            }
        } else if (toBePrinted.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

    }
}
