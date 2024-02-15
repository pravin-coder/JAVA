import java.util.Scanner;
public class sample41{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int n = input.nextInt();
        System.out.print("Enter " + n + " digit number: ");
        int num = input.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        while (sum > 9) {
            int tempSum = 0;
            while (sum > 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }
        System.out.println("Sum of " + n + " digit number: " + sum);
    }
}
