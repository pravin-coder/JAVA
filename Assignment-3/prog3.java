import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;

    // Constructor to initialize the bank account with default balance
    public BankAccount(String depositorName, int accountNumber, String accountType) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 10000.00; // Default balance
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful.");
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (balance - amount >= 500.00) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance. Minimum balance must be maintained.");
        }
    }

    // Method to display account details and balance
    public void displayBalance() {
        System.out.println("Account Details:");
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs." + balance);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read account details
        System.out.print("Enter depositor name: ");
        String depositorName = scanner.nextLine();
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter account type (Savings/Current): ");
        String accountType = scanner.nextLine();

        // Create bank account object
        BankAccount account = new BankAccount(depositorName, accountNumber, accountType);

        // Perform transactions
        account.displayBalance(); // Display initial balance
        account.deposit(1500.00); // Deposit Rs. 1500
        account.displayBalance(); // Display balance after deposit
        account.withdraw(2000.00); // Withdraw Rs. 2000
        account.displayBalance(); // Display balance after withdrawal

        // Close the scanner
        scanner.close();
    }
}
