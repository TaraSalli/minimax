public class State {

        public static void main (String[] args) {
            State state = new State(7, true);
        }

        private int numPieces;
        private boolean player;

        public State (int numPieces, boolean player) {
            this.numPieces = numPieces;
            this.player = player;
        }
    
    
         
        public int getNumPieces() {
            return numPieces;
        }
    
        public boolean getPlayer() {
            return player;
        }
        

}       