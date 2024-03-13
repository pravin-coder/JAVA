import java.util.Scanner;
public class prog2 {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("Implicit Conversion:");
        System.out.println("Byte to Short: " + shortValue);
        System.out.println("Short to Int: " + intValue);
        System.out.println("Int to Long: " + longValue);
        System.out.println("Long to Float: " + floatValue);
        System.out.println("Float to Double: " + doubleValue);

        double doubleVal = 1234.5678;
        float floatVal = (float) doubleVal;
        long longVal = (long) doubleVal;
        int intVal = (int) longVal;
        short shortVal = (short) intVal;
        byte byteVal = (byte) shortVal;

        System.out.println("\nExplicit Conversion:");
        System.out.println("Double to Float: " + floatVal);
        System.out.println("Double to Long: " + longVal);
        System.out.println("Long to Int: " + intVal);
        System.out.println("Int to Short: " + shortVal);
        System.out.println("Short to Byte: " + byteVal);

        byte overflowByte = (byte) 129;
        byte underflowByte = (byte) -129;

        System.out.println("\nOverflow and Underflow Scenarios:");
        System.out.println("Overflow Byte: " + overflowByte);
        System.out.println("Underflow Byte: " + underflowByte);
    }
}
