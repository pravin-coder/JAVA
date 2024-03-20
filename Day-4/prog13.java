// Superclass with a parameterized constructor
class Superclass {
    int value;

    // Parameterized constructor
    public Superclass(int value) {
        this.value = value;
    }
}

// Subclass hiding the member with the same name from superclass
class Subclass extends Superclass {
    int value;

    // Parameterized constructor calling superclass constructor using super()
    public Subclass(int value, int subValue) {
        super(value); // Calling superclass constructor
        this.value = subValue; // Assigning value to subclass member
    }

    // Method to display values of both superclass and subclass members
    public void displayValues() {
        System.out.println("Superclass value: " + super.value);
        System.out.println("Subclass value: " + this.value);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Subclass
        Subclass obj = new Subclass(10, 20);

        // Call displayValues method to display both superclass and subclass values
        obj.displayValues();
    }
}
