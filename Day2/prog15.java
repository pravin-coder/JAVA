public class Util {
    // Generic method to compare two objects
    public static <T> boolean isEqual(T object1, T object2) {
        return object1.equals(object2);
    }

    // Generic method to print an array of any type
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example of using isEqual method with Integer objects
        Integer int1 = 5;
        Integer int2 = 5;
        System.out.println("Is 5 equal to 5? " + Util.isEqual(int1, int2));

        // Example of using isEqual method with String objects
        String str1 = "hello";
        String str2 = "world";
        System.out.println("Are 'hello' and 'world' equal? " + Util.isEqual(str1, str2));

        // Example of using printArray method with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer array: ");
        Util.printArray(intArray);

        // Example of using printArray method with String array
        String[] strArray = {"apple", "banana", "orange"};
        System.out.print("String array: ");
        Util.printArray(strArray);
    }
}
