public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            // Divided by Zero
            int result1 = 10 / 0; // ArithmeticException: / by zero
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            // Logarithm of negative or Zero
            double result2 = Math.log(-1); // ArithmeticException: NaN
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            // Tan 90 Degree
            double result3 = Math.tan(Math.toRadians(90)); // ArithmeticException: Infinity
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            // Zero power Zero
            double result4 = Math.pow(0, 0); // ArithmeticException: NaN
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
