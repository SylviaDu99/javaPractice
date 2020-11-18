//Lecture Notes!
//10.9, Mon
//CSE142
//
//char!
//
//


public class LectureSix {
   public static void main(String[] args) {
      char star = '*'; //use ' ' !!!
      char exclam = '!';
      lineOfSth(5, star);
      lineOfSth(7, exclam);
   }
   
   public static void lineOfSth(int n, char c) {
      for (int i = 1; i <= n; i++) {
         System.out.print(c);
      }
   }
}