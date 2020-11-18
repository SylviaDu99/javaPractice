//lecture note
//10.20, Fri
//TA: Judith Kim
//indexes, char, string methods!!
//

import java.util.*;

public class LectureTen {
   public static void main(String[] args) {
      String a = "abc";
      String s1 = "Stuart Reges";
      System.out.println(a.length());
      System.out.println(a.indexOf("b"));
      System.out.println(s1.substring(7, 10));
      String s2 = s1.substring(2, 9);
      System.out.println(s2.toLowerCase());
      String book = "Building Java Programs";
      String BOOK = book.toUpperCase();
      System.out.println(BOOK);
      
      Scanner console = new Scanner(System.in);
      System.out.print("What's your name? ");
      String name = console.next();
      if (name.equals("Barney")) {
         System.out.println("Barney!");
      } else {
         System.out.println("ok...");
      }
      System.out.println(book.equalsIgnoreCase(BOOK));
      //Similar methods that return booleans
      //
      //startsWith()
      //endsWith()
      //contains()
      String w = "Whitaker Brand";
      char initial = name.charAt(0);
      String finWord = w.substring(w.indexOf(" ") + 1);
      System.out.println(initial + " " + finWord);
   }
   
   
}