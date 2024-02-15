import java.util.Arrays;
import java.util.Scanner;
public class sample38{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String inputWord = input.nextLine();
        char[] charArray =inputWord.toCharArray();
        Arrays.sort(charArray);
        System.out.print("Alphabetical Order: ");
        for (int i =0;i<charArray.length;i++) {
            System.out.print(charArray[i] + " ");
        }
    }
}
