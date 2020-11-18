import java.util.*;

public class PracticeItFinal {
   public static void main(String[] args) {
      int[] a = {1, 3, 5, 7, 1, 3, 9};
      int[] b = {1, 3};
      zeroOut(a, b);
      System.out.println(Arrays.toString(a));
      int[] c = {0, 0};
      int[] d = {0};
      System.out.println(hasMirrorTwice(c, d));
      reverseChunks(a, 2);
   }
   
   public static void zeroOut(int[] a, int[] b) {
      int index = 0;
      boolean test = true;
      for (int i = 0; i < a.length; i++) {
         if (a[i] != b[index]) {
            test = false;
            index = 0;
         } else {
            test = true;
            index++;
         }
         if (index == b.length && test) {
            for (int j = i; j > i - b.length; j--) {
               a[j] = 0;
            }
            index = 0;
         }
      }
   }
   
   public static boolean hasMirrorTwice(int[] a, int[] b) {
      int index = 0;
      int one = 0;
      boolean two = false;
      for (int i = a.length - 1; i >= 0; i--) {
         if (a[i] == b[index]) {
            index++;
         }
         if (index == b.length) {
            one++;
            index = 0;
            i += b.length - 1;
         }
      }
      if (one >= 2) {
         two = true;
      }
      return two;
   }
   
   public static int mode(int[] a) {
      int most = a[0];
      int length = 1;
      int length2 = 1;
      for (int i = 0; i < a.length - 1; i++) {
         if (a[i] == a[i+1]) {
            length2++;
         } else {
            if (length < length2) {
               length = length2;
               most = a[i];
            }
            length2 = 1;
         }
      }
      return most;
   }
   
   public static boolean contains(int[] a, int[] b) {
      int index = 0;
      boolean c = true;
      for (int i = 0; i < a.length; i++) {
         if (a[i] ==  b[index]) {
            index++;
            c = true;
            if (index == b.length) {
               return c;
            }
         } else {
            if (index != 0) {
               i -= index - 1;
            }
            index = 0;
            c = false;
         }
      }
      return false;
   }
   
   public static void reverseChunks(int[] a, int num) {
      for (int i = 0; i < a.length - a.length % num; i+=num) {
         int index = i + num - 1;
         for (int j = i; j < i + num / 2; j++) {
            int temp = a[j];
            a[j] = a[index];
            a[index] = temp;
            index--;
         }
      }
   }
   
   public static String[] sandwich(String word, String[] a, int num) {
      int length = a.length;
      String[] b = new String[length * num + 2];
      for (int i = 0; i < length; i++) {
         for (int k = i+1; k < b.length - 1; k+=length) {
            b[k] = a[i];
         }
      }
      b[0] = word;
      b[b.length - 1] = word;
      return b;
   }
   
   public static void caughtSkipping(String[] a, String one, String two) {
      boolean test = false;
      int first = -1;
      int second = -1;
      for (int i = 0; i < a.length; i++) {
         if (a[i].equals(one) && (first == -1 || second == -1)) {
            first = i;
         } else if (a[i].equals(two)) {
            second = i;
         }
      }
      if (first < second && first != -1 && second != -1) {
         String temp1 = a[first];
            for (int i = first; i < a.length -1 ; i++) {
               String temp = a[i];
               a[i] = a[i+1];
               a[i+1] = a[i];
            }
         a[a.length-1] = temp1;
      }
   }
}