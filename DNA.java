// Jingyun Du
// 11/21/17
// CSE142
// TA: Judith Kim
// Assignment #7
//
// This program will print out a brief introduction, intake data about dna from input file
// which the name is entered by the user, and output the cleansed data into the output file
// which the name is also entered by the user.

import java.util.*;
import java.io.*;

public class DNA {

public static final int MIN_CODON = 5;   //minimum number of codons to form a protein
public static final int MIN_CG_PERCENT = 30;   //minimum C and G percentage to form a protein
public static final int NUCLEOTIDES = 4;   //number of nucleotides types
public static final int NUCLEO_PER_CODON = 3;   //numbers of nucleotides per codon

   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      introduction();
      System.out.print("Input file name? ");
      String inputFileName = console.next();
      System.out.println();
      System.out.print("Output file name? ");
      String outputFileName = console.next();
      Scanner input = new Scanner(new File(inputFileName));
      PrintStream output = new PrintStream(new File(outputFileName));
      while (input.hasNextLine()) {
         String dnaName = input.nextLine();
         String dnaNucleos = input.nextLine().toUpperCase();
         int[] counts = new int[NUCLEOTIDES];
         double[] mass = new double[NUCLEOTIDES];
         getOutput(dnaName, dnaNucleos, outputFileName, counts, mass, output);
      }
   }
   
   //print out a brief introduction of this program.
   public static void introduction() {
      System.out.println("This program reports information about DNA");
      System.out.println("nucleotide sequences that may encode proteins.");
   }
   
   //take in string dnaNucleos and integer array counts as parameter
   //and return number of junk part in the dna as integer.
   public static int getCounts(String dnaNucleos, int[] counts) {
      int length = dnaNucleos.length();
      int junk = 0;
      for (int i = 0; i < length; i++) {
         if (dnaNucleos.charAt(i) == 'A') {
            counts[0]++;
         } else if (dnaNucleos.charAt(i) == 'C') {
            counts[1]++;
         } else if (dnaNucleos.charAt(i) == 'G') {
            counts[2]++;
         } else if (dnaNucleos.charAt(i) == 'T') {
            counts[3]++;
         } else {   //character is '-'
            junk++;
         }
      }
      return junk;
   }
   
   //take in double array mass, integer array counts and integer junk as parameter
   //and return sum mass of the dna as double.
   public static double percentMass (double[] mass, int[] counts, int junk) {
      for (int i = 0; i < NUCLEOTIDES; i++) {
         mass[i] = counts[i];
      }
      mass[0] *= 135.128;
      mass[1] *= 111.103;
      mass[2] *= 151.128;
      mass[3] *= 125.107;
      double sum = junk * 100.000 + mass[0] + mass[1] + mass[2] + mass[3];
      for (int i = 0; i < NUCLEOTIDES; i++) {
         mass[i] = Math.round((mass[i] / sum) * 1000.0) / 10.0;
      }
      sum = Math.round(sum * 10.0) / 10.0;
      return sum;
   }
   
   //take in string dnaNucleos and return seperated codons of dna as string array.
   public static String[] codon(String dnaNucleos) {
      int length = dnaNucleos.length();
      String precodon = "";
      for (int i = 0; i < length; i++) {
         String character = dnaNucleos.substring(i, i + 1);
         if (!character.equals("-")) {
            precodon += character;
         }
      }
      String[] codon = new String[precodon.length() / 3];
      for (int j = 0; j < codon.length; j++) {
         codon[j] = precodon.substring((j * 3), (j * 3 + 3));
      }
      return codon;
   }
   
   //take in string array codon, double array mass as parameter
   //determine and return whether the dna is a protein as string.
   public static String isProtein(String[] codon, double[] mass) {
      String protein = "";
      if (codon[0].equals("ATG") && codon.length >= 5 && mass[1] + mass[2] >= 30.0) {
         String codonEnd = codon[codon.length - 1];
         if (codonEnd.equals("TAA") || codonEnd.equals("TGA") || codonEnd.equals("TAG")) {
            protein = "YES";
         }
      } else {
         protein = "NO";
      }
      return protein;
   }
   
   //take in string dnaName, string dnaNucleos, string outputFileName, integer array counts,
   //double array mass, PrintStream output as parameter, print out dna name, nucleotides,
   //nucleotide counts, total mass percentage, codons list, and whether the dna is a protein
   //in the output file outputFileName.
   public static void getOutput(String dnaName, String dnaNucleos, String outputFileName, int[] counts,
                               double[] mass, PrintStream output) {
      output.println("Region Name: " + dnaName);
      output.println("Nucleotides: " + dnaNucleos.toUpperCase());
      int junk = getCounts(dnaNucleos, counts);
      output.println("Nuc. Counts: " + Arrays.toString(counts));
      double sum = percentMass(mass, counts, junk);
      output.println("Total Mass%: " + Arrays.toString(mass) + " of " + sum);
      String[] codon = codon(dnaNucleos);
      output.println("Codons List: " + Arrays.toString(codon));
      String protein = isProtein(codon, mass);
      output.println("Is Protein?: " + protein);
      output.println();
   }
}