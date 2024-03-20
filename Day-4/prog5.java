import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveSum = 0;
        int positiveCount = 0;
        int negativeSum = 0;
        int negativeCount = 0;

        System.out.println("Enter numbers (Enter -1 to stop):");

        int number = scanner.nextInt();

        while (number != -1) {
            if (number >= 0) {
                positiveSum += number;
                positiveCount++;
            } else {
                negativeSum += number;
                negativeCount++;
            }

            number = scanner.nextInt();
        }

        double positiveAverage = positiveCount > 0 ? (double) positiveSum / positiveCount : 0;
        double negativeAverage = negativeCount > 0 ? (double) negativeSum / negativeCount : 0;

        System.out.println("Average of positive numbers: " + positiveAverage);
        System.out.println("Average of negative numbers: " + negativeAverage);
    }
}
