//lecture note
//11.29, Wed.
//TA: Judith Kim
//
//another critter

import java.awt.*;

public class Sloth extends Critter {
   private Color brown;
   private int moves;
   private boolean justAte;
   
   public Sloth() {
      brown = new Color(206, 141, 10);
      //moves = 0;   no need...
   }

   public String toString() {
      return "C";
   }
   
   public Color getColor() {   // Color(int r, int g, int b)
      return brown;
   }
   
   public boolean eat() {
      justAte = true;
      return true;
   }
   
   //center, center, south, repeat
   //one step to west after eat
   public Direction getMove() {
      moves++;
      if (justAte) {
         justAte = false;
         return Direction.WEST;
      }
      if (moves % 3 == 0) {
         return Direction.SOUTH;
      } else {
         return Direction.CENTER;
      }
   }
   
   public Attack fight(String opponent) {
      return Attack.SCRATCH;
   }
}