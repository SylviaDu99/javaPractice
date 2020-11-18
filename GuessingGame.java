// Jingyun Du
// 10/31/17
// CSE142
// TA: Judith Kim
// Assignment #5
//
// This program will print out a reversable guessing game with a haiku form
// introduction and an summary of the statistics of the games played.
// Max of the random number controled by class constant MAX.

import java.util.*;

public class GuessingGame {
   public static final int MAX = 100;   //control the max of the random number
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      Random rand = new Random();
      haiku();
      int tries = random(rand, console);
      String again = again(console);
      int totalGames = 1;
      int totalTries = tries;
      int minTries = tries;
      while (again.equals("y")) {
         tries = random(rand, console);
         again = again(console);
         totalGames++;
         totalTries += tries;
         if (tries < minTries) {
            minTries = tries;
         }
      }
      statistics(totalGames, totalTries, minTries);
   }
   
   //prints the haiku form introduction
   public static void haiku() {
      System.out.println("This is a game that");
      System.out.println("Let you guess a number which");
      System.out.println("I am thinking of");
      System.out.println();
   }
   
   //use random to create a random number between 1 and max
   //use scanner to take in the user's guess and print out if the guess is
   //higher or lower than the random number and let the user give another guess
   //after the guess match the number, print out the number of tries and return it
   public static int random(Random rand, Scanner console) {
      int random = rand.nextInt(MAX) + 1;
      System.out.println("I'm thinking of a number between 1 and " + MAX + "...");
      System.out.print("Your guess? ");
      int guess = console.nextInt();
      int tries = 1;
      while (guess != random) {
         if (guess < random) {
            System.out.println("It's higher.");
         } else {   //guess > random
            System.out.println("It's lower.");
         }
         System.out.print("Your guess? ");
         guess = console.nextInt();
         tries++;
      }
      if (tries == 1) {
         System.out.println("You got it right in 1 guess!");
      } else {   //tries > 1
         System.out.println("You got it right in " + tries + " guesses!");
      }
      return tries;
   }
   
   //ask the user whether to play the guessing game again
   //use scanner to take in the user's input string and return it
   public static String again(Scanner console) {
      System.out.print("Do you want to play again? ");
      String decide = console.next();
      String initial = decide.substring(0, 1).toLowerCase();
      System.out.println();
      return initial;
   }
   
   //totalGames = number of guessing games played
   //totalTries = total number of guesses of all games played
   //minTries = minimum number of tries of all games played
   //prints out the overall result of all games played
   //including numbers of games played, total tries done,
   //and number of fewest tries to win the game
   public static void statistics(int totalGames, int totalTries, int minTries) {
      double guessPerGame = (double)totalTries / totalGames;
      System.out.println("Overall results:");
      System.out.println("Total games   = " + totalGames);
      System.out.println("Total guesses = " + totalTries);
      System.out.printf("Guesses/game  = %.1f\n", guessPerGame);
      System.out.println("Best game     = " + minTries);
   }
}