import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Convert binary to decimal
        int decimal = binaryToDecimal(binaryString);
        System.out.println("Decimal equivalent: " + decimal);

        // Convert binary to octal
        String octal = decimalToOctal(decimal);
        System.out.println("Octal equivalent: " + octal);
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            int digit = binary.charAt(i) - '0'; // Convert character to integer
            decimal += digit * Math.pow(2, length - i - 1);
        }

        return decimal;
    }

    public static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();

        while (decimal != 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder); // Prepend the remainder to the string
            decimal /= 8;
        }

        return octal.toString();
    }
}
