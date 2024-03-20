import java.util.Scanner;

public class SpecialCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a statement: ");
        String statement = scanner.nextLine();

        int specialCharCount = countSpecialCharacters(statement);

        System.out.println("Number of special characters: " + specialCharCount);
    }

    public static int countSpecialCharacters(String statement) {
        int specialCharCount = 0;

        // Iterate through each character in the statement
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);

            // Check if the character is a special character (not alphanumeric or whitespace)
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }

        return specialCharCount;
    }
}
