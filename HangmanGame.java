import java.util.Scanner; 

public class HangmanGame {
    
    private static String currentWord;
    private static String guessLine = "";
    private static String[] pastGuesses;
    private static String currGuess;
    private static char guessedLetters;
    private static int numLettersInWord;
    private static boolean hasGuessedWord = false;
    private static int guessCount = 0;
    public static Scanner scnr = new Scanner(System.in);
    
    public static void main(String[] args) {
    // instantiate Word class object
        Word word = new Word();
        this.currentWord = word.currentWord;
        for (int i = 0; i < this.currentWord.length(); i++) {
         this.guessLine.concat("_")
        }
        do
        {
         this.getNewGuesses();

        } while (this.guessCount <= 7 || !this.hasGuessedWord)
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
      if (this.guessCount === 0) {
         System.out.println("Welcome to Hangman!");
      }
      System.out.println("Guess any letter or word");
      String currentGuess = scnr.next();
      this.guessCount = this.guessCount + 1;
      char guessedChar = guess.charAt(0);
      this.updateGuesses(guessedChar);
    }
    
    public static String getGuessLine() {
      
    }
        
    public static void updateVisuals(boolean guessedCorrectly) {
        if (guessedCorrectly) {
            System.out.println("Wrong. Try again");
        }
    //Graphic results of wrong guesses
        if (currentGuess == 1) {
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
            System.out.println(this.getGuessLine());
        }
        if (currentGuess == 2) {
            System.out.println("    _______________");
            System.out.println("    |            _|_");
            System.out.println("    |          /      \");
            System.out.println("    |         |        |");
            System.out.println("    |          \______/");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|______");
            System.out.println();
            System.out.println(this.getGuessLine());
        }
        if (currentGuess == 3) {
            System.out.println("    _______________");
            System.out.println("    |            _|_");
            System.out.println("    |          /      \");
            System.out.println("    |         |        |");
            System.out.println("    |          \______/");
            System.out.println("    |             |");
            System.out.println("    |           __|__");
            System.out.println("    |             | ");
            System.out.println("    |             |");
            System.out.println("    |             |");
            System.out.println("    |");
            System.out.println("____|______");
            System.out.println();
            System.out.println(this.getGuessLine());
        }
        if (currentGuess == 4) {
            System.out.println("    _______________");
            System.out.println("    |            _|_");
            System.out.println("    |          /      \"); 
            System.out.println("    |         |        |");
            System.out.println("    |          \______/");
            System.out.println("    |             |");
            System.out.println("    |           __|__");
            System.out.println("    |          /  |");
            System.out.println("    |         |   |");
            System.out.println("    |             |");
            System.out.println("    |");
            System.out.println("____|______")
            System.out.println();
            System.out.println(this.getGuessLine());
        }
        if (currentGuess == 5) {
            System.out.println("    _______________");
            System.out.println("    |            _|_");
            System.out.println("    |          /      \");
            System.out.println("    |         |        |");
            System.out.println("    |          \______/");
            System.out.println("    |             |");
            System.out.println("    |           __|__");
            System.out.println("    |         /   |    \");
            System.out.println("    |        |    |     |");
            System.out.println("    |             |");
            System.out.println("    |");
            System.out.println("____|______")
            System.out.println();
            System.out.println(this.getGuessLine());
        }
        if (currentGuess == 6) {
            System.out.println("    _______________");
            System.out.println("    |            _|_");
            System.out.println("    |          /      \");
            System.out.println("    |         |        |");
            System.out.println("    |          \______/");
            System.out.println("    |             |");
            System.out.println("    |           __|__");
            System.out.println("    |         /   |    \");
            System.out.println("    |         |   |     |");
            System.out.println("    |             |");
            System.out.println("    |           / ");
            System.out.println("____|______    /")
            System.out.println();
            System.out.println(this.getGuessLine());
        }
        if (currentGuess == 7) {
            System.out.println("    _______________");
            System.out.println("    |            _|_");
            System.out.println("    |          /      \");
            System.out.println("    |         |        |");
            System.out.println("    |          \______/");
            System.out.println("    |             |");
            System.out.println("    |           __|__");
            System.out.println("    |         /   |    \");
            System.out.println("    |         |   |     |");
            System.out.println("    |             |");
            System.out.println("    |           /   \");
            System.out.println("____|______    /     \");
            System.out.println("You Lost");
            System.out.println("The word was: " + word);
            System.out.println();
            System.out.println(this.getGuessLine());
        }            
    }
                               
    public static boolean updateGuesses(char guess) {
        boolean hasGuessedCorrectly = word.isLetterInWord(guess);
        
        if (hasGuessedCorrectly) {
         int indexOfGuessedLetter = currentWord.indexOf(guess);
         this.updateGuessLine(indexOfGuessedLetter, guess);
        }
        this.updateVisuals();
        this.checkIfWon();
    }
    
    public static void updateGuessLine(int index, char guessLine) {
    // Replace the char in this.guessLine at the specified index
    }
                               
    public static boolean checkIfWon() {     
    //Checks player's input for correct word/letters
        if (this.guessLine == this.currentWord) {
            System.out.println("You Won!");
            this.exit();
        } 
      
    }
    public static void exit() {  
    //If player wins or loses, exit question will appear. 
        System.out.println("Do you want to play again? Enter Y for yes or N for no");
        int answer = scnr.next();
        answer = answer.toLowerCase();
    //If player inputs "y", new game starts.
    //If player intpus "n", game will reset and exit  
        if (answer.equals("y")) {
            this.main();
        }
        else {
            this.hasGuessedWord = false;
        }
     
  }
}
