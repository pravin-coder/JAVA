import java.util.Arrays;

abstract class AbstractStatistics {
    // Abstract methods
    abstract int[] total(int[] arr);
    abstract double average(int[] arr);

    // Concrete methods
    double mean(int[] arr) {
        int[] totalArray = total(arr);
        double avg = average(arr);
        return (double) totalArray[0] / arr.length;
    }

    int mode(int[] arr) {
        Arrays.sort(arr);
        int mode = arr[0];
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        return mode;
    }

    double median(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            return (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
        }
    }
}

class ConcreteStatistics extends AbstractStatistics {
    @Override
    int[] total(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return new int[] { sum };
    }

    @Override
    double average(int[] arr) {
        int[] totalArray = total(arr);
        return (double) totalArray[0] / arr.length;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 3, 1, 4, 2, 5, 3, 6, 4, 7 };

        ConcreteStatistics stats = new ConcreteStatistics();

        int[] totalArray = stats.total(numbers);
        double average = stats.average(numbers);
        double mean = stats.mean(numbers);
        int mode = stats.mode(numbers);
        double median = stats.median(numbers);

        System.out.println("Total: " + totalArray[0]);
        System.out.println("Average: " + average);
        System.out.println("Mean: " + mean);
        System.out.println("Mode: " + mode);
        System.out.println("Median: " + median);
    }
}
