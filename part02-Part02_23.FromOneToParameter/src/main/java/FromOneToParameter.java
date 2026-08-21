

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    private static void printUntilNumber(int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }
    }

}
