class Parent {
    int a, b;

    // Default constructor
    Parent() {
        this.a = 10;
        this.b = 15;
    }

    // Parameterized constructor
    Parent(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to display values
    public void disp() {
        System.out.println("a = " + a + ", b = " + b);
    }
}

class Child extends Parent {
    // Default constructor overriding
    Child() {
        super(20, 25); // Calling parameterized constructor of the parent class
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects using both constructors and call disp() method
        Parent defaultParent = new Parent();
        defaultParent.disp();

        Parent paramParent = new Parent(20, 25);
        paramParent.disp();

        // Create object of child class
        Child child = new Child();
        child.disp(); // Calls disp() method from the parent class
    }
}
