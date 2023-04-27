import java.util.*;
import java.io.*;

public class NimRunner {
    

    public static void main(String[] args) { // main method
        

    }


    //while loop that runs the game while there are still pieces left, and changes players
    public static boolean runGame(State state) { // runs the game
        while (state.getNumPieces() >= 0) { // while there are still pieces in the game
            if (state.getPlayer() == true) { // if the player is true (player X)
                display (state); // show display message of current state of game
                getXMove(state.getNumPieces()); // runs player X's move
            }
            else { // same as above with player Y
                display (state);
                getYMove(state.getNumPieces());
            }
            boolean currentPlayer = state.getPlayer();
            currentPlayer = !state.getPlayer(); // changes players
        }
        if (state.getPlayer() == true) { // when 0 pieces left, whoever's turn it is now has won
            System.out.println("Player X won");
            return true;
        }
        else {
            System.out.println("Player Y won");
            return false;
        }
    }

    // return the number of pieces the current player should take in order to maximize chances of winning
    public static int bestMove(int numPieces, boolean player) {
        int score;
        for (int i = 1; i<=3; i++) { // can take 1 to 3 pieces
            score = minimax(numPieces-i, player); // calls minimax to check possible outcomes
            if (player == true && score == 1) { // returns maximizing move
                return i;
            }
            else if (player == false && score == -1) {
                return i;
            }
        }
        int toRet = (int)(Math.random() * 3)+1; // if no dominant strategy, returns a random number to be removed (between 1 and 3)
        return toRet;
    }



    public static int getXMove(int numPieces) { // runs bestMove with player X (player = true)
        return bestMove(numPieces, true);
    }

    public static int getYMove(int numPieces) { // runs bestMove with player Y (player = false)
        return bestMove(numPieces, false);
    }



    public static int minimax (int numPieces, boolean player) { // recursive method --> rate how good the state is for player x (me)
     // either 1 or -1 (represents good vs bad for me)

     ArrayList <Integer> numList = new ArrayList<>(); // creating AL of scores

     if (numPieces == 0) { // base case
        if (player == true) { // if zero left and my turn, i win
            return 1;
        }
        else { // if zero left and Y's turn, Y wins (Y = minimizer, I am the maximizer)
            return -1;
        }
     }
     else { // if pieces left in the game
        for (int piecesToTake = 1; piecesToTake<=3 ; piecesToTake++) {
            if (piecesToTake < numPieces) {
                int score = minimax(numPieces-piecesToTake, !player); // recursively calling itself to check for other player's move (b/c each player's move is based on what the other does)
                numList.add(score); // adds score to AL
            }
        }

        if (player == true) { // returns the max value of the AL (b/c player X is the maximizer)
            return Collections.max(numList);
        }
        else { // returns the min value of the AL (b/c player Y is the minimizer)
            return Collections.min(numList);
        }
     }

        // IN CLASS NOTES:
        // return the max of the array (when my turn), return the min value of the array when opponents turn
        // i want to maximize the score, other player wants to minimize the score (alternating if minimizing or mazximizing depending on whose turn it is)
        // recusion: what i do is based on what you do, and what you do is based on what i do --> recursively call minimax
        // base case: 0 (if my turn and there are 0, good for me, return 1)
    }


  

    public static void display (State state) {  // display / printing method
        String playerName;
        if (state.player == true) {
            playerName = "X";
        }
        else {
            playerName = "Y";
        }
        System.out.println("It is currently player " + playerName + "'s turn, and there are " + state.getNumPieces() + " pieces left in the game.");
    }


}