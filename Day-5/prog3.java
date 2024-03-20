import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Count factors
        int factorCount = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorCount++;
            }
        }

        System.out.println("Number of factors = " + factorCount);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int nthFactor = 0;
        int factorIndex = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorIndex++;
                if (factorIndex == n) {
                    nthFactor = i;
                    break;
                }
            }
        }

        System.out.println(n + "th factor of " + number + " = " + nthFactor);
    }
}
