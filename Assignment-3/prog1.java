import java.util.HashSet;
import java.util.Set;

public class UniquePermutations {
    // Function to find unique permutations of a given number
    public static Set<Integer> uniquePermutations(int number) {
        // Convert the number to a string to iterate over its digits
        String numberStr = String.valueOf(number);
        
        // Initialize a set to store unique permutations
        Set<Integer> uniquePerms = new HashSet<>();
        
        // Generate all permutations of the digits
        permute(numberStr.toCharArray(), 0, uniquePerms);
        
        return uniquePerms;
    }
    
    // Recursive function to generate permutations
    private static void permute(char[] numArray, int index, Set<Integer> uniquePerms) {
        if (index == numArray.length - 1) {
            // Convert the array to an integer and add it to the set
            int num = Integer.parseInt(new String(numArray));
            uniquePerms.add(num);
        } else {
            for (int i = index; i < numArray.length; i++) {
                // Swap characters at index and i
                char temp = numArray[index];
                numArray[index] = numArray[i];
                numArray[i] = temp;
                
                // Recursively generate permutations
                permute(numArray, index + 1, uniquePerms);
                
                // Backtrack: restore the original order
                temp = numArray[index];
                numArray[index] = numArray[i];
                numArray[i] = temp;
            }
        }
    }
    
    // Main method to test the program
    public static void main(String[] args) {
        // Sample input
        int givenNumber = 143;
        
        // Get unique permutations
        Set<Integer> uniquePerms = uniquePermutations(givenNumber);
        
        // Print the unique permutations
        System.out.println("Permutations are: " + uniquePerms);
    }
}
