//lecture note
//11.13, Mon
//TA: Judith Kim
//
//arrays

import java.util.*;

public class Lecture18 {
   public static void main(String[] args) {
      int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23};
      String[] words = {""};
      System.out.println("Primes contains: " + Arrays.toString(primes));
      modify(primes);
      System.out.println("Primes contains: " + Arrays.toString(primes));   //primes change!!
      int x = 1;
      System.out.println(x);
      modifyInt(x);
      System.out.println(x);   //x wont change!!!
      int sum = sum(primes);
      mystery();
   }
   
   public static void modifyInt(int x) {
      x = x + 1;
   }
   
   public static void modify(int[] values) {
      values[4] = 1337;
      values[6] = 1001;
   }
   
   public static int sum(int[] values) {
      int sum = 0;
      for (int i = 0; i < values.length; i++) {
         sum += values[i];
      }
      return sum;
   }
   
   public static void mystery() {
      int[] a = {1, 7, 5, 6, 4, 14, 11};
      for (int i = 0; i < a.length - 1; i++) {
         if (a[i] > a[i + 1]) {
            a[i + 1] = a[i + 1] * 2;
         }
      }
      System.out.println("mystery array = " + Arrays.toString(a));
   }
}