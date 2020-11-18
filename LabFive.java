//lab notes
//10.24, Tue
//TA: Judith Kim
//

import java.util.*;

public class LabFive {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
   
      String str1 = "Whitaker Brand";
      String str2 = "Stuart Reges";
      String str3 = "take";
      String str4 = "Gandalf the GRAY";
      String str5 = str4.replace("gray", "white");
      int index = str1.toLowerCase().indexOf("B");
      System.out.println(index);
      System.out.println(str5);
      System.out.println(str1.charAt(3));
      System.out.println(str1.indexOf(str3));
      System.out.println(str1.indexOf("o")); //print -1 for not exist
      System.out.println(str1.length());
      str1 = str1.replace(str1, str2);
      System.out.println(str3.replace("a", "oo"));
      System.out.println(str1.toLowerCase());
      System.out.println(str1.toUpperCase());
      System.out.println(str1.substring(1, 3));
      System.out.println(str2.substring(2));
      name(console);
      processName(console);
      
      printFactors(24);
   }
   
   public static void name(Scanner console) {
      System.out.print("Type your name: ");
      String input = console.nextLine();
      char char1 = input.charAt(0);
      int index = input.indexOf(" ");
      String str2 = input.substring(index + 1);
      String name = str2 + ", " + char1 + ".";
      System.out.println("Your name is: " + name);
   }
   
   public static String repl(String str, int num) {
      String strnum = "";
      for (int i = 1; i <= num; i++) {
         strnum += str;
      }
      return strnum;
   }
   
   public static void printLetters(String text) {
      if (text.length() > 0) {
         System.out.print(text.charAt(0));
         for (int i = 1; i < text.length(); i++) {
            System.out.print("-" + text.charAt(i));
         }
      }
      System.out.println();
   }
   
   public static void processName(Scanner console) {
      System.out.print("Type your name: ");
      String input = console.nextLine();
      int index = input.indexOf(" ");
      int length = input.length();
      while (index == -1 || length < 5) {
         System.out.println("Error, must be at least 5 chars with a space.");
         System.out.print("Type your name: ");
         input = console.nextLine();
         index = input.indexOf(" ");
         length = input.length();
      }
      char char1 = input.charAt(0);
      int num = input.indexOf(" ");
      String str2 = input.substring(index + 1);
      String name = str2 + ", " + char1 + ".";
      System.out.println("Your name is: " + name);
   }
   
   public static void digitSum(int a) {
      int sum = 0;
      if (a < 0) {
         a = -a;
      }
      while (a % 10 != 0 || a != 0) {
         sum += a % 10;
         a = a / 10;
      }
      System.out.println(sum);
   }
   
   public static void printFactors(int b) {
      System.out.print(1);
      for (int i = 2; i <= b; i++) {
         if (b % i == 0) {
            System.out.print(" and " + i);
         }
      }
   }
   
   public static void longestName(Scanner console, int n) {
      String longname = "";
      int maxlength = 0;
      int tie = 3;
      for (int i = 1; i <= n; i++) {
         System.out.print("name #" + i + "? ");
         String name = console.nextLine();
         int length = name.length();
         if (length > maxlength) {
            maxlength = length;
            longname = name;
            tie = 0;
         } else if (length == maxlength) {
            tie = 1;
         }
      }
      String ongname = longname.substring(1);
      String LONGNAME = longname.toUpperCase();
      char L = LONGNAME.charAt(0);
      longname = L + ongname.toLowerCase();
      System.out.println(longname + "'s name is longest");
      if (tie == 1) {
         System.out.println("(There was a tie!)");
      }
   }
}

//String a = "hello";
//String b = "hello";
// a == b?           
//false

//String a = "hello";
//String b = "hello";
// a.equals(b)? 
//true

//String a = "world";
//String b = a;
// a == b?          
//true

//String a = "world";
//String b = a;
// a.equals(b)? 
//true