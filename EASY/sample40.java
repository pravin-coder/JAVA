import java.util.Scanner;
public class sample40{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int size = input.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("$ ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}
