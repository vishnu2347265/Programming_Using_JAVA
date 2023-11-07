import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between 1 and 100.");
        System.out.println("You have 5 attempts to guess it.");

        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            if (guess < targetNumber) {
                System.out.println("The target number is higher.");
            } else if (guess > targetNumber) {
                System.out.println("The target number is lower.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                break;
            }

            if (attempt == attempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
            }
        }

        scanner.close();
    }
}
