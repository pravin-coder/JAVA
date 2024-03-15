class Example {
    int num;
    String name;

    // Constructor with two parameters
    Example(int num, String name) {
        // Invoking another constructor using 'this'
        this(num);
        this.name = name;
    }

    // Constructor with one parameter
    Example(int num) {
        // Using 'this' to reference the instance variable
        this.num = num;
    }

    // Method to display the object's content
    void display(Example obj) {
        // Passing the current object as a parameter
        System.out.println("Value of num: " + obj.num);
    }

    // Method returning current object
    Example getObject() {
        // Returning the current object using 'this'
        return this;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Example class
        Example obj1 = new Example(10, "John");

        // Calling the display method
        obj1.display(obj1);

        // Returning the current object
        Example obj2 = obj1.getObject();
        System.out.println("Value of num in obj2: " + obj2.num);
        System.out.println("Name in obj1: " + obj1.name);
    }
}
