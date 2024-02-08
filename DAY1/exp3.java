import java.util.Scanner;

public class exp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);

        System.out.println("Reverse Number: " + reversedNumber);
    }

    private static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            // Extract the last digit of the number
            int digit = number % 10;

            // Build the reversed number by multiplying the current reversed number by 10
            // and adding the extracted digit
            reversedNumber = reversedNumber * 10 + digit;

            // Remove the last digit from the original number
            number = number / 10;
        }

        return reversedNumber;
    }
}
