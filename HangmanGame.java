//Mark Timpson, Meredith Hanson, Tayson Cutler
//Team Assignment - Project
//CSIS-1400
//04-24-2022

import java.util.ArrayList;
import java.util.Scanner; 
import java.lang.Character;
import java.util.Arrays;

public class HangmanGame {
    
    private static String currentWord;
    public static char[] currentWordCharArray;
    private static char[] guessLine;
    private static String currGuess;
    private static char[] currGuessCharArray;
    private static char currGuessChar;
    private static boolean hasGuessedWord;
    private static String shouldContinue;
    private static int failedGuessCount = 0;
    public static Scanner scnr = new Scanner(System.in);
    public static Word word = new Word();   // instantiate Word class object
    public static ArrayList<String> guessedLetters = new ArrayList<>();
    
    public static void main(String[] args) {
        createPlayer();
        menu();
    }

    //Creates new Player object with user name
    public static void createPlayer(){
        System.out.println("Enter player name: ");
        new Player(scnr.nextLine());
        System.out.println();
        System.out.println("Hi, " + Player.getPlayerName() + "!");
        System.out.println("Welcome to Hangman!");
  
    }

    //Game menu where player decides to play again or quit
    public static void menu(){
        Player.printInfo();
        System.out.println("Would you like to start a game? y to start, anything else to quit.");
        shouldContinue = scnr.next();
        if(shouldContinue.equals("y")){
            resetGame();
            game();
        }
        else{
            exit();
        }
    }

    //Fetches a new random word and resets all relevant variables accordingly
    public static void resetGame(){
        currentWord = Word.getRandomWord();
        currentWordCharArray = new char[currentWord.length()];
        currentWordCharArray = currentWord.toCharArray();
        guessedLetters.clear();
        failedGuessCount = 0;
        hasGuessedWord = false;
        guessLine = new char[currentWord.length()];
        for(int i = 0; i < currentWord.length(); i++){
            guessLine[i] = '_';
        }
    }

    public static void game(){

        //Game loops while player has not yet won or lost
        while((!hasGuessedWord) && (failedGuessCount < 7)){
            //Gets user letter input and sets data types for accessibility
            System.out.println("Please enter a letter: ");
            currGuess = scnr.next();
            currGuessCharArray = currGuess.toCharArray();
            currGuessChar = Character.toLowerCase(currGuessCharArray[0]);

            //Checks that the user input a single letter
            if((currGuess.length() == 1) && (Character.isLetter(currGuessChar))){
                //Prevents user from guessing the same letter
                if(guessedLetters.contains(currGuess)){
                    System.out.println("You already guessed " + currGuess + ".");
                }
                else{
                    //Appends guessed letters and checks if letter is in word
                    guessedLetters.add(currGuess);
                    int indexOfLetter = currentWord.indexOf(currGuessChar);

                    if (indexOfLetter >= 0){
                        //Correct guess, update variables accordingly
                        updateGuessLine(currentWord, currGuessChar);
                        updateVisuals(true);
                        hasGuessedWord = didWin(currentWordCharArray);
                    }else{
                        //Incorrect guess, update variables accordingly
                        failedGuessCount++;
                        updateVisuals(false);            
                    }
                }    
            }
            else{
                //User guess is not a single letter
                System.out.println(currGuess + " is not a valid guess.");
            }
        }

        //Exiting loop means game is over
        Player.roundEnd(hasGuessedWord, currentWord);
        if (hasGuessedWord){
            System.out.println("Congrats! You guessed the word.");
        } else {
            System.out.println("You lost! The word was: " + currentWord);
        }
        menu();
    }

    //Replaces all underscores '_' with letter where the letters in word match it
    public static void updateGuessLine(String word, char letter){
        int index = word.indexOf(letter);

        while(index >= 0){
            guessLine[index] = letter;
            ++index;
            index = word.indexOf(letter, index);
        }
    }

    //Prints current guess line (ex.: _r__k)
    public static void printGuessLine() {
        System.out.println(guessLine);
    }

    public static boolean didWin(char[] word){
        boolean won = Arrays.equals(word, guessLine);
        if(won){System.out.println("You won.");}
        return won;
    }
        
    //Graphic results of guesses
    public static void updateVisuals(boolean guessedCorrectly) {
        switch (failedGuessCount) {
            case 0:
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
                printGuessLine();
                break;
            case 1:
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
                printGuessLine();
                break;
            case 2:
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
                printGuessLine();
                break;
            case 3:
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
                printGuessLine();
                break;
            case 4:
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
                printGuessLine();
                break;
            case 5:
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
                printGuessLine();
                break;
            case 6:
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
                System.out.println();
                printGuessLine();
                break;
            case 7:
                System.out.println("    _______________");
                System.out.println("    |            _|_");
                System.out.println("    |          / x  x \\");
                System.out.println("    |         |        |");
                System.out.println("    |          \\______/");
                System.out.println("    |             |");
                System.out.println("    |           __|__");
                System.out.println("    |         /   |    \\");
                System.out.println("    |         |   |     |");
                System.out.println("    |             |");
                System.out.println("    |           /   \\");
                System.out.println("____|______    /     \\");
                System.out.println();
                printGuessLine();
                break;
            default:
                break;
        }
        //Wrong / correct message under hangman for clarity
        if (guessedCorrectly) {
            System.out.println("Correct!");
        }
        else{
            System.out.println("Wrong.");
        }
        System.out.println("You've guessed " + guessedLetters + ".");   
    }

    //Exits program
    public static void exit() {  
        System.out.println("Goodbye.");
        System.exit(0);
  }
}
