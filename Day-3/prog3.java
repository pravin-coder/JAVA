import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            // Parsing a Non-Numeric String
            String str1 = "abc";
            int number1 = Integer.parseInt(str1); // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        try {
            // Reading User Input Without Validation
            String userInput = "123abc";
            int number2 = Integer.parseInt(userInput); // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        try {
            // Formatting Issues in "Decimal Format"
            NumberFormat nf = new DecimalFormat("#.##");
            String str3 = "12.3.4";
            Number number3 = nf.parse(str3); // ParseException -> NumberFormatException
        } catch (ParseException e) {
            System.out.println("ParseException: " + e.getMessage());
        }

        try {
            // Incorrectly using localized decimal separators
            String str4 = "1,234.56";
            NumberFormat nf = NumberFormat.getInstance(); // Default locale
            double number4 = nf.parse(str4).doubleValue(); // NumberFormatException
        } catch (ParseException e) {
            System.out.println("ParseException: " + e.getMessage());
        }
    }
}
