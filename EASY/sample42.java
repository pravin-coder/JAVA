import java.util.Scanner;
public class sample42{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        double squareRoot = Math.sqrt(number);
        if (squareRoot % 1 == 0) {
            System.out.println("Square Root: " + (int)squareRoot + ", " + -(int)squareRoot);
        } else {
            System.out.println("The entered number is not a perfect square.");
        }
    }
}
