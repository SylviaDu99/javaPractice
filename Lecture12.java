//lecture note
//10.25, Wed
//TA: Judith Kim
//random!
//gamblin'!
//lecture 13 as well!
//10.27, Fri
//do / while loop!
//Happy W Day!

import java.util.*;

public class Lecture12 {
   public static void main(String[] args) {
      Random rand = new Random();
      int n = rand.nextInt(20) + 1;  //to get a random num from 1 - 20
      //name.nextInt(size of range) + min, size of range = max - min + 1
      //***
      //A random even number between 4 and 12 inclusive
      //int random3 = rand.nextInt(5) * 2 + 4;
      //***
      double m = rand.nextDouble();  //double from 0.0(included) to 1.0(not included)
      dice(rand);
      Scanner console = new Scanner(System.in);
      roulette(rand, console);
   }
   
   public static void dice(Random rand) {
      int tries = 0;
      int sum = 0;
      
      //**int sum;
      //do {
      //   int roll1 = ...
      //   int roll2 = ...
      //   sum = roll1 + roll2;
      //   System.out.println...
      //   tries++
      //} while (sum != 7);
      //System.out.println...
      //*****!!!!!!!!
      
      while (sum != 7) {
         int roll1 = rand.nextInt(6) + 1;
         int roll2 = rand.nextInt(6) + 1;
         sum = roll1 + roll2;
         System.out.println(roll1 + " + " + roll2 + " = " + sum);
         tries++;
      }
      if (tries == 1) {
         System.out.println("You won after 1 try!");
      } else {
         System.out.println("You won after " + tries + " tries!");
      }
      System.out.println();
   }
   
   public static void roulette(Random rand, Scanner console) {
      int money = 1000;
      while (money > 0) {
         System.out.println("You have $" + money);
         System.out.print("How much would you like to bet? ");
         int bet = console.nextInt();
         money -= bet;
         System.out.print("Your guess? (0-36) ");
         int guess = console.nextInt();
         int roll = rand.nextInt(37);  //***random int between 0 and 36!!!
         System.out.println("The number was " + roll);
         if (guess == roll) {
            money += bet * 35;
         }
      }
      System.out.println("You ran out of money.");
   }
}