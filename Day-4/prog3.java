import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);

        System.out.println("Tax to be paid: Rs. " + tax);
    }

    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 150000) {
            tax = 0;
        } else if (income <= 300000) {
            tax = (income - 150000) * 0.1;
        } else if (income <= 500000) {
            tax = (150000 * 0.1) + (income - 300000) * 0.2;
        } else {
            tax = (150000 * 0.1) + (200000 * 0.2) + (income - 500000) * 0.3;
        }

        return tax;
    }
}
