class ArmstrongThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread T1 (Armstrong numbers) started.");
        try {
            // Using thread.sleep to simulate some work
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generateArmstrongNumbers();
        System.out.println("Thread T1 (Armstrong numbers) ended.");
    }

    private void generateArmstrongNumbers() {
        // Generate Armstrong numbers (example implementation)
        for (int num = 1; num <= 1000; num++) {
            int sum = 0;
            int temp = num;
            int digits = String.valueOf(num).length();
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println("Armstrong number: " + num);
            }
        }
    }
}

class FibonacciThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread T2 (Fibonacci series) started.");
        try {
            // Using thread.sleep to simulate some work
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generateFibonacciSeries();
        System.out.println("Thread T2 (Fibonacci series) ended.");
    }

    private void generateFibonacciSeries() {
        // Generate Fibonacci series (example implementation)
        int n = 10; // Number of Fibonacci numbers to generate
        int a = 0, b = 1;
        System.out.println("Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

public class ThreadLifecycleExample {
    public static void main(String[] args) {
        ArmstrongThread t1 = new ArmstrongThread();
        FibonacciThread t2 = new FibonacciThread();

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ended.");
    }
}
