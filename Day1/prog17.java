import java.util.Random;

public class LuckyGuess {
    public static void main(String[] args) {
        // Generate a random number between 1 and 5
        Random random = new Random();
        int randomNumber = random.nextInt(5) + 1;

        // Assume the user's guess
        int userGuess = 3; // You can change this to take user input if desired

        // Check if the user's guess matches the random number using a switch-case statement
        switch (userGuess) {
            case 1:
                if (randomNumber == 1) {
                    System.out.println("Congratulations! You've made a lucky guess!");
                } else {
                    System.out.println("Sorry, better luck next time!");
                }
                break;
            case 2:
                if (randomNumber == 2) {
                    System.out.println("Congratulations! You've made a lucky guess!");
                } else {
                    System.out.println("Sorry, better luck next time!");
                }
                break;
            case 3:
                if (randomNumber == 3) {
                    System.out.println("Congratulations! You've made a lucky guess!");
                } else {
                    System.out.println("Sorry, better luck next time!");
                }
                break;
            case 4:
                if (randomNumber == 4) {
                    System.out.println("Congratulations! You've made a lucky guess!");
                } else {
                    System.out.println("Sorry, better luck next time!");
                }
                break;
            case 5:
                if (randomNumber == 5) {
                    System.out.println("Congratulations! You've made a lucky guess!");
                } else {
                    System.out.println("Sorry, better luck next time!");
                }
                break;
            default:
                System.out.println("Invalid guess. Please guess a number between 1 and 5.");
        }

        // Print the random number for verification
        System.out.println("The random number was: " + randomNumber);
    }
}
