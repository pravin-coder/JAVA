import java.util.Scanner;
public class prog1{
    public static void main(String[] args) {
        byte byteValue = 127; 
        short shortValue = 32767; 
        int intValue = 2147483647; 
        long longValue = 9223372036854775807L;

        float floatValue = 3.14159f;
        double doubleValue = 3.141592653589793;

        char charValue = 'A'; 

        boolean booleanValue = true; // true or false

        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Char value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);
    }
}
