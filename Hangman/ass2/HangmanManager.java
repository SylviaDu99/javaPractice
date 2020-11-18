// Jingyun Du
// 2/1/18
// CSE143
// TA: Ning Hong
// Assignment #4
//
// Class HangmanManager can be used to store a dictionary of words,
// the guesses made, and the current word pattern of a Hangman game.

import java.util.*;

public class HangmanManager {
   private Set<String> words;       // the list of words of the current pattern
   private int max;             // the max times of mistake the player can make
   private SortedSet<Character> guesses;       // a sorted list of guesses made
   private String currentPattern;                   // the current word pattern
   
   // pre: take in a word dictionary, a target word length, and the number of
   //     max mistakes the player can make
   // post: update the current words list with the words of target length from
   //      the dictionary, initialize the current word pattern into dashes 
   //      devided by space which each dash represent an unknown letter
   public HangmanManager(Collection<String> dictionary, int length, int max) {
      this.max = max;
      if (max < 0 || length < 1) {
         throw new IllegalArgumentException();
      }
      currentPattern = "-";
      guesses = new TreeSet<Character>();
      words = new TreeSet<String>();
      for(String word: dictionary) {
         if (word.length() == length) {
            words.add(word);
         }
      }
      for (int i = 0; i < length - 1; i++) {
         currentPattern += " -";
      }
   }
   
   // pre: none
   // post: return the current word list
   public Set<String> words() {
      return words;
   }
   
   // pre: none
   // post: return the number of wrong guesses the player can make
   public int guessesLeft() {
      return max;
   }
   
   // pre: none
   // post: return the sorted list of guesses the player made
   public SortedSet<Character> guesses() {
      return guesses;
   }
   
   // pre: if the list of words of current pattern is empty,
   //     throw IllegalStateException
   // post: return current word pattern
   public String pattern() {
      if (words.isEmpty()) {
         throw new IllegalStateException();
      }
      return currentPattern;
   }
   
   // pre: take in a character of guess
   //     if the number of guesses is less than one,
   //     or the current word list is empty, throw IllegalStateException
   //     if the guess had been made, throw IllegalArgumentException
   // post: record the new guess into the guesses list, update current pattern,
   //      update the current word list into the largest group of words, 
   //      update the guesses left, return the number of the guess appears in
   //      the current pattern
   public int record(char guess) {
      if (max < 1 || words.isEmpty()) {
         throw new IllegalStateException();
      }
      if (guesses.contains(guess)) {
         throw new IllegalArgumentException();
      }
      guesses.add(guess);
      Map<String, TreeSet<String>> wordPatterns = new TreeMap<String, TreeSet<String>>();
      create(wordPatterns, words, guess);
      currentPattern = biggest(wordPatterns);
      words = wordPatterns.get(currentPattern);
      int num = 0;
      if (currentPattern.indexOf(guess) != -1) {
         for (int i = 0; i < currentPattern.length(); i += 2) {
            if (currentPattern.charAt(i) == guess) {
               num++;
            }
         }
      } else {
         max--;
      }
      return num;
   }
   
   
   // pre: take in an empty 'dictionary' of word groups and their patterns,
   //      the current list of words, and the current guessed character
   // post: fill up the dictionary with the current words list and their
   //      patterns
   private void create(Map<String, TreeSet<String>> wordPatterns, Set<String> words, char guess) {
      for (String word: words) {
         String pattern = currentPattern;
         int index = 0;
         for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == guess) {
               pattern = pattern.substring(0, index) + guess + pattern.substring(index + 1);
            }
            index += 2;
         }
         if (!wordPatterns.containsKey(pattern)) {
            wordPatterns.put(pattern, new TreeSet<String>());         
         }
         wordPatterns.get(pattern).add(word);
      }
   }
   
   // pre: take in the 'dictionary' of word lists and their patterns
   // post: find out the list with most words in it and return their pattern
   private String biggest(Map<String, TreeSet<String>> wordPatterns) {
      Set<String> keys = wordPatterns.keySet();
      String biggest = "";
      int maxSize = 0;
      for (String pattern: keys) {
         int tempSize = wordPatterns.get(pattern).size();
         if (tempSize > maxSize) {
            biggest = pattern;
            maxSize = tempSize;
         }
      }
      return biggest;
   }
}