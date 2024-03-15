class WaitingThread extends Thread {
    private long startTime;
    private long waitingTime;

    @Override
    public void run() {
        startTime = System.nanoTime();
        try {
            synchronized (this) {
                wait(2000); // Wait for 2 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitingTime = System.nanoTime() - startTime;
    }

    public long getWaitingTime() {
        return waitingTime;
    }
}

class SleepingThread extends Thread {
    private long startTime;
    private long sleepingTime;

    @Override
    public void run() {
        startTime = System.nanoTime();
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sleepingTime = System.nanoTime() - startTime;
    }

    public long getSleepingTime() {
        return sleepingTime;
    }
}

public class ThreadTimeComparison {
    public static void main(String[] args) throws InterruptedException {
        WaitingThread waitingThread = new WaitingThread();
        SleepingThread sleepingThread = new SleepingThread();

        waitingThread.start();
        sleepingThread.start();

        waitingThread.join();
        sleepingThread.join();

        long waitingTime = waitingThread.getWaitingTime();
        long sleepingTime = sleepingThread.getSleepingTime();

        System.out.println("Waiting Thread Time: " + waitingTime + " nanoseconds");
        System.out.println("Sleeping Thread Time: " + sleepingTime + " nanoseconds");

        if (waitingTime > sleepingTime) {
            System.out.println("Waiting Thread spent more time waiting.");
        } else if (waitingTime < sleepingTime) {
            System.out.println("Sleeping Thread spent more time sleeping.");
        } else {
            System.out.println("Both threads spent the same amount of time.");
        }
    }
}
