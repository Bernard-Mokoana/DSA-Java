import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MyHangman {
    public static int MAX_GUESSES = 7;
    public static MyArrayListHM<String> words = new MyArrayListHM<>();
    public static MyArrayListHM<Character> secretWord = new MyArrayListHM<>();
    public static MyArrayListHM<Character> guessedWord = new MyArrayListHM<>();
    public static int guessesLeft;

    public static void main(String[] args) {
        loadWords("words.txt");
        startNewGame();
        playGame();
    }

    public static void loadWords(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.add(words.getSize(), line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The words: " + words);
        words.sortList();
        System.out.println("The sorted words: " + words);
    }

    public static void startNewGame() {
        Random random = new Random();
        String selectedWord = words.get(random.nextInt(words.getSize()));

        secretWord.clear();
        guessedWord.clear();
        guessesLeft = MAX_GUESSES;

        for (char c : selectedWord.toCharArray()) {
            secretWord.add(secretWord.getSize(), c);
            guessedWord.add(guessedWord.getSize(), '_');
        }

        System.out.println("Welcome to Hangman!");
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (guessesLeft > 0 && !isWordGuessed()) {
            System.out.println("Guessed word: " + guessedWord);
            System.out.println("Guesses left: " + guessesLeft);
            System.out.print("Enter a letter: ");
            char guess = scanner.nextLine().charAt(0);

            if (secretWord.contains(guess)) {
                updateGuessedWord(guess);
                System.out.println("Correct guess!");
            } else {
                guessesLeft--;
                System.out.println("Incorrect guess.");
            }
        }

        if (isWordGuessed()) {
            System.out.println("Congratulations! You guessed the word: " + guessedWord);
        } else {
            System.out.println("Game Over. The word was: " + secretWord);
        }

        scanner.close();
    }

    private static void updateGuessedWord(char guess) {
        for (int i = 0; i < secretWord.getSize(); i++) {
            if (secretWord.get(i) == guess) {
                guessedWord.remove(i);
                guessedWord.add(i, guess);
            }
        }
    }

    private static boolean isWordGuessed() {
        return !guessedWord.contains('_');
    }
}
