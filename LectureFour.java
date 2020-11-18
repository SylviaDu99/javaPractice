//Sylvia
//CSE142
//Oct.4th
//Instructor: Whitaker Brand
//TA: Judith Kim
//
//Class note for lecture 4

public class LectureFour {
   public static void main(String[] args) {
      
      int x = 3; //x++ is x+1
      double grade = 4.0;
      String s = "hello"; //String!
      
      for (int i = 1; i <= 10; i++) { //start, condition, update(after the for loop)
         System.out.print("*"); //test condition, print, update
      } //closing the for loop!!!!!!
      System.out.println(); //print nothing and change the line
      System.out.println("yay!");
      
      drawTopHalf();
      drawBottomHalf();
   }   
      
      
   public static void drawTopHalf() {
      for (int line = 1; line <= 3; line++) {
         //print one line
         //print spaces
         for (int space = 1; space <= 3 - line; space++) {
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
      for (int line = 1; line <= 3; line++) {
         //print one line
         //print spaces
         for (int space = 1; space <= line - 1; space++) {
            System.out.print(" ");
         }
         //print a backslash
         System.out.print("\\");
         //print periods
         for (int period = 1; period <= 6 - 2 * line; period++) {
            System.out.print(".");
         }
         //print a slash
         System.out.println("/");
      }
   }
   
}