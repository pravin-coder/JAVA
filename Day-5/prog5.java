import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectSquareWithDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();

        List<Integer> resultList = findNumbers(lowerRange, upperRange);

        System.out.println(resultList);
    }

    public static List<Integer> findNumbers(int lowerRange, int upperRange) {
        List<Integer> result = new ArrayList<>();

        for (int i = lowerRange; i <= upperRange; i++) {
            if (isPerfectSquare(i) && sumOfDigits(i) < 10) {
                result.add(i);
            }
        }

        return result;
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
