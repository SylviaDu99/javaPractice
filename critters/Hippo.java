// Jingyun Du
// 12/5/17
// CSE142
// TA: Judith Kim
// Assignment #9-Hippo
//
// This class stores information of a hippo critter. Information includes moving direction,
// color, how it look like, eating behavior, and fighting behavior.

import java.util.*;
import java.awt.*;

public class Hippo extends Critter {
   private int foodnum;
   private Random rand;
   private boolean hunger;
   private int move;
   private int randDirect;
   
   //constructs a hippo object
   public Hippo(int foodnum) {
      this.foodnum = foodnum;
      rand = new Random();
      hunger = true;
      randDirect = rand.nextInt(4) + 1;
   }

   //return the color of this hippo as a Color class object
   public Color getColor() {
      if (hunger) {
         return Color.GRAY;
      } else {   //hunger == false, which means hippo is not hungry
         return Color.WHITE;
      }
   }
   
   //return its eating behavior as a boolean
   public boolean eat() {
      if (foodnum > 0) {
         foodnum--;
         if (foodnum == 0) {
            hunger = false;
         }
         return true;
      } else {   //foodnum == 0, which means hippo don't need to eat any more
         return false;
      }
   }

   //take in a String, return the hippo's attack behavior as a Attack class object
   public Attack fight(String opponent) {
      if (hunger) {
         return Attack.SCRATCH;
      } else {   //hunger == false, which means hippo is not hungry
         return Attack.POUNCE;
      }
   }
   
   //return its moving direction as a Direction class object
   public Direction getMove() {
      if (move == 5) {
         move = 0;
         randDirect = rand.nextInt(4) + 1;
      }
      move++;
      if (randDirect == 1) {
         return Direction.NORTH;
      } else if (randDirect == 2) {
         return Direction.EAST;
      } else if (randDirect == 3) {
         return Direction.SOUTH;
      } else {   //randDirect == 4
         return Direction.WEST;
      }
   }
   
   //return how the hippo look like as a String
   public String toString() {
      return "" + foodnum;
   }
}