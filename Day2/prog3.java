class Base {
    // Method to calculate and print the area of a square
    void area(int a) {
        int area = a * a;
        System.out.println("Area of square: " + area);
    }
}

class Derived extends Base {
    // Override the method to calculate and print the area of a rectangle
    @Override
    void area(int a, int b) {
        int area = a * b;
        System.out.println("Area of rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Base baseObj = new Base();
        baseObj.area(5); // Calls the method in Base class, prints area of square
        
        Derived derivedObj = new Derived();
        derivedObj.area(4, 6); // Calls the overridden method in Derived class, prints area of rectangle
    }
}
