/*
This class creates dices with min and max decided by input
Roll by java random, thx
*/

import java.util.*;

public class Dice {
   
public static final int MIN = 1;  // default min = 1

   public int max;
   
   // create a default dice with maximum of 6
   public Dice() {
      this.max = 6;
   }
   
   // change the maximum of the dice
   public void modify(int max) {
      this.max = max;
   }
   
   // roll the dice
   public int roll() {
      Random rand = new Random();
      return rand.nextInt(max) + MIN;
   }
   
   public int getMax() {
      return this.max;
   }
}