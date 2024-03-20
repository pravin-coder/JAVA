import java.util.ArrayList;
import java.util.List;

public class PerfectNumbers {
    public static void main(String[] args) {
        int n = 5; // Number of perfect numbers to find
        List<Integer> perfectNumbers = findPerfectNumbers(n);

        System.out.println("First " + n + " perfect numbers:");
        for (int number : perfectNumbers) {
            System.out.println(number);
        }
    }

    public static List<Integer> findPerfectNumbers(int n) {
        List<Integer> perfectNumbers = new ArrayList<>();
        int number = 1;

        while (perfectNumbers.size() < n) {
            if (isPerfectNumber(number)) {
                perfectNumbers.add(number);
            }
            number++;
        }

        return perfectNumbers;
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 1; // 1 is a proper divisor for every positive integer
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}
