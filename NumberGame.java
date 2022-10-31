/*
 * The guess game program
 *
 * By:      Devin Jhu
 * Version: 1.0
 * Since:   2022 10 30
 */

import java.util.Scanner;

/**
 * The number guessing game.
 */
final class NumberGame {
    /**
     * Constant assigned to 1 as the minimun number.
    */
    public static final int MIN = 1;
    /**
     * Constant assigned to 6 as the maximun number.
    */
    public static final int MAX = 6;
    /**
     * Constant assigned to 0.
    */
    public static final int TOO_SMALL = 0;
    /**
     * Constant assigned to 7.
    */
    public static final int TOO_BIG = 7;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private NumberGame() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        int counter = 1;
        int userNumber = 0;

        // Generate the number
        final int randomNumber = (int) (Math.random() * MAX + MIN);

        // Loop
        while (true) {
            // Input
            final Scanner guessObj = new Scanner(System.in);
            System.out.println("Guess a number between 1 to 6: ");
            userNumber = guessObj.nextInt();

            // Process
            if (randomNumber == userNumber) {
                break;
            } else if (userNumber > randomNumber & userNumber < TOO_BIG) {
                counter++;
                System.out.println("Too big try again");
            } else if (userNumber < randomNumber & userNumber > TOO_SMALL) {
                counter++;
                System.out.println("Too small try agian");
            } else {
                counter++;
                System.out.println("\nInvalid Input.");
            }
        }

        // Output
        System.out.println("\nYou won in " + counter + " tries");

        System.out.println("\nDone.");
    }
}
