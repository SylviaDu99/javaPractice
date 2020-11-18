// Jingyun Du
// 10/2/17
// CSE142
// TA: Judith Kim
// Assignment #1
//
// This program will print the lyric of a cumulative song.

public class Song {
   public static void main(String[] args){
      part1();
      System.out.println();
      part2();
      System.out.println();
      part3();
      System.out.println();
      part4();
      System.out.println();
      part5();
      System.out.println();
      part6();
      System.out.println();
      part7();
   }
   
   //prints out two repeated sentences.
   public static void repeatedSentence() {
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
   }
   
   //prints out part one of the lyric.
   public static void part1() {
      System.out.println("There was an old woman who swallowed a fly.");
      repeatedSentence();
   }
   
   //prints out part two of the lyric.
   public static void part2() {
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      System.out.println("She swallowed the spider to catch the fly,");
      repeatedSentence();
   }
   
   //prints out part three of the lyric
   public static void part3() {
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      System.out.println("She swallowed the bird to catch the spider,");
      System.out.println("She swallowed the spider to catch the fly,");
      repeatedSentence();
   }
   
   //prints out part four of the lyric.
   public static void part4() {
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      System.out.println("She swallowed the cat to catch the bird,");
      System.out.println("She swallowed the bird to catch the spider,");
      System.out.println("She swallowed the spider to catch the fly,");
      repeatedSentence();
   }
   
   //prints out part five of the lyric.
   public static void part5() {
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      System.out.println("She swallowed the dog to catch the cat,");
      System.out.println("She swallowed the cat to catch the bird,");
      System.out.println("She swallowed the bird to catch the spider,");
      System.out.println("She swallowed the spider to catch the fly,");
      repeatedSentence();
   }
   
   //prints out part six of the lyric.
   public static void part6() {
      System.out.println("There was an old woman who swallowed a wolf,");
      System.out.println("It'll be a war to swallow a wolf.");
      System.out.println("She swallowed the wolf to catch the dog,");
      System.out.println("She swallowed the dog to catch the cat,");
      System.out.println("She swallowed the cat to catch the bird,");
      System.out.println("She swallowed the bird to catch the spider,");
      System.out.println("She swallowed the spider to catch the fly,");
      repeatedSentence();
   }
   
   //prints out the last part of the lyric
   public static void part7() {
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
   }
   
}