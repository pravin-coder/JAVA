public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            // Negative Argument in the method requiring non-negative values
            int radius = -5;
            calculateArea(radius); // IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        try {
            // Invalid Enum Constant Passed to a Method
            String day = "MONDAY";
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(day); // IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        try {
            // Setting an Invalid Range for a Method Parameter
            int age = 150;
            setAge(age); // IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        try {
            // Empty or Null String Argument in a Method Requiring
            String name = null;
            setName(name); // IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }

    // Method requiring non-negative values
    public static void calculateArea(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        // Calculate area
    }

    // Enum representing days of the week
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // Method to set age within a valid range
    public static void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        // Set age
    }

    // Method requiring a non-null and non-empty string argument
    public static void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        // Set name
    }
}
