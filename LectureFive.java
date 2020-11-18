//Lecture notes
//using SIZE!!
//10.6, Fri.
//
//using parameter!!

public class LectureFive {
   public static final int SIZE = 9;
   
   public static void main(String[] args) {
      drawTopHalf();
      drawBottomHalf();
      printStars(5); //*****parameter!
   }
   
   public static void printStars(int n) {
      for (int i = 1; i <= n; i++) {
         System.out.print("*");
      }
   }
   
   public static void drawTopHalf() {
      for (int line = 1; line <= SIZE; line++) {
         //print one line
         //print spaces
         for (int space = 1; space <= SIZE - line; space++) {
            System.out.print(" ");
         }
         //print a slash
         System.out.print("/");
         //print periods
         for (int period = 1; period <= 2 * line - 2; period++) {
            System.out.print(".");
         }
         //print a backslash
         System.out.println("\\");
      }
   }
   
   public static void drawBottomHalf() {
      for (int line = 1; line <= SIZE; line++) {
         //print one line
         //print spaces
         for (int space = 1; space <= line - 1; space++) {
            System.out.print(" ");
         }
         //print a backslash
         System.out.print("\\");
         //print periods
         for (int period = 1; period <= 2 * (SIZE - line); period++) {
            System.out.print(".");
         }
         //print a slash
         System.out.println("/");
      }
   }

}