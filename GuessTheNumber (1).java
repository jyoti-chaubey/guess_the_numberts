import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;

        // Generate random number
        int randomNumber = generateRandomNumber(min, max);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        int userGuess = 0;

        System.out.println("Guess the number between " + min + " and " + max);

        // Loop until the user guesses the correct number
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }

        // Close the scanner
        scanner.close();
    }

    public static int generateRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Max must be greater than Min");
        }

        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
