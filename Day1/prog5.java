public class prog5{
    public static void main(String[] args) {
        int[][] matrixA = new int[3][3];
        int counterA = 1;
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = counterA++;
            }
        }

        int[][] matrixB = new int[3][3];
        int counterB = 9;
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = counterB--;
            }
        }

        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("Matrix B:");
        printMatrix(matrixB);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
