class Thread1 extends Thread {
    private int[][] matrix1;
    private int count;

    public Thread1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }

    @Override
    public void run() {
        count = countElements(matrix1);
        System.out.println("Thread T1 counted " + count + " elements.");
    }

    public int getCount() {
        return count;
    }

    private int countElements(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            count += row.length;
        }
        return count;
    }
}

class Thread2 extends Thread {
    private int[][] matrix2;
    private int count;

    public Thread2(int[][] matrix2) {
        this.matrix2 = matrix2;
    }

    @Override
    public void run() {
        count = countElements(matrix2);
        System.out.println("Thread T2 counted " + count + " elements.");
    }

    public int getCount() {
        return count;
    }

    private int countElements(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            count += row.length;
        }
        return count;
    }
}

class Thread3 extends Thread {
    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] result;

    public Thread3(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.result = new int[matrix1.length][matrix1[0].length];
    }

    @Override
    public void run() {
        try {
            // Wait for Thread4 to complete counting
            Thread4 thread4 = new Thread4();
            thread4.join();

            // Add matrices
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            // Display the result
            System.out.println("Matrix Addition (Thread T3):");
            for (int[] row : result) {
                for (int elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread4 extends Thread {
    @Override
    public void run() {
        try {
            // Simulate some work
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread T4 completed counting elements.");
    }
}

public class MatrixThreadExample {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        Thread1 t1 = new Thread1(matrix1);
        Thread2 t2 = new Thread2(matrix2);
        Thread3 t3 = new Thread3(matrix1, matrix2);
        Thread4 t4 = new Thread4();

        t1.start();
        t2.start();
        t4.start(); // Start Thread4 before Thread3

        try {
            t3.join(); // Wait for Thread3 to complete matrix addition
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ended.");
    }
}
