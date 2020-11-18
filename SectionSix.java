//section note
//10.26, Thur
//

import java.util.*;

public class SectionSix {
   public static void main(String[] args) {
      Random rand = new Random();
      whitakerWalk(rand);
   }
   
   public static void whitakerWalk(Random rand) {
      int position = 0;
      System.out.println("position = 0");
      int max = 0;
      boolean random = rand.nextBoolean();
      while (position < 3 && position > -3) {
         if (random == true) {
            position++;
         } else {
            position--;
         }
         
         //***position = position + 2 * rand.nextInt(2) - 1
         //***position = position + (+-1) !!!!!
         
         if (position > max) {
            max = position;
         }
         
         System.out.println("position = " + position);
         random = rand.nextBoolean();
      }
      System.out.println("max position = " + max);
      System.out.println("dupdu!")
   }
}