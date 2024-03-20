import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the limit (n): ");
        int n = scanner.nextInt();

        System.out.println("Multiplication table of " + m + " up to " + n + ":");

        for (int i = 1; i <= n; i++) {
            System.out.println(m + " * " + i + " = " + (m * i));
        }
    }
}
