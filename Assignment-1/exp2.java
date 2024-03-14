public class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Example usage
        BankAccount account = new BankAccount(1000); // Initial balance of 1000
        System.out.println("Initial balance: " + account.getBalance());
        
        account.deposit(500); // Deposit 500
        System.out.println("Current balance after deposit: " + account.getBalance());
        
        account.withdraw(200); // Withdraw 200
        System.out.println("Current balance after withdrawal: " + account.getBalance());
        
        account.withdraw(1500); // Attempt to withdraw more than balance
        System.out.println("Final balance: " + account.getBalance());
    }
}
