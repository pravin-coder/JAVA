class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            int value = -5;
            if (value < 0) {
                throw new NegativeValueException("Negative values are not allowed");
            }
            System.out.println("Entered value: " + value);
        } catch (NegativeValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

