//lecture note
//11.1, Wed.
//TA: Judith Kim
//file input!!!
//

//absolute path: specify top folders with /
//relative path: do not specify
//throw clause: public static type name(parameter) throws type {
//token: splitted by space

import java.util.*;
import java.io.*;

public class Lecture15 {
   public static void main(String[] args) throws FileNotFoundException {
      //String text = input.next();
      //File f = new File("example.txt");
      //if (f.exists() && f.length() > 1000) {
      //   f.delete();
      //}
      
      Scanner input = new Scanner(new File("numbers.txt"));
      double sum = 0.0;
      while (input.hasNext()) {
         if (input.hasNextDouble()) {
            double next = input.nextDouble();
            System.out.println("number = " + next);
            sum += next;
         } else {
            System.out.println("not a double, can't read: " + input.next());
         }
      }
      double rounded = Math.round(sum * 10.0) / 10.0;
      System.out.println("sum = " + rounded);
   }

}