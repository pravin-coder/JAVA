public class Box<T> {
    private T value;

    // Constructor
    public Box(T value) {
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
        // Creating a Box object with Integer type parameter
        Box<Integer> intBox = new Box<>(10);
        
        // Getting the value
        int value = intBox.getValue();
        System.out.println("Value in intBox: " + value);

        // Creating a Box object with String type parameter
        Box<String> strBox = new Box<>("Hello");
        
        // Getting the value
        String strValue = strBox.getValue();
        System.out.println("Value in strBox: " + strValue);
    }
}
