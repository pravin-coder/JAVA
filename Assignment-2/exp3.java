import java.util.HashMap;
import java.util.Map;

public class ATM {
    
    public static int calculateTotalAmount(Map<Integer, Integer> denominations) {
        int totalAmount = 0;
        for (Map.Entry<Integer, Integer> entry : denominations.entrySet()) {
            int denomination = entry.getKey();
            int count = entry.getValue();
            totalAmount += denomination * count;
        }
        return totalAmount;
    }
    
    public static void main(String[] args) {
        // Denominations and their counts in the ATM
        Map<Integer, Integer> denominations = new HashMap<>();
        denominations.put(2000, 50); // Number of Rs. 2000 notes
        denominations.put(500, 100);  // Number of Rs. 500 notes
        denominations.put(200, 150);  // Number of Rs. 200 notes
        denominations.put(100, 200);  // Number of Rs. 100 notes
        
        int totalAmount = calculateTotalAmount(denominations);
        System.out.println("Total amount available in the ATM: Rs." + totalAmount);
    }
}
