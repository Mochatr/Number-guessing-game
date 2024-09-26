import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        // Generate a random number between 1 and 100
        int secretNumber = random.nextInt(50) + 1;

        System.out.println("\nPlease select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");

        System.out.print("\nEnter your choice: ");
        int difficultyChoice = scanner.nextInt();

        int maxAttempts;
        switch(difficultyChoice) {
            case 1:
                maxAttempts = 10;
                System.out.println("Great! You have selected the Easy level.");
                break;
            case 2:
                maxAttempts = 5;
                System.out.println("Great! You have selected the Medium level.");
                break;
            case 3:
                maxAttempts = 3;
                System.out.println("Great! You have selected the Hard level.");
                break;
            default:
                maxAttempts = 5;
                System.out.println("Invalid choice. Defaulting to Medium  level.");
        }

        System.out.println("Let's start the game!");
        System.out.println("You have " + maxAttempts + " chances to guess the correct number.");

        int attempts = 0;
        boolean guessedCorrectly = false;

        while (attempts < maxAttempts && !guessedCorrectly) {
            System.out.print("\nEnter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                guessedCorrectly = true;
            } else if (guess < secretNumber) {
                System.out.println("Incorrect! The number is greater than " + guess + ".");
            } else {
                System.out.println("Incorrect! The number is less than " + guess + ".");
            }
        }

        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you've run out of chances. The correct number was " + secretNumber + ".");
        }

        scanner.close();
    }
}