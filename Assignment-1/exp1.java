import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();
        
        double tax = calculateIncomeTax(income);
        
        System.out.println("Income tax is: Rs. " + tax);
    }
    
    public static double calculateIncomeTax(double income) {
        double tax = 0;
        if (income <= 50000) {
            // No tax for income upto Rs. 50,000
            tax = 0;
        } else if (income <= 60000) {
            // 10% tax on additional amount above Rs. 50,000
            tax = (income - 50000) * 0.10;
        } else if (income <= 150000) {
            // 10% tax on income upto Rs. 60,000
            // 20% tax on additional amount above Rs. 60,000
            tax = 10000 + (income - 60000) * 0.20;
        } else {
            // 10% tax on income upto Rs. 60,000
            // 20% tax on income upto Rs. 1,50,000
            // 30% tax on additional amount above Rs. 1,50,000
            tax = 10000 + 18000 + (income - 150000) * 0.30;
        }
        return tax;
    }
}
