// Jingyun Du
// 12/5/17
// CSE142
// TA: Judith Kim
// Assignment #9-Husky
//
// This class stores information of a husky critter. Information includes moving direction,
// color, how it look like, eating behavior, and fighting behavior.

import java.awt.*;
import java.util.*;

public class Husky extends Critter {
   private boolean hunger;
   private int move;
   private Random rand;
   private int randDirect;
   private Color purple;
   private Color gold;
   
   //constructs a husky object
   public Husky() {
      hunger = true;
      rand = new Random();
      randDirect = rand.nextInt(4);
      purple = new Color(58, 28, 112);
      gold = new Color(169, 149, 103);
   }
   
   //return the color of this ant as a Color class object
   public Color getColor() {
      if (hunger) {
         return purple;
      } else {   //hunger = false, which means the husky is not hungry
         return gold;
      }
   }

   //return its eating behavior as a boolean
   public boolean eat() {
      hunger = false;
      return true;
   }

   //take in a String, return the husky's attack behavior as a Attack class object
   public Attack fight(String opponent) {
      hunger = true;
      if (opponent.equals("%")) {
         return Attack.ROAR;
      } else if (opponent.equals("S")) {
         return Attack.POUNCE;
      } else {   //opponent is not ant shaped or stone shaped
         return Attack.SCRATCH;
      }
   }

   //return its moving direction as a Direction class object
   public Direction getMove() {
      if (move == 3) {
         move = 0;
         randDirect = rand.nextInt(4);
      }
      move++;
      if (randDirect == 0) {
         move = 3;
         return Direction.CENTER;
      } else if (randDirect == 1) {
         return Direction.NORTH;
      } else if (randDirect == 2) {
         return Direction.EAST;
      } else if (randDirect == 3) {
         return Direction.SOUTH;
      } else {   //randDirect == 4
         return Direction.WEST;
      }
   }
   
   //return how the husky look like as a String
   public String toString() {
      return "W";
   }
}