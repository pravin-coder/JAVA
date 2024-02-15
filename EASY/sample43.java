import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for Matrix A (2x2):");
        int[][] matrixA = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements for Matrix B (2x2):");
        int[][] matrixB = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("B[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }
        int[][] resultMatrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("Result Matrix (C):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
