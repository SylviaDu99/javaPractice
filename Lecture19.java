//lecture notes
//11.15, Wed.
//TA: Judith Kim
//
//arrays as parameters
//

import java.util.*;
import java.io.*;

public class Lecture19 {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("section.txt"));
      while (input.hasNextLine()) {
         String line = input.nextLine();
         int[] counts =  getCounts(line);
         int[] scores = getScores(counts);
         double[] percentages = getPercentages(scores);         
         System.out.println();
      }
   }
   
   public static int[] getCounts(String line) {
      int[] counts = new int[5];
      for (int i = 0; i < line.length(); i++){
         char attended = line.charAt(i);
         if (attended == '1') {
            counts[i % 5]++; //!!!
         }
      }
      System.out.println("Sections attended: " + Arrays.toString(counts));
      return counts;
   }
   
   public static int[] getScores(int[] counts) {
      int[] scores = new int[5];
      for (int i = 0; i < scores.length; i++) {
         scores[i] = Math.min(20, 3 * counts[i]);
      }
      System.out.println("Student scores: " + Arrays.toString(scores));
      return scores;
   }
   
   public static double[] getPercentages(int[] scores) {
      double[] percentages = new double[5];
      for (int i = 0; i < percentages.length; i++) {
         percentages[i] = 100.0 * scores[i] / 20;
      }
      System.out.println("Section percentages: " + Arrays.toString(percentages));
      return percentages;
   }
}