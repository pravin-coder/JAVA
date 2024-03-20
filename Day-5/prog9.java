import java.util.Scanner;

public class ReverseAddPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reverse = reverseNumber(number);
        int sum = number + reverse;

        while (!isPalindrome(sum)) {
            System.out.println(number + " + " + reverse + " = " + sum);
            number = sum;
            reverse = reverseNumber(sum);
            sum = number + reverse;
        }

        System.out.println(number + " + " + reverse + " = " + sum + " (Palindrome)");
    }

    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }

    // Function to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverse = reverseNumber(num);
        return originalNum == reverse;
    }
}
