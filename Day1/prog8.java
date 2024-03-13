import java.util.Arrays;

public class prog8{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8};

        System.out.println("Original arrays:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        // Check if arrays have equal length
        int minLength = Math.min(array1.length, array2.length);
        if (array1.length != array2.length) {
            // Resize arrays to match the length of the smallest array
            array1 = Arrays.copyOf(array1, minLength);
            array2 = Arrays.copyOf(array2, minLength);
        }

        System.out.println("\nArrays after resizing:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }
}
