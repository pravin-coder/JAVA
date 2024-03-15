import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting char input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Getting String input
        System.out.print("Enter a string: ");
        String str = scanner.next();

        // Getting int input
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Getting float input
        System.out.print("Enter a float number: ");
        float floatValue = scanner.nextFloat();

        // Getting double input
        System.out.print("Enter a double number: ");
        double doubleValue = scanner.nextDouble();

        // Displaying inputs
        System.out.println("Character: " + ch);
        System.out.println("String: " + str);
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);

        // Closing scanner
        scanner.close();
    }
}
