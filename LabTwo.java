public class LabTwo {
   public static void main(String[] args) {
      //for (int i = 1; i <= 10; i++) {
      //   System.out.println("We're number one!");
      //}
      
      //for(int i = 1; i <= 5; i++) {
      //   System.out.print(i + "~");
      //}
      
      //for (int i = 1; i <= 4; i++) {
      //   System.out.print(">");
      //}
      //System.out.println();
      //System.out.print("CSE142");
      //for (int i = 1; i <= 4; i++) {
      //   System.out.print("<");
      //}
      
      //for (int i = 1; i <= 4; i++) {
      //   System.out.print("**");
      //}
      
      //for (int i = 1; i <= 4; i++) {
      //   System.out.println("2 times " + i + " = " + 2 * i);
      //}
      
      //int number = 32;
      //for (int count = 1; count <= number; count++) {
      //   System.out.println(number);
      //   number = number / 2;
      //}
      
      //for (int i = 1; i <= 10; i++) {
      //   System.out.print(i * i + " ");
      //}
      
      //for (int i = 1; i <= 4; i++) {
      //   for (int j = 1; j <= 10; j++) {
      //      System.out.print("*");
      //   }
      //   System.out.println();
      //}
      
      //for (int line = 1; line <= 4; line++) {
      //   for (int stars = 1; stars <= 9 - 2 * line ; stars++) {
      //      System.out.print("*");
      //   }
      //   System.out.println();
      //}
      
      //for (int i = 1; i <= 3; i++) {
      //   for (int a = 0; a <= 9; a++) {
      //         for (int b = 1; b <= 3; b++){
      //            System.out.print(a);
      //         }
      //   }
      //   System.out.println();
      //}
      
      //for (int i = 1; i <= 5; i++) {
      //   for (int a = 9; a >= 0; a--) {
      //      for (int b = 1; b <= 5; b++){
      //         System.out.print(a);
      //      }
      //   }
      //   System.out.println();
      //}
      
      for (int line = 1; line <= 7; line++) {
         for (int a = 0; a < 2 * (line - 1); a++) {
            System.out.print("\\");
         }
         for (int b = 1; b <= 30 - 4 * line; b++) {
            System.out.print("!");
         }
         for (int c = 0; c < 2 * (line - 1); c++) {
            System.out.print("/");
         }
         System.out.println();
      }
   }
}