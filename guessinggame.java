package lab3;
import java.util.Scanner;

public class GuessingGame {
    public static boolean playGuessingGame(int correctAnswer) {
        Scanner scanner = new Scanner(System.in);
        int guesses = 3;

        while (guesses > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == correctAnswer) {
                System.out.println("Congratulations! You guessed it right.");
                return true;
            } else if (guess > correctAnswer) {
                System.out.println("Too high.");
            } else {
                System.out.println("Too low.");
            }

            guesses--;
        }

        System.out.println("Sorry, you lost. The correct answer was: " + correctAnswer);
        return false;
    }

    public static void main(String[] args) {
        int correctAnswer = 42;
        boolean result = playGuessingGame(correctAnswer);

        if (result) {
            System.out.println("You won!");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}
