import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 4, 5, 6, 7};

        List<Integer> commonElements = findCommonElements(array1, array2);

        System.out.println("Common elements: " + commonElements);
    }

    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        List<Integer> commonElements = new ArrayList<>();
        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < array1.length && pointer2 < array2.length) {
            if (array1[pointer1] == array2[pointer2]) {
                commonElements.add(array1[pointer1]);
                pointer1++;
                pointer2++;
            } else if (array1[pointer1] < array2[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
            }
        }

        return commonElements;
    }
}
