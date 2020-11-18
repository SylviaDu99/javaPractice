
import java.io.*;
import java.util.*;


public class Test {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("test.txt"));
      int count = 0;
      while (input.hasNextLine()) {
         System.out.println("input: " + input.nextLine());
         count++;
      }
      System.out.println(count + " total");
   }

}


