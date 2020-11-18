import java.util.*;

public class CodeRevise {
   public static void main(String[] args) {
      int[] a = {0, 1, 3, 2, 3, 4, 0, 5};
      int[] c = {1, 2};
      System.out.println(longestSortedSequence(a));
      banish2(a, c);
      System.out.println(Arrays.toString(a));
      String[] b = {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"};
      System.out.println(Arrays.toString(compress(a)));
      System.out.println(isPalindrome(b));
      evenOdd(a);
      System.out.println(Arrays.toString(a));
   }

   public static int[] compress(int[] a){
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(a[0]);
      for (int i = 1; i < a.length; i++) {
         boolean test = true;
         for (int j = 0; j < i; j++) {
            if (a[i] == a[j]) {
               test = false;
            }
         }
         if (test) {
            numbers.add(a[i]);
         }
      }
      int[] c = new int[numbers.size()];
      for (int x = 0; x < numbers.size(); x++) {
         c[x] = numbers.get(x);
      }
      return c;
   }
   
   public static boolean isPalindrome(String[] a) {
      String[] b = new String[a.length / 2];
      String[] c = new String[a.length / 2];
      for (int i = 0; i < a.length / 2; i++) {
         if (a[i] != a[a.length - i - 1]) {
            return false;
         }
      }
      return true;
   }
   
   public static void sort(int[] a) {
      int temp = 0;
      for (int i = 0; i < a.length - 1; i++) { //loops * 2, if (a[j] > a[j+ 1]), exchange
         for (int j = 0; j < a.length - 1; j++) {
            if (a[j] > a[j + 1]) {
               temp = a[j];
               a[j] = a[j+1];
               a[j+1] = temp;
            }
         }
      }
   }
   
   public static void evenBeforeOdd(int[] a) {
      int temp = 0;
      for (int i = 0; i < a.length - 1; i++) {
         for (int j = 0; j < a.length - 1; j++) {
            if (a[j] % 2 == 1 && a[j+1] % 2 == 0) {
               temp = a[j+1];
               a[j+1] = a[j];
               a[j] = temp;
            }
         }
      }
   }
   
   public static void evenOdd(int[] a) {
      for (int i = 0; i < a.length; i++) {
         if (a[i] % 2 != i % 2) {
            for (int j = i + 1; j < a.length; j++) {
               if (a[j] % 2 == i % 2) {
                  int temp = a[j];
                  a[j] = a[i];
                  a[i] = temp;
               }
            }
         }
      }
   }
   
   public static void banish(int[] a, int[] b) {
      for (int i = 0; i < b.length; i++) {
         for (int j = 0; j < a.length; j++) {
            if (a[j] == b[i]) {
               for (int k = j; k < a.length - 1; k++) {
                  a[k] = a[k+1];
                  if (k == a.length - 2) {
                     a[k+1] = 0;
                  }
               }
               j--;   //index!!
            }
         }
      }
   }
  
   public static void banish2(int[] a, int[] b) {
      for(int i = a.length - 1; i >= 0; i--) {
         for (int j = 0; j < b.length; j++) {
            if (a[i] == b[j]) {
               a[i] = 0;
               for (int k = i; k < a.length - 1; k++) {
                  a[k] = a[k+1];
                  if (k == a.length - 2) {
                     a[k+1] = 0;
                  }
               }
            }
         }
      }
   }
   
   public static int range(int[] a) {
      int max = a[0];
      int min = max;
      for (int i = 1; i < a.length; i++) {
         max = Math.max(a[i], max);
         min = Math.min(a[i], min);
      }
      return max - min + 1;
   }
   
   public static int kthLargest(int[] a, int num) {
      for (int i = 0; i < a.length - 1; i++) {
         if (a[i] < a[i+1]) {
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
         }
      }
      return a[a.length - num - 1];
   }
   
   public static int longestSortedSequence(int[] a) {
      int sort = 1;
      int sortMax = 1;
      for (int i = 0; i < a.length - 1; i++) {
         if (a[i] <= a[i+1]) {
            sort++;
            sortMax = Math.max(sort, sortMax);
         } else {
            sort = 1;
         }
      }
      return sortMax;
   }
}