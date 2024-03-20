import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Constructor
    public BankAccount(String depositorName, String accountNumber, String accountType) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 1000.00; // Initial balance set to 1000
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (balance - amount >= 500.00) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Minimum balance must be maintained.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Account Holder Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs." + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter depositor name: ");
        String depositorName = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account type (Savings/Current): ");
        String accountType = scanner.nextLine();

        BankAccount account = new BankAccount(depositorName, accountNumber, accountType);

        System.out.println("Account created successfully.");

        // Displaying balance
        account.displayBalance();

        // Depositing amount
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Displaying balance after deposit
        account.displayBalance();

        // Withdrawing amount
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(with
