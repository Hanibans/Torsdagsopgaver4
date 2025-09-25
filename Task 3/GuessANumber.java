import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    private static int rnd_number;

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess() {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your guess: ");

        // use hasNextDouble to check if input is numeric
        if (scanner.hasNextDouble()) {
            // Read user input
            int guess = (int) scanner.nextDouble();

            // Compare it with the random number
            if (guess == rnd_number) {
                System.out.println("Correct! The number was " + rnd_number);
                return; // end recursion (base case)
            } else {
                // Let the user know the result of the comparison
                if (guess < rnd_number) {
                    System.out.println("Too low! Try again...");
                } else {
                    System.out.println("Too high! Try again...");
                }
                // Let the user try again by calling this method recursively
                makeAGuess();
            }
        } else {
            // if input was not numeric show an error message
            System.out.println("That is not a number! Please enter a valid number.");
            scanner.next(); // clear the wrong input
            // call this method recursively
            makeAGuess();
        }
    }
}
