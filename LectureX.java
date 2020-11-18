//lecture note
//12.4, Mon.
//
//ArrayList

import java.util.*;

public class LectureX {
   public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<String>();
      names.add("Stuart Reges");
      names.add(0, "Whitaker Brand");
      
      ArrayList<Integer> numbers = new ArrayList<Integer>();   //use Integer, NOT int
      numbers.add(15);
      numbers.add(99);
      numbers.add(42);
      numbers.add(57);
      
      System.out.println(names);
      System.out.println(numbers.get(0));
      System.out.println(numbers.size());
      
      minToFront(numbers);
      System.out.println(numbers);
      
      stutters(numbers);
   }
   
   //clear()
   //indexOf()
   //set(int, value)
   
   public static void minToFront(ArrayList<Integer> numbers) {
      int minIndex = 0;
      int minValue = numbers.get(0);
      for (int i = 1; i < numbers.size(); i++) {
         if (numbers.get(i) < minValue) {
            minValue = numbers.get(i);
            minIndex = i;
         }
      }
      numbers.remove(minIndex);
      numbers.add(0, minValue);
   }
   
   public static void stutters(ArrayList<Integer> numbers) {
      for (int i = 0; i < numbers.size(); i+=2) {
         numbers.add(i, numbers.get(i));
      }
      System.out.println(numbers);
   }
}