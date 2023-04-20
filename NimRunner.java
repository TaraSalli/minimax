import java.util.*;
import java.io.*;

public class NimRunner {
    
    // instance variables
    static boolean player;
    static int numPieces;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // for player input

    }


    //while loop that runs the game while there are still pieces left, and changes players and minimax!!!!!!!
    public static boolean runGame() {
        while (numPieces >= 0) {
            player = !player; // changes player
        }
        return player;
    }


    public static int minimax (state, player) { // recursive method --> rate how good the state is for player x (me)
        return 1; // either 1 or -1 (represents good vs bad for me)
        if (numPieces == 0) {
            if (player == true) {
                return 1;
            }
            else {
                re
            }
        }
        else {
            minimax();
        }
        // i want to maximize the score, other player wants to minimize the score (alternating if minimizing or mazximizing depending on whose turn it is)
        // recusion: what i do is based on what you do, and what you do is based on what i do --> recursively call minimax
        // base case: 0 (if my turn and there are 0, good for me, return 1)
    }

    public static int getXMove(state) { // nume pieces X takes
        boolean validMove = false;
        while (!validMove) { // makes sure player picks either 1, 2, or 3 pieces
            int toRemove = scanner.nextInt(); // asks player for number of pieces they want to remove
            if ((remove <= 3 || remove >= 1) && remove <= numPieces) { // checks that player removes 1-3 pieces and not more than there are pieces left in the game
                validMove = true;
            }
            else {
                System.out.println("Invalid move: pleae pick 1, 2, or 3 pieces to remove");
            }
        }
        return toRemove;
    }


    public static int getYMove(state) { // num pieces Y takes
        boolean validMove = false;
        while (!validMove) { // makes sure player picks either 1, 2, or 3 pieces
            int toRemove = scanner.nextInt(); // asks player for number of pieces they want to remove
            if ((remove <= 3 || remove >= 1) && remove <= numPieces) { // checks that player removes 1-3 pieces and not more than there are pieces left in the game
                validMove = true;
            }
            else {
                System.out.println("Invalid move: pleae pick 1, 2, or 3 pieces to remove");
            }
        }
        return toRemove;
    }

    public static void display (state) {  // display / printing method
        if (player) {
            String playerName = "X";
        }
        else {
            String playerName = "Y";
        }
        System.out.println("It is currently player " + playerName + "'s turn, and there are " + numPieces + " pieces left in the game.");
    }


}