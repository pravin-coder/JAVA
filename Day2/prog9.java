class Example {
    // Static variable
    static int staticVar = 10;
    
    // Static method
    static void staticMethod() {
        System.out.println("Inside static method");
    }
    
    // Static block
    static {
        System.out.println("Inside static block");
    }
    
    // Static nested class
    static class StaticNested {
        void display() {
            System.out.println("Value of staticVar: " + staticVar);
        }
    }
    
    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Static variable: " + staticVar);
        
        // Calling static method
        staticMethod();
        
        // Creating an instance of the static nested class and calling its method
        StaticNested nestedObj = new StaticNested();
        nestedObj.display();
    }
}
