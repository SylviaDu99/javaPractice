// Jingyun Du
// 10/7/17
// CSE142
// TA: Judith Kim
// Assignment #2A
//
// This program will print a ASCII art.
// Original character comes from Gyakumanga Biyori, I don't own anything...

public class AsciiArt {
   public static void main(String[] args) {
      ear();
      eyes();
      nose();
      mouth();
      jaw();
   }
   
   public static void ear() {
      for (int part = 1; part <= 2; part++) {
         for (int space = 1; space <= 4; space++) {
            System.out.print(" ");
         }
         for (int line = 1; line <= 2; line++) {
            System.out.print("_");
         }
         for (int space = 1; space <= 3; space++) {
            System.out.print(" ");
         }
      }
      System.out.println();
      System.out.println("   /  \\     /  \\");
      System.out.println("   \\  /_____\\  /");
   }
   
   public static void eyes() {
      System.out.println("   / ___   ___ \\");
      System.out.println("  /   .     .   \\");
   }
   
   public static void nose() {
      System.out.println(" /       _       \\");
      System.out.println("(       \\_/       )");
   }
   
   public static void mouth() {
      System.out.println(" \\     __|__     /");
   }
   
   public static void jaw() {
      System.out.println("  \\_           _/");
      System.out.println("    \\_________/");
   }
}