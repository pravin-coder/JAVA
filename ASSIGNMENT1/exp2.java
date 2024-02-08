import java.util.Scanner;

public class exp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the range from the user
        System.out.print("Enter the starting value (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the ending value (b): ");
        int b = scanner.nextInt();

        // Print composite numbers between a and b
        System.out.println("Composite numbers between " + a + " and " + b + ":");
        printCompositeNumbers(a, b);
    }

    private static void printCompositeNumbers(int a, int b) {
        // Iterate through each number in the range
        for (int i = a; i <= b; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Move to the next line after printing the numbers
    }

    private static boolean isComposite(int num) {
        // A number greater than 1 is composite if it has divisors other than 1 and itself
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return true; // It has a divisor other than 1 and itself, so it's composite
                }
            }
        }
        return false; // It's not composite
    }
}
