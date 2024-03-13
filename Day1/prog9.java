public class prog9{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The greatest of the three numbers is: " + max);
    }
}
