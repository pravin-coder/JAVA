public class ShiftArrayValues {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {6, 7, 8, 9, 10};

        // Assuming A and B are of equal length
        if (A.length != B.length) {
            System.out.println("Arrays A and B must be of equal length.");
            return;
        }

        // Check if A is greater than B
        boolean isAGreaterThanB = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= B[i]) {
                isAGreaterThanB = false;
                break;
            }
        }

        if (isAGreaterThanB) {
            // Shift values from left to right
            for (int i = A.length - 1; i > 0; i--) {
                A[i] = A[i - 1];
                B[i] = B[i - 1];
            }
            A[0] = 0; // Assuming shift from left, so inserting 0 at the first index
            B[0] = 0;
        } else {
            // Shift values from right to left
            for (int i = 0; i < A.length - 1; i++) {
                A[i] = A[i + 1];
                B[i] = B[i + 1];
            }
            A[A.length - 1] = 0; // Assuming shift from right, so inserting 0 at the last index
            B[B.length - 1] = 0;
        }

        // Printing arrays after shifting
        System.out.println("Array A after shifting:");
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array B after shifting:");
        for (int num : B) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
