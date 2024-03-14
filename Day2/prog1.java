class Parent {
    // Method to print even numbers from 1 to 20
    public void even() {
        System.out.println("Even numbers from 1 to 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // Method to print odd numbers from 1 to 20
    public void odd() {
        System.out.println("Odd numbers from 1 to 20:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // Method to check and print prime numbers from 1 to 20
    public void prime() {
        System.out.println("Prime numbers from 1 to 20:");
        for (int i = 2; i <= 20; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Child extends Parent {
    // Override parent methods to print numbers from 1 to 30
    @Override
    public void even() {
        System.out.println("Even numbers from 1 to 30:");
        for (int i = 2; i <= 30; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    @Override
    public void odd() {
        System.out.println("Odd numbers from 1 to 30:");
        for (int i = 1; i <= 30; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    @Override
    public void prime() {
        System.out.println("Prime numbers from 1 to 30:");
        for (int i = 2; i <= 30; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.even();
        child.odd();
        child.prime();
    }
}
