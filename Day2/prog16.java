public class Example<T extends Number> {
    private T value;

    // Constructor
    public Example(T value) {
        this.value = value;
    }

    // Getter method
    public T getValue() {
        return value;
    }

    // Setter method
    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // Creating an instance with Integer type parameter
        Example<Integer> intExample = new Example<>(10);
        System.out.println("Value in intExample: " + intExample.getValue());

        // Creating an instance with Double type parameter
        Example<Double> doubleExample = new Example<>(20.5);
        System.out.println("Value in doubleExample: " + doubleExample.getValue());

        // This won't compile - Attempting to use String as type parameter, which is not a subclass of Number
        // Example<String> stringExample = new Example<>("Hello");
    }
}
