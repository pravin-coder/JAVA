class Superclass {
    int num = 10;

    // Superclass constructor
    Superclass() {
        System.out.println("Inside superclass constructor");
    }

    // Superclass method
    void display() {
        System.out.println("Superclass method: num = " + num);
    }
}

class Subclass extends Superclass {
    int num = 20;

    // Subclass constructor
    Subclass() {
        // Calling superclass constructor using 'super'
        super();
        System.out.println("Inside subclass constructor");
    }

    // Subclass method
    void display() {
        // Accessing superclass member variable using 'super'
        System.out.println("Subclass method: num = " + super.num);

        // Invoking superclass method using 'super'
        super.display();
    }

    // Method to demonstrate calling superclass constructor and accessing superclass members
    void callSuperclass() {
        // Accessing superclass member variable using 'super'
        System.out.println("Value of num in superclass: " + super.num);

        // Calling superclass method using 'super'
        super.display();
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Subclass
        Subclass obj = new Subclass();

        // Calling subclass method
        obj.display();

        // Calling method to demonstrate calling superclass constructor and accessing superclass members
        obj.callSuperclass();
    }
}
