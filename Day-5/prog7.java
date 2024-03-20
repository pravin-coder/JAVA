import java.util.HashSet;

public class UniquePermutations {
    public static void main(String[] args) {
        int number = 143;
        System.out.println("Unique permutations of " + number + ":");
        printUniquePermutations(number);
    }

    public static void printUniquePermutations(int number) {
        HashSet<String> set = new HashSet<>();
        permute("", String.valueOf(number), set);
        for (String permutation : set) {
            System.out.println(permutation);
        }
    }

    private static void permute(String prefix, String suffix, HashSet<String> set) {
        int n = suffix.length();
        if (n == 0) {
            set.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1, n), set);
            }
        }
    }
}
