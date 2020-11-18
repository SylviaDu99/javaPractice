//lecture notes
//10.23, Mon
//TA: Judith Kim
//for loop(fence post analogy), while, sentinel values
//

import java.util.*;

public class LectureEleven {
   public static void main(String[] arg) {
      printPrimes(50);
      
      //while loop!!
      int a = 1;
      while (a <= 200) {
         System.out.print(a + " ");
         a = a * 2;
      }
      System.out.println();
      
      Scanner console = new Scanner(System.in);
      int sum = 0;
      System.out.print("Type a line (or \"quit\" to exit):");
      String response = console.nextLine();
      
      while(!response.equals("quit")) {
         sum += response.length();
         System.out.print("Type a line (or \"quit\" to exit):");
         response = console.nextLine();
      }
      System.out.println("You typed a total of " + sum + " characters.");
   }
   
   //print either first or last out of the loop
   public static void printPrimes(int max) {
      if (max >= 2) {
         System.out.print(2);
      }
      for (int i = 3; i <= max; i++) {
         if (countFactors(i) == 2) {
            System.out.print(", " + i);
         }
      }
      System.out.println();
   }
   
   public static int countFactors(int num) {
      int factor = 0;
      for (int i = 1; i <= num; i++) {
         if (num % i == 0) {
            factor++;
         }
      }
      return factor;
   }
   
   
}