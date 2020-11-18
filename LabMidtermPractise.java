//lab note
//10.31, Tue
//Happy Halloween
//TA: Judith Kim
//

import java.util.*;

public class LabMidtermPractise {
   public static void main(String[] args) {
      Random rand = new Random();
      System.out.println(swapPairs("abcde"));
   }
   
   public static void makeGuesses(Random rand) {
      int guess = rand.nextInt(50) + 1;
      System.out.println("guess = " + guess);
      int tries = 1;
      while (guess < 48) {
         guess = rand.nextInt(50) + 1;
         System.out.println("guess = " + guess);
         tries++;
      }
      System.out.println("total guesses = " + tries);
   }
   
   public static boolean allDigitsOdd(int num) {
      while (num % 2 != 0) {
         num /= 10;
         if (num == 0) {
         return true;
         }
      }
      return false;
   }
   
   public static String swapPairs(String word) {
      int length = word.length();
      String word2 = "";
      int i = 0;
      while (i < length - 1) {
         word2 += word.substring(i + 1, i + 2);
         word2 += word.substring(i, i + 1);
         i += 2;
      }
      if (length % 2 != 0) {
         word2 += word.substring(length - 1);
      }
      return word2;
   }
}