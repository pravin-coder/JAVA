// Interface with four methods
interface ArithmeticOperations {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}

// Class implementing the interface
class Calculator implements ArithmeticOperations {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return -1; // Return a default value indicating an error
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Performing arithmetic operations
        int sum = calc.add(5, 3);
        int difference = calc.sub(8, 3);
        int product = calc.mul(4, 6);
        int quotient = calc.div(20, 4);

        // Displaying results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
