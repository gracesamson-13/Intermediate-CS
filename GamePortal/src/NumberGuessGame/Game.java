import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    int guesses;
    int numToGuess;
    int guess;
    // int previousGuesses;
    static Scanner sc = new Scanner(System.in);
    ArrayList<Integer> previousGuesses = new ArrayList<>();
    // Game g = new Game(1,50);

    Game(int low, int high) {
        guesses = 0;
        System.out.println("I'm thinking of a number from " + low + " to " + high);
        // when we create a game, we get a random number between low to high.
        // assign numToGuess to that random number.
        Random r = new Random();
        numToGuess = r.nextInt(low, high);
    }

    void play() {
        System.out.println("Begin the game!");
        int guess = getGuess();

        while (guess != numToGuess) {
            System.out.println("You guessed  " + getGuess());
            guesses++;

            if (guess > numToGuess) {
                System.out.println("Guess lower");
            } else if (guess < numToGuess) {
                System.out.println("Guess higher");
            } else if (guess == numToGuess) {
                System.out.println("You got it!");
            }
            guess = getGuess();
        }
        System.out.println("Done playing!");
    }

    int getGuess() {
        if (!sc.hasNextInt()) {
            System.out.println("Type in an integer please");
            sc.next();
        }
        int guess = sc.nextInt();
        if (previousGuesses.contains(guess)) {
            System.out.println("You already guessed that");
            return getGuess();
        }
        previousGuesses.add(guess);
        guesses++;
        return guess; 
    }

    int getNumGuesses() {
        return guesses;
    
    }

}
