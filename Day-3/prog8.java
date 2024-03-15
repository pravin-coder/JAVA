import java.io.IOException;

// Custom exception class
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

// Class level declaration of exceptions
class MyClassThrowsExample throws IOException {
    // Method level declaration of exceptions
    public void methodThrowsExample() throws MyException {
        // Method code that might throw an exception
        throw new MyException("This is a custom exception");
    }

    // Another method with IO exception
    public void methodWithIOException() throws IOException {
        // Method code that might throw an IOException
        throw new IOException("IOException occurred");
    }
}

public class ThrowsExample {
    public static void main(String[] args) {
        MyClassThrowsExample obj = new MyClassThrowsExample();
        try {
            obj.methodThrowsExample();
        } catch (MyException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        try {
            obj.methodWithIOException();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
