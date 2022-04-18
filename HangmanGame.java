import java.util.Scanner; 

public class HangmanGame {
    
    private static String currentWord;
    private static String guessLine = "";
    private static String[] pastGuesses;
    private static String currGuess;
    private static char guessedLetters;
    private static int numLettersInWord;
    private static boolean hasGuessedWord = false;
    private static boolean shouldContinue;
    private static int guessCount = 0;
    private static int failedGuessCount = 0;
    public static Scanner scnr = new Scanner(System.in);
    public static Word word = new Word();   // instantiate Word class object
    
    public static void main(String[] args) {
        currentWord = word.currentWord;
        for (int i = 0; i < currentWord.length(); i++) {
         guessLine.concat("_");
        }
        do
        {
         getNewGuesses("FIXME");

        } while (guessCount <= 7 || !hasGuessedWord);
    }
    
//     public static void startNewGame() {
//     //Unfisiniehd code
//     //Game begins and the player starts to guess letters
//         while (guessedLetter = 0) {
//             System.out.println("Begin Game!");
//             guessLetters = scnr.nextLine();
//             for (int i=0; i<word.length(); ++i) {
//                 if (guessedLeter == word.charAt(i)) {
//                     updateVisals();
//                     updateGuesses();
//                 }
//             }
//         }
//             
//               
//     } 
    
    public static void getNewGuesses(String guess) {
    //Gather input from user; pass results to updateGuesses
      if (guessCount == 0) {
         System.out.println("Welcome to Hangman!");
      }
      System.out.println("Guess any letter or word");
      String currentGuess = scnr.next();
      guessCount = guessCount + 1;
      char guessedChar = guess.charAt(0);
      updateGuesses(guessedChar);
    }
    
    public static String getGuessLine() {
        return "FIXME";
    }
        
    public static void updateVisuals(boolean guessedCorrectly) {
        if (guessedCorrectly) {
            System.out.println("Wrong. Try again");
        }
    //Graphic results of wrong guesses
        if (failedGuessCount == 1) {
            System.out.println("    _______________");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|______");
            System.out.println();
            System.out.println(getGuessLine());
        }
        if (failedGuessCount == 2) {
            System.out.println("    _______________");
            System.out.println("    |            _|_");
            System.out.println("    |          /      \\");
            System.out.println("    |         |        |");
            System.out.println("    |          \\______/");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|______");
            System.out.println();
            System.out.println(getGuessLine());
        }
        if (failedGuessCount == 3) {
            System.out.println("    _______________");
            System.out.println("    |            _|_");
            System.out.println("    |          /      \\");
            System.out.println("    |         |        |");
            System.out.println("    |          \\______/");
            System.out.println("    |             |");
            System.out.println("    |           __|__");
            System.out.println("    |             | ");
            System.out.println("    |             |");
            System.out.println("    |             |");
            System.out.println("    |");
            System.out.println("____|______");
            System.out.println();
            System.out.println(getGuessLine());
        }
        if (failedGuessCount == 4) {
            System.out.println("    _______________");
            System.out.println("    |            _|_");
            System.out.println("    |          /      \\"); 
            System.out.println("    |         |        |");
            System.out.println("    |          \\______/");
            System.out.println("    |             |");
            System.out.println("    |           __|__");
            System.out.println("    |          /  |");
            System.out.println("    |         |   |");
            System.out.println("    |             |");
            System.out.println("    |");
            System.out.println("____|______");
            System.out.println();
            System.out.println(getGuessLine());
        }
        if (failedGuessCount == 5) {
            System.out.println("    _______________");
            System.out.println("    |            _|_");
            System.out.println("    |          /      \\");
            System.out.println("    |         |        |");
            System.out.println("    |          \\______/");
            System.out.println("    |             |");
            System.out.println("    |           __|__");
            System.out.println("    |         /   |    \\");
            System.out.println("    |        |    |     |");
            System.out.println("    |             |");
            System.out.println("    |");
            System.out.println("____|______");
            System.out.println();
            System.out.println(getGuessLine());
        }
        if (failedGuessCount == 6) {
            System.out.println("    _______________");
            System.out.println("    |            _|_");
            System.out.println("    |          /      \\");
            System.out.println("    |         |        |");
            System.out.println("    |          \\______/");
            System.out.println("    |             |");
            System.out.println("    |           __|__");
            System.out.println("    |         /   |    \\");
            System.out.println("    |         |   |     |");
            System.out.println("    |             |");
            System.out.println("    |           / ");
            System.out.println("____|______    /");
            System.out.println();
            System.out.println(getGuessLine());
        }
        if (failedGuessCount == 7) {
            System.out.println("    _______________");
            System.out.println("    |            _|_");
            System.out.println("    |          /      \\");
            System.out.println("    |         |        |");
            System.out.println("    |          \\______/");
            System.out.println("    |             |");
            System.out.println("    |           __|__");
            System.out.println("    |         /   |    \\");
            System.out.println("    |         |   |     |");
            System.out.println("    |             |");
            System.out.println("    |           /   \\");
            System.out.println("____|______    /     \\");
            System.out.println("You Lost");
            System.out.println("The word was: " + word);
            System.out.println();
            System.out.println(getGuessLine());
        }            
    }
                               
    public static void updateGuesses(char guess) {
        boolean hasGuessedCorrectly = word.isLetterInWord(guess);
        
        if (hasGuessedCorrectly) {
         int indexOfGuessedLetter = currentWord.indexOf(guess);
         updateGuessLine(indexOfGuessedLetter, guess);
        }
        updateVisuals(hasGuessedCorrectly);
        checkIfWon();
    }
    
    public static void updateGuessLine(int index, char guessLine) {
    // Replace the char in guessLine at the specified index
    }
                               
    public static boolean checkIfWon() {     
    //Checks player's input for correct word/letters
        boolean didWin = false;
        if (guessLine == currentWord) {
            didWin = true;
            System.out.println("You Won!");
            exit();
        } 
        return didWin;
    }
    public static void exit() {  
        shouldContinue = false;
    //If player wins or loses, exit question will appear. 
        System.out.println("Do you want to play again? Enter Y for yes or N for no");
        String answer = scnr.next();
        answer = answer.toLowerCase();
    //If player inputs "y", new game starts.
    //If player intpus "n", game will reset and exit  
        if (!answer.equals("y")) {
            shouldContinue = true;
        }
  }
}
