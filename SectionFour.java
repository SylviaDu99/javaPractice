//lecture note
//10.18, Wed
//TA: Judith Kim
//
//

public class SectionFour {
   public static void main(String[] args) {
      System.out.println(fractionSum(2));
      printTriangleType(5, 7, 7);
      printTriangleType(6, 6, 6);
      printTriangleType(5, 7, 8);
      printTriangleType(12, 18, 12);
   }
   
   public static double fractionSum(int n) {
      double sum = 0;
      for(double i = 1; i <= n; i++) {
         sum = sum + (1 / i);
      }
      return sum;
   }
   
   public static void printTriangleType(int a, int b, int c) {
      if (a == b & b == c) {
         System.out.println("equilateral");
      } else if (a == b | b == c | c == a) {
         System.out.println("isosceles");
      } else {
         System.out.println("scalene");
      }
   }
}