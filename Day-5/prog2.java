import java.util.Scanner;

public class CollegeUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of users: ");
        int totalUsers = scanner.nextInt();

        System.out.print("Enter the number of staff users: ");
        int staffUsers = scanner.nextInt();

        // Calculate the number of student users
        int studentUsers = totalUsers - staffUsers;

        // Calculate the number of non-teaching staff users
        int nonTeachingStaff = staffUsers / 3;

        System.out.println("Number of student users: " + studentUsers);
        System.out.println("Number of non-teaching staff users: " + nonTeachingStaff);
    }
}
