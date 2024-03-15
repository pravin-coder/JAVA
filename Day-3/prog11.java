class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread T1 started.");
        if (containsEvenNumbers()) {
            try {
                System.out.println("Thread T1 contains even numbers. Putting it to sleep for 10000ms.");
                sleep(10000); // Sleep for 10000ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread T1 ended.");
    }

    private boolean containsEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                return true;
            }
        }
        return false;
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread T2 started.");
        if (containsEvenNumbers()) {
            try {
                System.out.println("Thread T2 contains even numbers. Putting it to sleep for 5000ms.");
                sleep(5000); // Sleep for 5000ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread T2 ended.");
    }

    private boolean containsEvenNumbers() {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                return true;
            }
        }
        return false;
    }
}

public class JoinOrSleepThreads {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ended.");
    }
}
