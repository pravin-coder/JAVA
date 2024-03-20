import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        int years = days / 365;
        int weeks = (days % 365) / 7;
        int remainingDays = (days % 365) % 7;

        System.out.println(days + " days is equal to:");
        System.out.println(years + " years, " + weeks + " weeks, and " + remainingDays + " days.");
    }
}
