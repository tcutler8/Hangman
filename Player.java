import java.util.ArrayList;

public class Player {
    private String playerName;
    private int numWins;
    private int numLosses;
    private int currStreak;
    private int highStreak;
    private ArrayList<String> allWords;
    private ArrayList<Boolean> roundResult;

    // overload constructor
    public Player() {
        playerName  = "Player";
    }

    // default constructor
    public Player(String name) {
        playerName  = name;
        numLosses   = 0;
        numWins     = 0;
        currStreak  = 0;
        highStreak  = 0;
        allWords    = new ArrayList<>();
        roundResult = new ArrayList<>();
    }

    // called in main() at the end of every round
    public void roundEnd(boolean roundWon, String word) {
        if (roundWon)
            ++numWins;
        else
            ++numLosses;

        // add word to allWords ArrayList
        allWords.add(word);
        // add result to roundResult ArrayList
        // used to know which words were guessed or missed
        roundResult.add(roundWon);

        setStreak(roundWon);
    }

    private void setStreak(boolean playerWin) {
        // if the player won, increase streak
        // else, set streak back to 0
        if (playerWin)
            ++currStreak;
        else 
            currStreak = 0;

        // if current streak is greater than highest
        //   streak, update the highest streak
        if (currStreak > highStreak)
            highStreak = currStreak;
    }

    // accessor (getter) methods
    public String getPlayerName() {return playerName;}
    public int    getWins()       {return numWins;}
    public int    getLosses()     {return numLosses;}
    public int    getCurrStreak() {return currStreak;}
    public int    getHighStreak() {return highStreak;}

    // print all information about a player
    public void printInfo() {
        System.out.println("Info for "  + getPlayerName());
        System.out.println("    Wins: "           + getWins());
        System.out.println("    Losses: "         + getLosses());
        System.out.println("    Current Streak: " + getCurrStreak());
        System.out.println("    Highest Streak: " + getHighStreak());

        System.out.println("    Words guessed:");
        for (int i = 0; i < allWords.size(); ++i) {
            if (roundResult.get(i)) {       // if round i was won
                System.out.print("        Round " + (i + 1) + ": ");
                System.out.println("\"" + allWords.get(i) + "\"");
            }
        }

        System.out.println("    Words missed:");
        for (int i = 0; i < allWords.size(); ++i) {
            if (!roundResult.get(i)) {      // if round i was lost
                System.out.print("        Round " + (i + 1) + ": ");
                System.out.println("\"" + allWords.get(i) + "\"");
            }
        }
    }
}
