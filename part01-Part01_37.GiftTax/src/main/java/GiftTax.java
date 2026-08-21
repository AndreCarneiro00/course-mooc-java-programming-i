
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());

        int lowerLimitTax = 0;
        double excedingPartTax = 0;
        if (gift < 5_000) {
            System.out.println("No tax!");
            return;
        }
        else if (gift <= 25_000) {
            lowerLimitTax = 100;
            excedingPartTax = calculateExcedingPartTax(gift, 5_000, 0.08);
        } else if (gift <= 55_000) {
            lowerLimitTax = 1_700;
            excedingPartTax = calculateExcedingPartTax(gift, 25_000, 0.1);
        } else if (gift <= 200_000) {
            lowerLimitTax = 4_700;
            excedingPartTax = calculateExcedingPartTax(gift, 55_000, 0.12);
        } else if (gift <= 1_000_000) {
            lowerLimitTax = 22_100;
            excedingPartTax = calculateExcedingPartTax(gift, 200_000, 0.15);
        } else {
            lowerLimitTax = 142_100;
            excedingPartTax = calculateExcedingPartTax(gift, 1_000_000, 0.17);
        }

        System.out.println("Tax: " + (lowerLimitTax + excedingPartTax));
    }

    private static double calculateExcedingPartTax(int gift, int giftFloor, double taxPercentage) {
        return (gift - giftFloor) * taxPercentage;
    }
}
