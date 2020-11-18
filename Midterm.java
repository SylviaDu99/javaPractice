//midterm
//

public class Midterm {
   public static void main(String[] args) {
      //System.out.print(printSequenceTo(3.0));
      System.out.println(acronym("  loner  "));
   }
   
   public static int printSequenceTo(double n) {
      double sum = 0.5;   //0.0;
      double i = 1.0;   //0.0;
      int j = 1;   //0;
      //sum += i / (i + 1);
      //i = i + 1;
      //j++;
      System.out.print(j + "/" + (j + 1));
      while (sum < n) {
         //sum += i/ (i + 1);
         j++;
         i++;
         sum += i / (i + 1);   // 
         System.out.print(" + " + j + "/" + (j + 1));
      }
      System.out.print(" = " + sum);
      System.out.println();
      return j;
   }
   
   public static String acronym(String words) {
      String result = "";
      int length = words.length();
      int i = 0;
      String sub1 = " ";
      while (i < length) {
         while (i < length && sub1.equals(" ")) {
            sub1 = words.substring(i, i + 1);
            i++;
         }
         if (!sub1.contains(" ")) {
            result += sub1.toUpperCase();
         }
         while (i < length && !sub1.equals(" ")) {
            sub1 = words.substring(i, i + 1);
            i++;
         }
      }
      return result;
   }
}