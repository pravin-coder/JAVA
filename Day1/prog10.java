public class prog10{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        if (a > b) {
            if (a > c) {
                System.out.println("The greatest value is in the first if statement (a > b && a > c)");
            } else {
                System.out.println("The greatest value is in the third if statement (c > a)");
            }
        } else {
            if (b > c) {
                System.out.println("The greatest value is in the second if statement (b > c)");
            } else {
                System.out.println("The greatest value is in the third if statement (c > a)");
            }
        }
    }
}
