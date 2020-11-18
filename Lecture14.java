//lecture note
//10.30, Mon
//TA: Judith Kim
//type boolean
//

import java.util.*;

public class Lecture14 {
   public static void main(String[] args) {
      int age = 20;
      boolean minor = (age < 21);
      boolean iLoveCSE = false;
      if (!bothOdd(7, 13)) {
         System.out.println("a");
      }
      Scanner console = new Scanner(System.in);
      System.out.print("Type two words: ");
      String word1 = console.next();
      String word2 = console.next();
      if (alliterative(word1, word2)) {
         System.out.println("alliterate");
      }
      if (ryhme(word1, word2)) {
         System.out.println("ryhme");
      }
   }
   
   public static boolean bothOdd(int a, int b) {
      return a % 2 != 0 && b % 2 != 0;   //better structure
   }
   
   public static boolean alliterative(String word1, String word2) {
      return word2.startsWith(word1.substring(0, 1));
   }
   
   public static boolean ryhme(String word1, String word2) {
      return word2.endsWith(word1.substring(word1.length()-2));
   }
}