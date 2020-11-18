//section hmwk
//10.25, Wed
//

import java.util.*;

public class SectionFive {
   public static void main(String[] args) {
      Random rand = new Random();
      randomX(rand);
   }
   
   public static void randomX(Random rand) {
      int num = rand.nextInt(15) + 5;
      while (num < 16) {
         for (int i = 1; i <= num; i++) {
            System.out.print("x");
         }
         System.out.println();
         num = rand.nextInt(15) + 5;
      }
      for (int i = 1; i <= num; i++) {
            System.out.print("x");
      }
   }
}