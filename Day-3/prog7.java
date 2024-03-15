class NonIntegerValueException extends Exception {
    public NonIntegerValueException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            double value = 5.5; // Example of non-integer value
            if (value % 1 != 0) {
                throw new NonIntegerValueException("Non-integer value: " + value);
            }
            System.out.println("Entered value: " + (int)value); // Casting to int for integer value
        } catch (NonIntegerValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
