// Jingyun Du
// 11/6/17
// CSE142
// TA: Judith Kim
// Assignment #6
//
// This program will print out an introduction and allow user to create mad-libs
// and view mad-libs that are created.

import java.util.*;
import java.io.*;

public class MadLibs {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      introduction();
      System.out.print("(C)reate mad-lib, (V)iew mad-lib, (Q)uit? ");
      String cvq = console.nextLine();
      while (!cvq.equalsIgnoreCase("q")) {
         if (cvq.equalsIgnoreCase("c")) {
            create(console);
            System.out.print("(C)reate mad-lib, (V)iew mad-lib, (Q)uit? ");
            cvq = console.nextLine();
         } else if (cvq.equalsIgnoreCase("v")) {
            view(console);
            System.out.print("(C)reate mad-lib, (V)iew mad-lib, (Q)uit? ");
            cvq = console.nextLine();
         } else {   //user input is not c, v, or q
            System.out.print("(C)reate mad-lib, (V)iew mad-lib, (Q)uit? ");
            cvq = console.nextLine();
         }
      }  
   }
   
   //print out the introduction of this program.
   public static void introduction() {
      System.out.println("Welcome to the game of Mad Libs.");
      System.out.println("I will ask you to provide various words");
      System.out.println("and phrases to fill in a story.");
      System.out.println("The result will be written to an output file.");
      System.out.println();
   }
   
   //receive the file name returned by method find
   //intake user input by scanner console to create a mad-lib
   //output the created mad-lib into a new file which its name is entered by user.
   public static void create(Scanner console) throws FileNotFoundException {
      String find = find(console);
      System.out.print("Output file name: ");
      String output = console.nextLine();
      System.out.println();
      Scanner input = new Scanner(new File(find));
      PrintStream outputFile = new PrintStream(new File(output));
      while (input.hasNextLine()) {
         String line = input.nextLine();
         Scanner scanLine = new Scanner(line);
         while (line.contains("<")) {
            String word = scanLine.next();
            while (!word.contains("<")) {
               word = scanLine.next();
            }
            int index = word.indexOf(">");
            String placeholder = word.substring(1, index).replace("-", " ");
            char initial = placeholder.toLowerCase().charAt(0);
            System.out.print("Please type a");
            if (initial == 'a' || initial == 'e' || initial == 'i'
                  || initial == 'o' || initial == 'u') {
               System.out.print("n");
            }
            System.out.print(" " + placeholder + ": ");
            String typin = console.nextLine();
            int initialIndex = line.indexOf("<");
            int endIndex = line.indexOf(">");
            line = line.substring(0, initialIndex) + word.replace(word, typin)
                  + line.substring(endIndex + 1);
         }
         outputFile.println(line);
      }
      System.out.println("Your mad-lib has been created!");
      System.out.println();
   }
   
   //intake user input by scanner console to view a specific mad-lib file
   public static void view(Scanner console) throws FileNotFoundException {
      String find = find(console);
      System.out.println();
      Scanner viewFile = new Scanner(new File(find));
      while (viewFile.hasNextLine()) {
         System.out.println(viewFile.nextLine());
      }
      System.out.println();
   }
   
   //intake user input filename by scanner console to find the file
   //print error message if file not found
   //return filename as a string
   public static String find(Scanner console) throws FileNotFoundException {
      System.out.print("Input file name: ");
      String filename = console.nextLine();
      File f = new File(filename);
      while (!f.exists()) {
         System.out.print("File not found. Try again: ");
         filename = console.nextLine();
         f = new File(filename);
      }
      return filename;
   }
}