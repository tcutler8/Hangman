import java.util.Scanner; 

public class HangmanGame {
    
    private static String currentWord;
    private static String pastGuesses;
    private static String currGuesses;
    private static char guessedLetters;
    private static int numLettersInWord;
    
    public static void main(String[] args) {
    
        Scanner scnr = new Scanner(System.in);
        
        while (count < 7 && underscore.contains("_")){
        //underscores to replace unguessed letters
            
            System.out.println("Guess any letter or word");
            System.out.println(underscore);   
            String currentGuess = scnr.next();
            hangman(currentGuess);
        }
    }
    
    public static void startNewGame() {
    //Unfisiniehd code
    //Game begins and the player starts to guess letters
        while (startNewGame) {
            System.out.println("Begin Game!");
            guessLetters = scnr.nextLine();
              
    } 
    
    public static void getNewGuesses(String guess) {
    //Unfinished code
    //Gather input from user; pass results to updateGuesses
        
    }
        
    public static void updateVisuals() {
        if (count == 1) {
            System.out.println("Wrong. Try again");
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
        }
        if (count == 2) {
            System.out.println("Wrong. Try again"):
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
        }
        if (count == 3) {
            System.out.println("Wrong. Try again");
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
        }
        if (count == 4) {
            System.out.println("Wrong. Try again");
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
        }
        if (count == 5) {
            System.out.println("Wrong. Try again");
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
        }
        if (count == 6) {
            System.out.println("Wrong. Try again");
            System.out.println("Wrong. Try again");
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
        }
        if (count == 7) {
            System.out.println("Wrong. Try again");
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
        }            
    }
                               
    public static boolean updateGuesses() {
    //Unfinished Code
    //Add up guess count and update past guesses while updating visuals
        String currentGuess = scnr.next();
        if (
    }
                               
    public static boolean checkWins() {     
    //Unfinished
    //Checks player's input for correct word/letters
        if (numLettersInWord == true) {
            System.out.println("You Won!");
        } 
        else {
            System.out.println("You Lose");
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
            hangman.resetTheGame();
        }
        else {
            System.exit(0);
        }
     
  }
 }
