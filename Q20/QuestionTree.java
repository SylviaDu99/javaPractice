// Jingyun Du
// 3/1/18
// CSE143
// TA: Ning Hong
// Assignment #7
//
// Class QuestionTree can store a tree structure of questions and answers
// for a guessing game.

import java.util.*;
import java.io.*;

public class QuestionTree {
   private Scanner console;   //Scanner object to take in user responds
   private QuestionNode overallRoot;   //question node with default answer
   
   // pre: none
   // post: create a question tree object with default answer string
   public QuestionTree() {
      console = new Scanner(System.in);
      overallRoot = new QuestionNode("computer");
   }
   
   // pre: take in a scanner linked to a file
   // post: replace the current tree structure with new content from the given
   //       file linked by the scanner
   public void read(Scanner input) {
      overallRoot = read(input, overallRoot);
   }
   
   // pre: take in a scanner linked to a file and a question node
   // post: replace the current tree structure with new content from the given
   //       file linked by the scanner, return the new tree structure
   private QuestionNode read(Scanner input, QuestionNode root) {
      String type = input.nextLine();
      String line = input.nextLine();
      root = new QuestionNode(line);
      if	(type.equals("Q:")) {
         root.left = read(input, root.left);
         root.right = read(input, root.right);
      }
      return root;
   }
   
   // pre: take in a printstream
   // post: print out the whole tree structure into a file in preorder, print
   //       "Q:" or "A:" to represent the type of next line of content
   public void write(PrintStream output) {
      write(output, overallRoot);
   }
   
   // pre: take in a printstream and a question node, assume it is not null
   // post: print out the whole tree structure into a file in preorder, print
   //       "Q:" or "A:" to represent the type of next line of content
   private void write(PrintStream output, QuestionNode root) {
      if (root.left != null && root.right != null) {
         output.println("Q:");
         output.println(root.data);
         write(output, root.left);
         write(output, root.right);
      } else {
         output.println("A:");
         output.println(root.data);
      }
   }
   
   // pre: none
   // post: ask the user questions of the object, make guesses base on user's
   //       answer, if the guess is wrong, ask the user of the object and
   //       enlarge the tree with the new object and a question to distinguish
   //       this object
   public void askQuestions() {
      overallRoot = askQuestions(overallRoot);
   }
   
   // pre: take in a question node, assume it is not empty
   // post: ask the user questions of the object, make guesses base on user's
   //       answer, if the guess is wrong, ask the user of the object and
   //       enlarge the tree with the new object and a question to distinguish
   //       this object, return the tree structure
   private QuestionNode askQuestions(QuestionNode root) {
      if (root.left != null && root.right != null) {
         if (yesTo(root.data)) {
            root.left = askQuestions(root.left);
         } else {
            root.right = askQuestions(root.right);
         }
      } else {
         if (yesTo("Would your object happen to be " + root.data + "?")) {
            System.out.println("Great, I got it right!");
         } else {
            QuestionNode temp = root;
            System.out.print("What is the name of your object? ");
            QuestionNode name = new QuestionNode(console.nextLine());
            System.out.println("Please give me a yes/no question that");
            System.out.println("distinguishes between your object");
            System.out.print("and mine--> ");
            QuestionNode question = new QuestionNode(console.nextLine());
            if (yesTo("And what is the answer for your object?")) {
               root.left = name;
               root.right = root;
            } else {
               root.right = name;
               root.left = root;
            }
            root = question;
         }
      }
      return root;
   }
   
   // pre: take in a string
   // post: asks the user a question, forcing an answer of "y" or "n";
   //       returns true if the answer was yes, returns false otherwise
   public boolean yesTo(String prompt) {
      System.out.print(prompt + " (y/n)? ");
      String response = console.nextLine().trim().toLowerCase();
      while (!response.equals("y") && !response.equals("n")) {
         System.out.println("Please answer y or n.");
         System.out.print(prompt + " (y/n)? ");
         response = console.nextLine().trim().toLowerCase();
      }
      return response.equals("y");
   }
}