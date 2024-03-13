import java.util.Scanner;
public class prog3 {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String("Hello");
        char[] charArray = {'W', 'o', 'r', 'l', 'd'};
        String str3 = new String(charArray);
        byte[] byteArray = {65, 66, 67, 68, 69};
        String str4 = new String(byteArray);

        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 2 in str2: " + str2.charAt(2));
        System.out.println("Index of 'l' in str3: " + str3.indexOf('l'));
        System.out.println("Substring of str2 from index 1 to 3: " + str2.substring(1, 4));
        System.out.println("Concatenation of str2 and str3: " + str2.concat(str3));
        System.out.println("Uppercase of str2: " + str2.toUpperCase());
        System.out.println("Lowercase of str3: " + str3.toLowerCase());
        System.out.println("Replacing 'o' with 'i' in str2: " + str2.replace('o', 'i'));
        System.out.println("Splitting str4 using space: ");
        String[] strArray = str4.split(" ");
        for (String s : strArray) {
            System.out.println(s);
        }
        System.out.println("Checking if str1 is empty: " + str1.isEmpty());
        System.out.println("Comparing str2 and str3: " + str2.compareTo(str3));
        System.out.println("Checking if str2 starts with 'He': " + str2.startsWith("He"));
        System.out.println("Checking if str4 ends with 'E': " + str4.endsWith("E"));
    }
}
