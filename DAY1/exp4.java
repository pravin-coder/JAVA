import java.util.Scanner;

public class exp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the age from the user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check eligibility and calculate years left if not eligible
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("You are not eligible to vote. You need to wait for " + yearsLeft + " more years.");
        }
    }
}
