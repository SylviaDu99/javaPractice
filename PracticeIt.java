//practice it

import java.util.*;

public class PracticeIt {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      //smallest2(console);
      //digitsInARow(8229);
      //balanceCheckbook(console);
   }
   
   public static boolean sameDashes(String a, String b) {
      int index1 = a.indexOf("-");
      int index2 = b.indexOf("-");
      while (index1 == index2) {
         if (index1 != -1) {
            a = a.substring(index1 + 1);
            b = b.substring(index2 + 1);
            index1 = a.indexOf("-");
            index2 = b.indexOf("-");
         } else {
            return true;
         }
      }
      return false;
   }
   
   public static boolean highLow(int num) {
      int digit = 0;
      if (num < 10) {
         return true;
      } else {
         while (num > 0) {
            digit = num % 10;
            if (digit <= 4) {
               num = num / 10;
               if (num == 0) {
                  return true;
               }
               digit = num % 10;
               if (digit <= 4) {
                  return false;
               }
            } else {
               num = num / 10;
               digit = num % 10;
               if (digit >= 5) {
                  return false;
               }
            }
            num = num / 10;
         }
      }
   return true;
   }
   
   public static void smallest2(Scanner console) {
      System.out.print("number? ");
      int input = console.nextInt();
      int small = 0;
      int small2 = 0;
      if (input >= 0) {
         small = input;
         System.out.print("number? ");
         input = console.nextInt();
         if (input >= small) {
            small2 = input;
         }
      }
      while(input >= 0) {
         if (input <= small) {
            small2 = small;
            small = input;
         }
         System.out.print("number? ");
         input = console.nextInt();
      }
      System.out.println("smallest: " + small);
      System.out.println("second smallest: " + small2);
   }
   
   public static void findAllPerfectUpTo(int max) {
      int sum = 0;
      System.out.print("Perfect numbers up to " + max + ":");
      if (max >= 6) {
         System.out.print(" 6");
      }
      if (max >= 28) {
         System.out.print(" 28");
      }
      if (max >= 496) {
         System.out.print(" 496");
      }
      for (int i = 501; i <= max; i++) {
         for (int j = 1; j < i; j++) {
            if (i % j == 0) {
               sum += j;
            } 
         }
         if (sum == i) {
            System.out.print(" " + i);
         }
      }
   }
   
   public static int digitsInARow(int n) {
      int row = 1;
      int max = 1;
      int digit = 0;
      while (n > 10) {
         digit = n % 10;
         n = n / 10;
         if (n % 10 == digit) {
            row++;
         } else {
            max = Math.max(row, max);
            row = 1;
         }
      }
      max = Math.max(row, max);
      return max;
   }
   
   public static boolean balanceCheckbook(Scanner console) {
      System.out.print("initial balance? ");
      double balance = console.nextDouble();
      System.out.print("how many transactions? ");
      int transaction = console.nextInt();
      double min = balance;
      for (int i = 1; i <= transaction; i++) {
         System.out.print(i + "/" + transaction + " amount? ");
         double amount = console.nextDouble();
         balance += amount;
         if (balance < min) {
            min = balance;
         }
         System.out.println("new balance = $" + balance);
      }
      System.out.println("minimum balance = $" + min);
      if (min <= 0) {
         return true;
      } else {
         return false;
      }
   }
   
   public static String undouble(String s) {
      String result = "";
      if (s.length() > 0) {
         char last = s.charAt(0);
         result += last;
         for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != last) {
               result += s.charAt(i);
            }
            last = s.charAt(i);
         }
      }
      return result;
   }
   
   
}