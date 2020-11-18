//lecture notes
//11.6, Mon
//TA: Judith Kim
//
//

import java.util.*;
import java.io.*;

public class Lecture16 {
   public static void main(String[] args) throws FileNotFoundException {
      //Scanner input = new Scanner(new File("hours.txt"));
      //while (input.hasNextLine()) {
         //String line = input.nextLine();
         //Scanner lineScan = new Scanner(line);
         //int count = 0;
         //while (lineScan.hasNext()) {
            //lineScan.next();
            //count++;
         //}
      //}
      Scanner console = new Scanner(System.in);
      System.out.print("Enter some text to search for: ");
      String text = console.nextLine();
      Scanner input = new Scanner(new File("imdb.txt"));
      String line = find(input, text);
      if (line.length() > 0) {
      
      //printstream output!
         PrintStream outputFile = new PrintStream(new File("lecture17.txt"));
         outputFile.println();
      //!
      
         System.out.println("Rank\tID\tRating\tTitle");
         display(line);
         line = find(input, text);
         while (line.length() > 0) {
            display(line);
            line = find(input, text);
         }
      } else {
         System.out.println("Couldn't find movie title containing " + text);
      }
   }
   
   public static String find(Scanner input, String text) {
      while (input.hasNextLine()) {
         String line = input.nextLine();
         Scanner lineScan = new Scanner(line);
         lineScan.nextInt();   //read out the rank, throw it away
         lineScan.nextInt();   //read out the id, throw it away
         lineScan.nextDouble();   //read out the rating, throw it away
         String title = lineScan.nextLine();   //read the whole remaining line
         title = title.toLowerCase();
         text = text.toLowerCase();
         if (title.contains(text)) {
            return line;
         }
      }
      return "";
   }
   
   public static void display(String line) {
      Scanner lineScan = new Scanner(line);
      int rank = lineScan.nextInt();
      int id = lineScan.nextInt();
      double rating = lineScan.nextDouble();
      String title = lineScan.nextLine();
      
      System.out.println(rank + "\t" + id + "\t" + rating + "\t" + title);
   }
}