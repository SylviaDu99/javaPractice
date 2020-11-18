// Jingyun Du
// 2/8/18
// CSE143
// TA: Ning Hong
// Assignment #5
//
// Class GrammarSolver can be used to store definitions of elements of grammar
// and generate random elements of the grammar.

import java.util.*;

public class GrammarSolver {
   //a mapping structure which links the grammar elements and their definitions
   private SortedMap<String, String[]> grammarMap;
   
   //pre: take in a list of grammar definitions, if list is empty or list
   //     contains different definitions for same element,
   //     throw IllegalArgumentException
   //post: construct a new GrammarSolver object with a mapping structer
   //      which links the grammar elements and their definitions
   public GrammarSolver(List<String> grammar) {
      if (grammar.isEmpty()) {
         throw new IllegalArgumentException();
      }
      grammarMap = new TreeMap<String, String[]>();
      for (String define: grammar) {
         String[] temp = define.split("::=");
         String[] terminal = temp[1].split("[|]");
         if (grammarMap.containsKey(temp[0])) {
            throw new IllegalArgumentException();
         }
         grammarMap.put(temp[0], terminal);
      }
   }
   
   //pre: take in a symbol
   //post: return whether the symbol is a nonterminal of the grammar
   public boolean grammarContains(String symbol) {
      return grammarMap.containsKey(symbol);
   }
   
   //pre: take in a symbol of a nonterminal and the number of times the symbol
   //     would be generated, if symbol is not a nonterminal or the number of
   //     times is negative, throw IllegalArgumentException
   //post: return an array of string of random generated elements of the symbol
   public String[] generate(String symbol, int times) {
      if (!grammarMap.containsKey(symbol) || times < 0) {
         throw new IllegalArgumentException();
      }
      String[] generated = new String[times];
      for (int i = 0; i < times; i++) {
         generated[i] = generateAid(symbol);
      }
      return generated;
   }
   
   //pre: none
   //post: return a string of nonterminals in the grammar definition
   public String getSymbols() {
      return grammarMap.keySet().toString();
   }
   
   //pre: take in the symbol of a nonterminal in grammar definition,
   //     assume it is valid
   //post: return a string of a random generated element of that symbol
   private String generateAid(String symbol) {
      Scanner line = new Scanner(symbol);
      String generated = "";
      while (line.hasNext()) {
         String word = line.next();
         if (!grammarMap.containsKey(word)) {
            generated += (" " + word);
         } else {
            Random rand = new Random();
            int index = rand.nextInt(grammarMap.get(word).length);
            generated += (" " + generateAid(grammarMap.get(word)[index]));
         }
      }
      return generated.substring(1);
   }
}