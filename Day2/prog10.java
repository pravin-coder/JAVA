class Example {
    // Final variable
    final int finalVar = 10;
    
    // Final method
    final void finalMethod() {
        System.out.println("Inside final method");
    }
}

// Final class
final class FinalClass {
    void display() {
        System.out.println("Inside final class method");
    }
}

public class Main {
    public static void main(String[] args) {
        // Accessing final variable
        Example obj = new Example();
        System.out.println("Final variable: " + obj.finalVar);
        
        // Calling final method
        obj.finalMethod();
        
        // Creating an instance of FinalClass
        FinalClass finalObj = new FinalClass();
        
        // Calling method of FinalClass
        finalObj.display();
    }
}
