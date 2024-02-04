import java.util.Scanner;
import java.util.ArrayList;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Player1, enter a word: "); 
        String word = scanner.nextLine();
        
        ArrayList<Character> guessedLetters = new ArrayList<>();
        int numberOfGuesses = 0;
        
        while (true) {
            boolean guessed = true;
            
            for (int i = 0; i < word.length(); i++) {
                if (guessedLetters.contains(word.charAt(i))) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print("_");
                    guessed = false;
                }
            }
            
            if (guessed) {
                System.out.println("\nYou guessed the word! You win!");
                break;
            }
            
            
            System.out.print("\n\nPlayer2, guess a letter: ");
            char letter = scanner.nextLine().charAt(0);
            
            if (!guessedLetters.contains(letter)) {
                guessedLetters.add(letter);
            }
            
            numberOfGuesses++;
            
            if (numberOfGuesses == 10) {
                System.out.print("You are out of guesses. Can you guess the word? ");
                String guess = scanner.nextLine();
        
                if (guess.equals(word)) {
                    System.out.println("You guessed the word. You win!");
                } else {
                    System.out.println("That's not correct. You lose.");
                }
                break;
            }
        }
        
    }
}