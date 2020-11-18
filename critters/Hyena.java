public class Hyena extends Critter {
   private int move;
   private int east;
   private int go;
    
   public Direction getMove() {
      if (move == 0) {
         east++;
         move++;
         return Direction.NORTH;
      } else if (move == 1) {
         go++;
         if (go > east) {
            move++;
            go = 0;
         }
         return Direction.EAST;
      } else if (move == 2) {
         move++;
         return Direction.SOUTH;
      } else {
         go++;
         if (go > east) {
            move = 0;
            go = 0;
         }
         return Direction.WEST;
      }
   }
    
   public boolean eat() {
      move = 0;
      go = 0;
      return true;
   }
}