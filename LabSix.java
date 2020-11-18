//lab note
//11.7, Tue
//TA: Judith Kim
//

//.hasNext() methods only check the type of the next token
//.next() methods consume tokens, changing what token the Scanner is looking at next!

//infinite loop!

//Scanner input = new Scanner(new File("input.txt"));
//while (input.hasNext()) {
   //System.out.println("hi");
//}

import java.util.*;
import java.io.*;

public class LabSix {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("wordinput.txt"));
      //coinFlip(input);
      //printDuplicates(new Scanner("hello how how are you you you you\nI I I am Jack's Jack's smirking smirking smirking smirking smirking revenge\n   bow  wow wow yippee yippee   yo yippee   yippee yay  yay yay\none fish two fish red fish blue fish\nIt's the Muppet Show, wakka wakka wakka"));
      mostCommonNames(new Scanner("Jared  Alisa Yuki   Catriona  Cody   Coral   Trent Kevin  Ben Stefanie Kenneth"));
   }
   
   public static void coinFlip(Scanner input) throws FileNotFoundException {
      String line = "";
      String word = "";
      while (input.hasNextLine()) {
         int head = 0;
         int count = 0;
         line = input.nextLine();
         Scanner lineScan = new Scanner(line);
         while (lineScan.hasNext()) {
            word = lineScan.next();
            if (word.equalsIgnoreCase("h")) {
               head++;
            }
            count++;
         }
         double rate = ((double)head / count) * 100.0;
         System.out.printf(head + " heads (%.1f", rate);
         System.out.println("%)");
         if (rate > 50.0) {
            System.out.println("You win!");
         }
         System.out.println();
      }
   }
   
   public static void printDuplicates(Scanner input) throws FileNotFoundException {
      while (input.hasNextLine()) {
         String line = input.nextLine();
         Scanner lineScan = new Scanner(line);
         int count = 1;
         String word = "";
         String word2 = "";
         while (lineScan.hasNext()) {
            word = lineScan.next();
            if (lineScan.hasNext()) {
               if (word2.equals(word)) {
                  count++;
               } else if (count > 1) {
                  System.out.print(word2 + "*" + count + " ");
                  count = 1;
               } else {
                  count = 1;
               }
               word2 = word;
            } else {
               if (word2.equals(word) && count > 1) {
                  count++;
                  System.out.print(word2 + "*" + count + " ");
                  count = 1;
               } else if (count > 1) {
                  System.out.print(word2 + "*" + count + " ");
                  count = 1;
               }
            }
         }
         System.out.println();
      }
   }
   
   public static int mostCommonNames(Scanner input) throws FileNotFoundException {
      int num = 0;
      while (input.hasNextLine()) {
         num++;
         String line = input.nextLine();
         Scanner lineScan = new Scanner(line);
         String name = "";
         String name2 = "";
         int common = 1;
         int comax = 1;
         String commoname = lineScan.next();
         name2 = commoname;
         while (lineScan.hasNext()) {
            name = lineScan.next();
            if (name2.equals(name)) {
               common++;
            } else {
               num++;
               common = 1;
            }
            if (comax < common) {
               commoname = name2;
               comax = common;
            }
            name2 = name;
         }
         System.out.println("Most common: " + commoname);
      }
      return num;
   }
}