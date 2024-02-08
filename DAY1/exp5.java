import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of values (n)
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Get the numbers from the user
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate and display LCM and GCD
        int lcm = findLCM(numbers);
        int gcd = findGCD(numbers);

        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
    }

    private static int findLCM(int[] numbers) {
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = (lcm * numbers[i]) / findGCD(lcm, numbers[i]);
        }
        return lcm;
    }

    private static int findGCD(int[] numbers) {
        int gcd = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            gcd = findGCD(gcd, numbers[i]);
        }
        return gcd;
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
