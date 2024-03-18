class Customer {
    private int accountNo;
    private String accName;
    private int balance;

    public Customer(int accountNo, String accName, int balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }

    // Synchronized method to deposit amount
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited successfully.");
        // Notify waiting threads that deposit operation is complete
        notify();
    }

    // Synchronized method to withdraw amount
    public synchronized void withdraw(int amount) {
        // Check if requested amount is available in existing balance
        if (amount > balance) {
            try {
                // Wait for deposit to complete
                System.out.println("Insufficient balance. Waiting for deposit...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Withdraw the amount
        balance -= amount;
        System.out.println("Withdraw operation success, balance amount " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Customer object with initial balance of 10000
        Customer customer = new Customer(12345, "John", 10000);

        // Perform withdraw operation
        int withdrawAmount = 12000;
        System.out.println("Attempting to withdraw amount: " + withdrawAmount);
        new Thread(() -> customer.withdraw(withdrawAmount)).start();

        // Perform deposit operation
        int depositAmount = 3000;
        System.out.println("Depositing amount: " + depositAmount);
        new Thread(() -> customer.deposit(depositAmount)).start();
    }
}
