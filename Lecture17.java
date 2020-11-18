//lecture note
//11.8, Wed.
//TA: Judith Kim
//
//array!

import java.util.*;
import java.io.*;

public class Lecture17 {
   public static void main(String[] args) throws FileNotFoundException {
      //int array
      int[] siblingAges = new int[4];
      siblingAges[0] = 32;
      siblingAges[1] = 30;
      siblingAges[2] = 27;
      siblingAges[3] = 23;
      //another format
      //int[] ages = {40, 30, 20, 10};
      printAges("Brand", siblingAges);
      midtermScores();
   }
   
   public static void printAges(String familyName, int[] siblingAges) {
      for (int i = 0; i < siblingAges.length; i++) {
         System.out.println("Sibling # " + (i + 1) + " in the " + familyName + " family is " 
                              + siblingAges[i] + " years old.");
      }
   }
   
   public static void midtermScores() throws FileNotFoundException {
      Scanner input = new Scanner(new File("mid-score.txt"));
      int[] count = new int[101];
      while (input.hasNextInt()) {
         int score = input.nextInt();
         count[score]++;
      }
      for (int i = 0; i < 101; i++) {
         System.out.println("Score = " + i + ", count = ");
         
      }
   }
}