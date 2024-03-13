import java.util.Arrays;

public class prog7 {
    public static void main(String[] args) {
        // Create a 2D matrix using Arrays class
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the 2D matrix
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
