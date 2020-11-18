// Jingyun Du
// 12/5/17
// CSE142
// TA: Judith Kim
// Assignment #9-Bird
//
// This class stores information of a bird critter. Information includes
// moving direction, color, how it look like, and fighting behavior.
// Eating behavior is default(never eat) of this object.

import java.awt.*;

public class Bird extends Critter {
   private int move;
   
   //return the color of this bird as a Color class object
   public Color getColor() {
      return Color.BLUE;
   }
   
   //take in a String, return the bird's attack behavior as a Attack class object
   public Attack fight(String opponent) {
      if (opponent.equals("%")) {
         return Attack.ROAR;
      } else {   //opponent is not ant shaped
         return Attack.POUNCE;
      }
   }
   
   //return its moving direction as a Direction class object
   public Direction getMove() {
      if (move == 12) {
         move = 0;
      }
      move++;
      if (move <= 3) {
         return Direction.NORTH;
      } else if (move <= 6) {
         return Direction.EAST;
      } else if (move <= 9) {
         return Direction.SOUTH;
      } else {   //move is 10 or 11 or 12
         return Direction.WEST;
      }
   }
   
   //return how the bird look like as a String
   public String toString() {
      if (move <= 3) {
         return "^";
      } else if (move <= 6){
         return ">";
      } else if (move <= 9) {
         return "V";
      } else {   //move is 10 or 11 or 12
         return "<";
      }
   }
}