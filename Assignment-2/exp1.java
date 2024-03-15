import java.util.Scanner;

public class PrimeCompositeCounter {
    
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primes = 0;
        int composites = 0;
        
        while (true) {
            System.out.print("Enter a number (or 'q' to quit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q"))
                break;
            
            try {
                int num = Integer.parseInt(input);
                if (isPrime(num))
                    primes++;
                else
                    composites++;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'q' to quit.");
            }
        }
        
        scanner.close();
        
        System.out.println("Number of prime numbers entered: " + primes);
        System.out.println("Number of composite numbers entered: " + composites);
    }
}
