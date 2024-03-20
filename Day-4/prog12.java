import java.util.Scanner;

// Define Bank class
class Bank {
    // Method to get rate of interest
    public double getRateOfInterest() {
        return 0; // Default implementation, actual implementation will be in subclasses
    }
}

// Subclass for SBI bank
class SBI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 8.4; // SBI rate of interest
    }
}

// Subclass for ICICI bank
class ICICI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 7.3; // ICICI rate of interest
    }
}

// Subclass for AXIS bank
class AXIS extends Bank {
    @Override
    public double getRateOfInterest() {
        return 9.7; // AXIS rate of interest
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create objects of each bank
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        // Display rates of interest
        System.out.println("Rate of Interest for SBI: " + sbi.getRateOfInterest() + "%");
        System.out.println("Rate of Interest for ICICI: " + icici.getRateOfInterest() + "%");
        System.out.println("Rate of Interest for AXIS: " + axis.getRateOfInterest() + "%");
    }
}
