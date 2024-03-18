import java.util.Scanner;

public class ReverseAndAddPalindrome {
    
    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    
    // Function to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }
    
    // Function to reverse and add until a palindrome is found
    public static int reverseAndAddPalindrome(int num) {
        int originalNum = num;
        while (!isPalindrome(num)) {
            int reversed = reverseNumber(num);
            num += reversed;
            System.out.println(num);
        }
        return num;
    }

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read input number
        System.out.print("Enter the input number: ");
        int inputNumber = scanner.nextInt();
        
        // Reverse and add until a palindrome is found
        int result = reverseAndAddPalindrome(inputNumber);
        
        // Print the final palindrome
        System.out.println("Palindrome: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
