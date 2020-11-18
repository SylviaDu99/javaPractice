// Jingyun Du
// 2/22/18
// CSE143
// TA: Ning Hong
// Assignment #6
//
// Class AnagramSolver can find all combinations of words from a given
// dictionary only using letters from a given phrase.

import java.util.*;

public class AnagramSolver {
   //the given dictionary
   private List<String> list;
   //the mapping structure to connect the words in the given dictionary and
   //the letters they contain
   private Map<String, LetterInventory> dict;
   
   //pre: take in a dictionary, assume dictionary and strings are not empty,
   //     assume dictionary contains no duplicates
   //post: create a AnagramSolver object with a mapping structure that connects
   //      the words in the given dictionary and the letters they contain
   public AnagramSolver(List<String> list) {
      dict = new HashMap<String, LetterInventory>();
      this.list = list;
      for (String word: list) {
         dict.put(word, new LetterInventory(word));
      }
   }
   
   //pre: take in a given word and a max number of words the result contains
   //     if max number is negative, throw IllegalArgumentException
   //post: create a list of words that could possibly be the anagram of the
   //      given word, create a list structure to hold the result,
   //      print out all the result in square brackets in the order of the
   //      given dictionary
   public void print(String s, int max) {
      if (max < 0) {
         throw new IllegalArgumentException();
      }
      LetterInventory phrase = new LetterInventory(s);
      List<String> shortDict = new ArrayList<String>();
      for (String word: list) {
         if (phrase.subtract(dict.get(word)) != null) {
            shortDict.add(word);
         }
      }
      Stack<String> line = new Stack<String>();
      printAid(phrase, max, line, shortDict);
   }
   
   
   //pre: take in a LetterInventory of the given word, a max number of words,
   //     a stack of anagrams, and a list of words with their letters contained
   //     in the origin given word
   //post: print out all results in the order of the given dictionary
   private void printAid(LetterInventory phrase, int max, Stack<String> line,
                         List<String> shortDict) {
      if ((max == 0 || line.size() <= max) && phrase.isEmpty()) {
         System.out.println(line);
      } else if ((line.size() < max || max == 0) && !phrase.isEmpty()) {
         for (String word: shortDict) {
               LetterInventory temp = dict.get(word);
               if (phrase.subtract(temp) != null) {
                  line.push(word);
                  LetterInventory leftover = phrase.subtract(temp);
                  printAid(leftover, max, line, shortDict);
                  line.pop();
               }
         }
      }
   }
}