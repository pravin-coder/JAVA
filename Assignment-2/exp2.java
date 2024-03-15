import java.util.Arrays;

public class MaxMinSumDifference {
    
    public static int findMthMax(int[] arr, int m) {
        if (arr.length < m) {
            System.out.println("Array size is smaller than M");
            return -1;
        }
        Arrays.sort(arr);
        return arr[arr.length - m];
    }
    
    public static int findNthMin(int[] arr, int n) {
        if (arr.length < n) {
            System.out.println("Array size is smaller than N");
            return -1;
        }
        Arrays.sort(arr);
        return arr[n - 1];
    }
    
    public static void main(String[] args) {
        int[] array = {10, 5, 8, 3, 9, 2, 7, 1, 6, 4};
        int m = 3; // Mth maximum number
        int n = 2; // Nth minimum number
        
        int mthMax = findMthMax(array, m);
        int nthMin = findNthMin(array, n);
        
        if (mthMax != -1 && nthMin != -1) {
            int sum = mthMax + nthMin;
            int difference = mthMax - nthMin;
            
            System.out.println("Mth maximum number: " + mthMax);
            System.out.println("Nth minimum number: " + nthMin);
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
        }
    }
}
