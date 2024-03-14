public class MedianFinder {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] arr2 = {20, 18, 16, 14, 12, 10, 8, 6, 4, 2};

        int median = findMedian(arr1, arr2);
        System.out.println("Median: " + median);
    }

    public static int findMedian(int[] arr1, int[] arr2) {
        int index1 = 0;
        int index2 = arr2.length - 1;

        while (index1 < arr1.length && index2 >= 0) {
            if (arr1[index1] == arr2[index2]) {
                return arr1[index1]; // Median found
            }
            index1++;
            index2--;
        }

        return -1; // If median not found
    }
}

