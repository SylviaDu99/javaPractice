// Jingyun Du
// 10/7/17
// CSE142
// TA: Judith Kim
// Assignment #2B
//
// This program will print a Space Needle!

public class SpaceNeedle {
   public static final int SIZE = 4;
   
   public static void main(String[] args) {
      thin();
      top();
      bottom();
      thin();
      thick();
      top();
   }
   
   //prints out the thin parts(||) of the space needle.
   public static void thin() {
      for (int line = 1; line <= SIZE; line++) {
         for (int space = 1; space <= 3 * SIZE; space++) {
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   
   //prints out the top half of the main part
   //of the space needle (same with the very bottom part).
   public static void top() {
      for (int line = 1; line <= SIZE; line++) {
         for (int space = 1; space <= 3 * SIZE - 3 * line; space++) {
            System.out.print(" ");
         }
         System.out.print("__/");
         for (int dot = 1; dot <= 3 * (line - 1); dot++) {
            System.out.print(":");
         }
         System.out.print("||");
         for (int dot = 1; dot <= 3 * (line - 1); dot++) {
            System.out.print(":");
         }
         System.out.println("\\__");
      }
      System.out.print("|");
      for (int quote = 1; quote <= 6 * SIZE; quote++) {
         System.out.print("\"");
      }
      System.out.println("|");
   }
   
   //prints out the bottom half of the main part of the space needle.
   public static void bottom() {
      for (int line = 1; line <= SIZE; line++) {
         for (int space = 1; space <= 2 * line - 2; space++) {
            System.out.print(" ");
         }
         System.out.print("\\_");
         for (int slash = 1; slash <= 3 * SIZE - 2 * line + 1; slash++) {
            System.out.print("/\\");
         }
         System.out.println("_/");
      }
   }
   
   //prints out the thicker verticle part of the space needle.
   public static void thick() {
      for (int line = 1; line <= SIZE * SIZE; line++) {
         for (int space = 1; space <= 2 * SIZE + 1; space++) {
            System.out.print(" ");
         }
         System.out.print("|");
         for (int remainder = 1; remainder <= SIZE - 2; remainder++) {
            System.out.print("%");
         }
         System.out.print("||");
         for (int remainder = 1; remainder <= SIZE - 2; remainder++) {
            System.out.print("%");
         }
         System.out.println("|");
      }
   }
}