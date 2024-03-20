import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numberCount = 0;

        System.out.println("Enter characters (Enter * to stop):");

        char ch = scanner.next().charAt(0);

        while (ch != '*') {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }

            ch = scanner.next().charAt(0);
        }

        System.out.println("Number of uppercase letters: " + uppercaseCount);
        System.out.println("Number of lowercase letters: " + lowercaseCount);
        System.out.println("Number of digits: " + numberCount);
    }
}
