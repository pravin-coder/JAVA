class InvalidDecimalNumberException extends Exception {
    public InvalidDecimalNumberException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            double value = -5.5;
            if (value < 0 || value % 1 != 0) {
                throw new InvalidDecimalNumberException("Invalid decimal number: " + value);
            }
            System.out.println("Entered value: " + value);
        } catch (InvalidDecimalNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
