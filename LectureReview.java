//lecture note
//12.6, Wed.
//
//programming problems

import java.util.*;

public class LectureReview {
   public static void main(String[] args) {
      int[] a = {1, 3, 2, 5, 7};
      int[] b = {9, 8, 7, 6, 5, 4, 3};
      System.out.println(isSorted(a));
      rotateLeft(a);
      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(interleave(a, b)));
   }
   
   public static boolean isSorted(int[] a) {
      for (int i = 0; i < a.length - 1; i++) {
         if (a[i] > a[i + 1]) {
            return false;
         }
      }
      return true;
   }

   public static void rotateLeft(int[] a) {
      int initial = a[0];
      for (int i = 0; i < a.length - 1; i++) {
         a[i] = a[i + 1];
      }
      a[a.length - 1] = initial;
   }
   
   public static int[] interleave(int[] a, int[] b) {
      int l = Math.min(a.length, b.length);
      int[] all = new int[2 * l];
      for (int i = 0; i < l; i++) {
         all[i*2] = a[i];
         all[i*2 + 1] = b[i];
      }
      return all;
   }
}