import java.util.Scanner;

public class PrimeNumbersAfterNth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int count = 0;
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == n) {
                    System.out.println(n + "th Prime number is " + num);
                    System.out.print(n + " prime numbers after " + num + " are: ");
                    printNPrimeNumbersAfter(num, n);
                    break;
                }
            }
            num++;
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print n prime numbers after a given prime number
    public static void printNPrimeNumbersAfter(int prime, int n) {
        int count = 0;
        int num = prime + 1;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + ", ");
                count++;
            }
            num++;
        }
    }
}
