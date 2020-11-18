public class QuizThree {
   public static void main(String[] args) {
      drawFigure();
   }
   public static void drawFigure() {
      for (int line = 1; line <= 5; line++) {
         for (int slash = 1; slash <= -4 * line + 20; slash++) {
            System.out.print("/");
         }
         for (int star = 1; star <= 8 * line - 8; star++) {
            System.out.print("*");
         }
         for (int bslash = 1; bslash <= -4 * line + 20; bslash++) {
            System.out.print("\\");
         }
         System.out.println();
      }
   }
}