import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input line from the user
        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();

        // Print special characters separately and count them
        int specialCharacterCount = printSpecialCharacters(inputLine);

        // Display the number of special characters
        System.out.println("Number of Special Characters: " + specialCharacterCount);
    }

    private static int printSpecialCharacters(String inputLine) {
        int count = 0;

        // Iterate through each character in the input line
        for (int i = 0; i < inputLine.length(); i++) {
            char ch = inputLine.charAt(i);

            // Check if the character is a special character
            if (isSpecialCharacter(ch)) {
                System.out.println("Special Character: " + ch);
                count++;
            }
        }

        return count;
    }

    private static boolean isSpecialCharacter(char ch) {
        // Check if the character is a special character (using ASCII values)
        return (ch >= 32 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 126);
    }
}
