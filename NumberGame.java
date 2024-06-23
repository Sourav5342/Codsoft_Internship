// Task 1: Number Game
import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 10;
        int rounds = 0;
        int totalAttempts = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between " + minRange + " and " + maxRange + ".");
        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            System.out.println("\nRound " + (rounds + 1));
            System.out.println("Guess the number (between " + minRange + " and " + maxRange + "):");
            while (attempts < attemptsLimit) {
                System.out.print("Attempt " + (attempts + 1) + ": ");
                int userGuess = scanner.nextInt();
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed it right.");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try a higher number.");
                } else {
                    System.out.println("Too high. Try a lower number.");
                }
                attempts++;
            }
            totalAttempts += attempts;
            rounds++;
            System.out.println("\nRound " + rounds + " summary:");
            System.out.println("Target number was: " + targetNumber);
            System.out.println("Attempts taken: " + attempts);
            System.out.print("Play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }
        System.out.println("\nGame over! You played " + rounds + " rounds.");
        System.out.println("Total attempts: " + totalAttempts);
        scanner.close();
    }
}