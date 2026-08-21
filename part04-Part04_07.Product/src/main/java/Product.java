public class Product {
    private String initialName;
    private double initialPrice;
    private int initialQuantity;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.initialName = initialName;
        this.initialPrice = initialPrice;
        this.initialQuantity = initialQuantity;
    }

    public void printProduct() {
        System.out.printf("%s, initialPrice %f, %d pcs", initialName, initialPrice, initialQuantity);
    }
}
