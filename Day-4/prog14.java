public class MultiplicationTableDemo {
    public static void main(String[] args) {
        // Create threads for the multiplication tables
        Thread table5Thread = new Thread(new MultiplicationTableTask(5));
        Thread table10Thread = new Thread(new MultiplicationTableTask(10));

        // Start the threads
        table5Thread.start();
        table10Thread.start();

        // Wait for both threads to finish
        try {
            table5Thread.join();
            table10Thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Multiplication tables displayed successfully.");
    }
}

class MultiplicationTableTask implements Runnable {
    private int number;

    public MultiplicationTableTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread for table of " + number + " started.");

        // Display the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));

            // Simulate some delay
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread for table of " + number + " finished.");
    }
}
