public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean isAM; // true for AM, false for PM

    // Constructor to initialize time in 24-hour format
    public Clock(int hours, int minutes, int seconds) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            this.isAM = true; // Default to AM
        } else {
            System.out.println("Invalid time input.");
        }
    }

    // Constructor to initialize time in 12-hour format with AM/PM
    public Clock(int hours, int minutes, int seconds, boolean isAM) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            this.isAM = isAM;
        } else {
            System.out.println("Invalid time input.");
        }
    }

    // Method to check validity of time
    private boolean isValidTime(int hours, int minutes, int seconds) {
        return (hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60) && (seconds >= 0 && seconds < 60);
    }

    // Method to set time in 12-hour format with AM/PM
    public void setTime(int hours, int minutes, int seconds, boolean isAM) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            this.isAM = isAM;
        } else {
            System.out.println("Invalid time input.");
        }
    }

    // Method to display time
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d ", hours, minutes, seconds);
        System.out.println(isAM ? "AM" : "PM");
    }

    public static void main(String[] args) {
        // Example usage
        Clock clock1 = new Clock(10, 30, 45);
        clock1.displayTime(); // Output: 10:30:45 AM
        
        Clock clock2 = new Clock(18, 45, 20, false);
        clock2.displayTime(); // Output: 06:45:20 PM
        
        // Attempting to set invalid time
        Clock clock3 = new Clock(25, 70, 90);
    }
}
