//section notes
//11.16, Thu.
//
//

import java.util.*;

public class SectionSeven {
   public static void main(String[] args) {
      double[] a = {1.0, 2.0, 3.0, 2.9, 3.1};
      int[] b = {3, 8, 19, 7};
      System.out.println(isSorted(a));
      vowelCount("aaaaassriibnooullllle");
      rotateRight(b);
   }
   
   public static boolean isSorted(double[] a) {
      boolean sort = true;
      for (int i = 0; i < a.length - 1; i++) {
         if (a[i] > a[i+1]) {
            sort = false;
            return sort;
         }
      }
      return sort;
   }
   
   public static int[] vowelCount(String uncounted) {
      int[] ret = new int[5];
      char[] dummy = {'a', 'e', 'i', 'o', 'u'};
      for (int i = 0; i < uncounted.length(); i++) {
         for (int j = 0; j < dummy.length; j++) {
            if (uncounted.charAt(i) == dummy[j]) {
               ret[j]++;
            }
         }
      }
      System.out.println(Arrays.toString(ret));
      return ret;
   }
   
   public static void rotateRight(int[] unrotated) {
      int length = unrotated.length;
      int last = unrotated[length - 1];
      for (int i = length - 1; i > 0; i--) {
         unrotated[i] = unrotated[i - 1];
      }
      unrotated[0] = last;
      System.out.println(Arrays.toString(unrotated));
   }
}