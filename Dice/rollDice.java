/*
This class rolls the dice created by Dice class
Enjoy your trip!
*/

import java.util.*;

public class rollDice {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.println();
      System.out.println("Welcome!");
      Dice d = new Dice();
      d = create(console, d);
      roll(console, d);
      again(console, d);
   }
   
   // roll the dice, times input by user
   public static void roll(Scanner console, Dice d) {
      boolean flag = true;
      int n = -1;
      while (flag) {
         try {
            System.out.println("Enter the number of time you want to roll the dice:");
            String temp = console.next();
            n = Integer.parseInt(temp);
            flag = false;
         } catch (NumberFormatException e) {
            System.out.println("Invalid input, please try again.");
            System.out.println();
         }
      }
      System.out.println();
      for (int i = 1; i <= n; i++) {
         System.out.println(d.roll());
      }
   }
   
   // modify the maximum of the dice if the maximum entered by user is not same as it is
   public static Dice create(Scanner console, Dice d) {
      System.out.println();
      boolean flag = true;
      int max = 1;
      do {
         try {
            System.out.println("Please input the maximum of the dice:");
            String temp = console.next();
            max = Integer.parseInt(temp);
            flag = false;
         } catch (NumberFormatException e) {
            System.out.println("Invalid input, please try again.");
            System.out.println();
         }
      } while (flag);
      if (max != d.getMax()) {
         d.modify(max);
      }
      return d;
   }
   
   // ask the user whether to roll again, maximum could be changed
   public static void again(Scanner console, Dice d) {
      System.out.println();
      System.out.println("Do you want to roll again? (y for yes, n for no)");
      String yn = console.next();
      if (yn.equalsIgnoreCase("y")) {
         d = create(console, d);
         roll(console, d);
         again(console, d);
      } else if (yn.equalsIgnoreCase("n")) {
         System.out.println();
         System.out.print("Thank you for using rollDice, enjoy your trip!");
      } else {
         System.out.println("Invalid input, please try again.");
         again(console, d);
      }
   }
}