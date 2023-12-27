import java.util.Random;
import java.util.Scanner;

public class GuessNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimits = 10;
        int score = 0;
        
        System.out.println("Welcome to the Number Guessing Game!\n");
        boolean playAgain = true;
        
        while (playAgain) {
            int targetNum = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.printf("Round - Range: %d to %d\n", minRange, maxRange);
            System.out.println("You have " +  attemptsLimits + " attempts.\n");
            
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            while (attempts <  attemptsLimits) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                
                attempts++;
                
                if (userGuess == targetNum) {
                    System.out.printf("Correct! You guessed the number in %d attempts.\n", attempts);
                    score += attempts;
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < targetNum) {
                    System.out.println("Too low! Try again.\n");
                } else {
                    System.out.println("Too high! Try again.\n");
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + targetNum);
            }
            
            System.out.println("Your current score: " + score + "\n");
            
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }
        
        System.out.println("Thank you for playing! Your final score: " + score);
        
        scanner.close();
    }
}