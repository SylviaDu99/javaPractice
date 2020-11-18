public class Crab extends Critter {
   private int place;
   private int move;
   private int east;
   private boolean turn;
    
   public Crab() {
      move = 1;
      east = 1;
   }
    
   public Direction getMove() {
      if (move == 8) {
         move = 1;
         east = 1;
         place--;
      }
      if (place > -1 - east && !turn) {
         place--;
         if (place == 0 - east) {
            turn = true;
         }
         return Direction.WEST;
      } else {
         place++;
         if (place == east) {
            move++;
            if (move < 5) {
               east++;
            } else {
               east--;
            }
            turn = false;
         }
         return Direction.EAST;
      }
   }
}