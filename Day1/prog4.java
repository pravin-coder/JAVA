import java.util.Scanner;
public class prog4{
    public static void main(String[] args) {
        // Example of StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World");
        System.out.println("StringBuilder: " + stringBuilder.toString());

        // Example of StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");
        System.out.println("StringBuffer: " + stringBuffer.toString());

        // Performance comparison
        int iterations = 100000;
        long startTime, endTime;

        // StringBuilder performance
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilderPerformance = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilderPerformance.append("Hello");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " milliseconds");

        // StringBuffer performance
        startTime = System.currentTimeMillis();
        StringBuffer stringBufferPerformance = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBufferPerformance.append("Hello");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " milliseconds");
    }
}
