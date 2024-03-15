public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            // Accessing an array element outside its bound
            int[] arr1 = {1, 2, 3};
            int element1 = arr1[3]; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // Iterating beyond the array length
            int[] arr2 = {4, 5, 6};
            for (int i = 0; i <= arr2.length; i++) { // ArrayIndexOutOfBoundsException
                System.out.println(arr2[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // Nested array and incorrect index
            int[][] arr3 = {{1, 2}, {3, 4}};
            int element3 = arr3[1][2]; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // Passing incorrect array to the method
            int[] arr4 = {7, 8, 9};
            printArrayElement(arr4, 3); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // Method to print array element at specified index
    public static void printArrayElement(int[] arr, int index) {
        System.out.println(arr[index]);
    }
}
