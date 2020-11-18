// Jingyun Du
// 10/24/17
// CSE142
// TA: Judith Kim
// Assignment #4
// This program will calculate and print the user's minimum GPA
// base on the midterm, final, and homework score the user entered.

import java.util.*;

public class Gradanator {
   public static final int EXAM = 100;   //control the maximum score of exams
   public static final int HMWK_SECT = 30;   //control the maximum score of homework sections
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      double midScore = midExam(console);
      double finScore = finExam(console);
      double hmwkScore = graderHmwk(console);
      double sumScore = midScore + finScore + hmwkScore;
      summary(sumScore);
   }
   
   //take in sumScore (defined in main as sum of all three scores) as double,
   //print minimum GPA and grade messages.
   public static void summary(double sumScore) {
      System.out.printf("Overall percentage = %.1f\n", sumScore); 
      if(sumScore >= 85.0) {
         System.out.println("Your grade will be at least: 3.0");
         System.out.println("Great!");
      } else if(sumScore >= 75.0) {
         System.out.println("Your grade will be at least: 2.0");
         System.out.println("Good job, but not enough for a competitive major.");
      } else if(sumScore >= 60.0) {
         System.out.println("Your grade will be at least: 0.7");
         System.out.println("You could definitely do better...");
      } else {   //sumScore < 60.0
         System.out.println("Your grade will be at least: 0.0");
         System.out.println("Retake it next quarter...");
      }
   }
   
   //calculate and return the score for midterm in double.
   public static double midExam(Scanner console) {
      System.out.println("This program reads exam/homework scores");
      System.out.println("and reports your overall course grade.\n");
      System.out.println("Midterm:");
      double midScore = test(console);
      return midScore;
   }
   
   //calculate and return the score for final in double.
   public static double finExam(Scanner console) {
      System.out.println("Final:");
      double finScore = test(console);
      return finScore;
   }
   
   //take in test weight, scores earned, shifted scores,
   //calculate and return midterm score and final score in double.
   public static double test(Scanner console) {
      System.out.print("Weight (0-100)? ");
      int weight = console.nextInt();
      System.out.print("Score earned? ");
      int score = console.nextInt();
      System.out.print("Were scores shifted (1=yes, 2=no)? ");
      int shift = console.nextInt();
      if (shift == 1) {
         System.out.print("Shift amount? ");
         int shiftAmount = console.nextInt();
         score += shiftAmount;
      }
      score = Math.min(score, EXAM);
      System.out.println("Total points = " + score + " / " + EXAM);
      double finScore = (double) score / EXAM * weight;
      round(finScore, weight);
      return finScore;
   }
   
   //take in homework weight, number of assignments, assignment scores and max scores,
   //number of sections attended, and
   //calculate and return the score for homework in double.
   public static double graderHmwk(Scanner console) {
      System.out.println("Homework:");
      System.out.print("Weight (0-100)? ");
      int weight = console.nextInt();
      System.out.print("Number of assignments? ");
      int number = console.nextInt();
      int scoreSum = 0;
      int maxSum = 0;
      for (int i = 1; i <= number; i++) {
         System.out.print("Assignment " + i + " score and max? ");
         int score = console.nextInt();
         int max = console.nextInt();
         scoreSum = scoreSum + score;
         maxSum = maxSum + max;
      }
      System.out.print("How many sections did you attend? ");
      int section = console.nextInt();
      int sectionAll = section * 5;
      sectionAll = Math.min(sectionAll, HMWK_SECT);
      System.out.println("Section points = " + sectionAll + " / " + HMWK_SECT);
      int total = sectionAll + scoreSum;
      int totalMax = HMWK_SECT + maxSum;
      if(total > totalMax) {
         total = totalMax;
      }
      System.out.println("Total points = " + total + " / " + totalMax);
      double hmwkScore = (double) total / totalMax * weight;
      round(hmwkScore, weight);
      return hmwkScore;
   }
   
   //take in double x (variable of scores) and int y (weight)
   //and round x to the .1 decimal
   public static void round(double x, int y) {
      System.out.printf("Weighted score = %.1f / " + y, x);
      System.out.println("\n");
   }
}