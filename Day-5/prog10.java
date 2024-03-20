class Customer {
    private int accountNo;
    private String accName;
    private double balance;

    // Constructor
    public Customer(int accountNo, String accName, double balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }

    // Synchronized method to deposit
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of Rs." + amount + " successful. New balance: Rs." + balance);
        notify(); // Notify waiting threads
    }

    // Synchronized method to withdraw
    public synchronized void withdraw(double amount) {
        try {
            if (balance < amount) {
                System.out.println("Insufficient balance. Waiting for deposit to complete...");
                wait(); // Wait for deposit to complete
            }
            balance -= amount;
            System.out.println("Withdrawal of Rs." + amount + " successful. New balance: Rs." + balance);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Customer object with initial balance of 10000
        Customer customer = new Customer(101, "John Doe", 10000);

        // Input amount for withdraw operation
        double withdrawAmount = 12000;

        // Creating a thread for withdrawal operation
        Thread withdrawThread = new Thread(() -> {
            customer.withdraw(withdrawAmount);
        });

        // Input amount for deposit operation
        double depositAmount = 3000;

        // Creating a thread for deposit operation
        Thread depositThread = new Thread(() -> {
            customer.deposit(depositAmount);
        });

        // Starting withdrawal thread
        withdrawThread.start();

        // Starting deposit thread
        depositThread.start();
    }
}
