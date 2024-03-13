public class prog13{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        if (a > b) {
            if (a > c) {
                System.out.println("The greatest value is in the first loop (a > b && a > c)");
            } else {
                System.out.println("The greatest value is in the third loop (c > a)");
            }
        } else {
            if (b > c) {
                System.out.println("The greatest value is in the second loop (b > c)");
            } else {
                System.out.println("The greatest value is in the third loop (c > a)");
            }
        }
    }
}
