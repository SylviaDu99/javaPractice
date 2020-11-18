// Jingyun Du
// 12/5/17
// CSE142
// TA: Judith Kim
// Assignment #9-Ant
//
// This class stores information of an ant critter. Information includes moving direction,
// color, how it look like, eating behavior, and fighting behavior.

import java.awt.*;

public class Ant extends Critter {
   private int move;
   private boolean walkSouth;

   //constructs an ant object with given boolean
   public Ant(boolean walkSouth) {
      this.walkSouth = walkSouth;
   }
   
   //return the color of this ant as a Color class object
   public Color getColor() {
      return Color.RED;
   }
   
   //return its eating behavior as a boolean
   public boolean eat() {
      return true;
   }
   
   //take in a String, return the ant's attack behavior as a Attack class object
   public Attack fight(String opponent) {
      return Attack.SCRATCH;
   }

   //return its moving direction as a Direction class object
   public Direction getMove() {
      move++;
      if(move % 2 == 1) {
         if(walkSouth){
            return Direction.SOUTH;
         } else {   //walkSouth == false
            return Direction.NORTH;
         }
      } else {   //move is a even number
         return Direction.EAST;
      }
   }
   
   //return how the ant look like as a String
   public String toString() {
      return "%";
   }
}