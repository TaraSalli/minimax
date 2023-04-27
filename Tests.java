public class Tests {
    public static void main(String[] args) {
        System.out.println("Testing my NimRunner class.");

        // making state objects with the game's initial number of pieces and player turn
        State state1 = new State (1, true);
        State state2 = new State (0, false);
        State state3 = new State (5, true);


        // TESTS:

        // testing runGame:
        System.out.println(NimRunner.runGame(state2)); // false
        System.out.println(NimRunner.runGame(state3)); // true
        System.out.println(NimRunner.runGame(state1)); // false (has to take the last one)


        // testing bestMove:
        System.out.println(NimRunner.bestMove(1, true)); // edge case --> has to take 1 b/c only one left
        System.out.println(NimRunner.bestMove(2, true)); // should take 1
        System.out.println(NimRunner.bestMove(0, true)); // edge case --> will return 0 b/c no more pieces left to take

        // testing minimax:
        System.out.println(NimRunner.minimax(0, true) == 1); // true
        System.out.println(NimRunner.minimax(0, false) == -1); // true
        System.out.println(NimRunner.minimax(4, true) == 1); // true
        System.out.println(NimRunner.minimax(4, false) == 1); // true
        System.out.println(NimRunner.minimax(5, true) == 1); // true


    }
}