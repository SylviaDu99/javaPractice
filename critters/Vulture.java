// Jingyun Du
// 12/5/17
// CSE142
// TA: Judith Kim
// Assignment #9-Vulture
//
// This class stores information of a vulture critter. Information includes
// moving direction, how it look like, eating behavior, and fighting behavior.
// Color is default(black) of this object.

import java.awt.*;

public class Vulture extends Critter {
   private int move;
   private boolean hunger;
   
   //constructs a vulture object
   public Vulture() {
      hunger = true;
   }
   
   //return its eating behavior as a boolean
   public boolean eat() {
      if (hunger) {
         hunger = false;
         return true;
      } else {   //hunger = false, which means the vulture is not hungry
         return false;
      }
   }
   
   //take in a String, return the vulture's attack behavior as a Attack class object
   public Attack fight(String opponent) {
      hunger = true;
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
   
   //return how the vulture look like as a String
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