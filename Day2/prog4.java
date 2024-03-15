public class MethodOverloadingDemo {
    
    // Method overloading by increasing and decreasing number of parameters
    public int sum(int a, int b) {
        return a + b;
    }
    
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method overloading by changing the data types of parameters
    public double sum(double a, double b) {
        return a + b;
    }
    
    // Method overloading by interchanging the parameters
    public int sum(int b, double a) {
        return (int)(a + b);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        // Method calls
        System.out.println("Sum of 2 numbers: " + obj.sum(5, 10));
        System.out.println("Sum of 3 numbers: " + obj.sum(5, 10, 15));
        System.out.println("Sum of 2 double numbers: " + obj.sum(5.5, 10.5));
        System.out.println("Sum of an int and a double: " + obj.sum(5, 10.5));
    }
}
