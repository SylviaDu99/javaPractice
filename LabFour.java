//lab note
//10.17, Tue
//returns and maths and a scanner and ifs and elses and (else if)s

import java.util.*;

public class LabFour {
   public static void main(String[] args) {
      int x = 5;
      x = mystery();
      System.out.println(x);
      
      double a = ageCalculator(19); 
      double b = ageCalculator(32);
      double c = ageCalculator(99);
        
      System.out.println(a); // prints 16.5
      System.out.println(b); // prints 23.0
      System.out.println(c); // prints 56.5
      
      int abs = Math.abs(-8);//absolute value
      double xa = Math.pow(2, 4);//power--2**4
      long rounded = Math.round(2.9);//round--3
      long rounde = Math.round(6.4);//round--6
      double floor = Math.floor(2.9);//floor--2.0
      double ceiling = Math.ceil(8.4);//ceiling--9.0
      
      // console is a common name for a user-input Scanner
      Scanner console = new Scanner(System.in); //System.in--scanner read from user
      
      System.out.print("What's your name? ");
      String name = console.next();
      System.out.println("You are " + name);
      
      //*** nextInt()  //reads the next token, returns it as an int, if possible
      //*** nextDouble()  //reads the next token, returns it as double, if possible
      //*** next()  //reads the next token, returns it as a String
      //*** nextLine()  //reads an entire line, returns it as a String
      
      m = -2;
      if (m < 0) {
         System.out.println("inside if branch!");
      } 
      System.out.println("outside if branch!");
      //above prints: inside if branch!
      //              outside if branch!
      
      if (gpa >= 2.0) {
         System.out.println("Welcome to Mars University!");  // perform this code is gpa >= 2.0
      } else if (gpa < 0.7) {
         System.out.println(":*(");  // execute when gpa < 2.0 and < 1.7 
      } else { 
         System.out.println("Please apply again soon.");     // perform this code is gpa < 2.0
      }
      
      int x = 4;
      if (x < 5) { 
         System.out.println("abc");
      } else if (x < 6) {
         System.out.println("def");
      }
      System.out.println("ghi");
      //above print abc
      //            ghi
      
      lastInt(308);
   }
   
   //*** public static type methodName(parameters) { // calling methodName returns expression
   
      //*** return expression;
   //    }
   //*** type variableName = methodName(parameters); // variableName stores return value
   
   public static int mystery() {
      return 8;
   }
   
   public static double ageCalculator(int age) {
      double date = 0.5 * age + 7;
      return date;
   }
   
   public static double area(double radius) {
      return Math.pow(radius, 2) * Math.PI;
   }
   
   public static int lastInt(int whatever) {
      if (whatever >= 0) {
         return whatever % 10;
      } else {
         return whatever % 10 * -1;
      }
   }
}