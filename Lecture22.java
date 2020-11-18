//lecture notes
//11.22, Wed.
//TA: Judith Kim
//foreach loop
//saocaozuo

import java.util.*;

public class Lecture22 {
   public static void main(String[] args) {
   
      int x = 34;
      int y = x++;
      x = 34;
      int z = ++x;
      System.out.println(y);
      System.out.println(z);
   
      int[][] twoD = {
         {1, 2, 3},
         {4, 5, 6},  
      };
      Arrays.stream(twoD)
         .forEach(n -> System.out.println(n));   //cannot print actual arrays
         
      Arrays.stream(twoD)
         .forEach(n -> {
            Arrays.stream(n)
               .forEach(num -> System.out.println(num));  //can print nums in arrays 
         });
      System.out.println();
      int[] numbers = {1, 2, 3, 8, 9, 10, 16, -1, 14, 42};
      //for loop
      for (int i = 0; i < numbers.length; i++) {
         System.out.println(numbers[i]);
      }
      //foreach loop
      for (int n : numbers) {
         System.out.println(n);
      }
      //almost latest
      System.out.println("nums: ");
      Arrays.stream(numbers)
         .forEach(n -> System.out.print(n + " "));
      System.out.println();
         
      Arrays   //intake array(.stream), use filter, at the end print or store data...
         .stream(numbers)
         .filter(Lecture22::isEven)   //calling the isEven method
         .filter(n -> n > 3)
         .filter(n -> {
            boolean isEven = n % 2 ==0;
            boolean greaterThanEight = n > 8;
            return isEven && greaterThanEight;
         })
         .sorted()
         .forEach(n -> System.out.print(n + " "));
   }
   
   public static boolean isEven(int n) {
      return n % 2 == 0;
   }
}