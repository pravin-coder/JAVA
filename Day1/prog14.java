public class prog14{
    public static void main(String[] args) {
        int[] series = {1, 5, 11, 19};

        System.out.println("Missing numbers in the series:");

        // Iterate through the series to find missing numbers
        for (int i = 0; i < series.length - 1; i++) {
            int currentNumber = series[i];
            int nextNumber = series[i + 1];

            // Check if there are missing numbers between current and next number
            if (nextNumber - currentNumber > 1) {
                int missingCount = nextNumber - currentNumber - 1;
                for (int j = 1; j < missingCount + 1; j++) {
                    int missingNumber = currentNumber + j;
                    System.out.print(missingNumber + " ");
                }
            }
        }
    }
}
