import java.util.Arrays;

public class NumberAndSquareArray {
    public static void main(String[] args) {
        // Define the number
        int number = 5; // Change this to any desired number
        
        // Create an array to store the number and its square
        int[] numberAndSquare = new int[2];
        
        // Assign the number and its square to the array elements
        numberAndSquare[0] = number;
        numberAndSquare[1] = number * number;
        
        // Print the array
        System.out.println("Array with number and its square: " + Arrays.toString(numberAndSquare));
    }
}
