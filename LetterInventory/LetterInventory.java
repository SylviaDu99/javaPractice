// Jingyun Du
// 1/11/18
// CSE143
// TA: Ning Hong
// Assignment #1
//
// Class LetterInventory can be used to store the counts of
// the letters of the alphabet.

public class LetterInventory {
   private String word;       //lower case version of the data passed in
   private int[] count;       //list of counts of the letters
   private int size;          //sum of the counts
   
   public static final int LETTERS = 26;

   //pre: take in a String as parameter ignoring the case
   //post: create a LetterInventory object which records the count
   //      of alphabetic characters in the String passed in
   public LetterInventory(String data) {
      word = data.toLowerCase();
      count = new int[LETTERS];
      size = 0;
      for (int i = 0; i < word.length(); i++) {
         if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
            count[word.charAt(i) - 'a']++;
            size++;
         }
      }
   }
   
   //pre: take in a Character as parameter ignoring the case
   //     throw IllegalArgumentException if the Character is nonalphabetic
   //post: return the count of the Character passed in as an Integer
   public int get(char letter) {
      letter = Character.toLowerCase(letter);
      if (letter < 'a'|| letter > 'z') {
         throw new IllegalArgumentException();
      }
      return count[letter - 'a'];
   }
   
   //pre: take in a Character and an Integer as parameters
   //     throw IllegalArgumentException if Character is not alhpabetic
   //     or Integer is negative
   //post: set the count of the passed Character to the passed Integer
   public void set(char letter, int value) {
      letter = Character.toLowerCase(letter);
      if (letter < 'a'|| letter > 'z' || value < 0) {
         throw new IllegalArgumentException();
      }
      size = size - count[letter - 'a'] + value;
      count[letter - 'a'] = value;
   }
   
   //pre: none
   //post: return the sum of all counts in this object as an Integer
   public int size() {
      return size;
   }
   
   //pre: none
   //post: return true if this object is empty 
   public boolean isEmpty() {
      return size == 0;
   }
   
   //pre: none
   //post: return this object as an ordered String with
   //      square brackets on both sides
   public String toString() {
      String toString = "[";
      if (size != 0) {
         for (int i = 0; i < LETTERS; i++) {
            for (int j = 0; j < count[i]; j++) {
               toString += (char) ('a' + i);
            }
         }
      }
      toString += "]";
      return toString;
   }
   
   //pre: take in another LetterInventory object as parameter
   //post: add the current LetterInventory object and the parameter
   //      LetterInventory object and return the sum as a new
   //      LetterInventory object
   public LetterInventory add(LetterInventory other) {
      LetterInventory sum = new LetterInventory(this.word + other.word);
      return sum;
   }
   
   //pre: take in another LetterInventory object as parameter
   //post: subtract the parameter LetterInventory object from the current
   //      LetterInventory object and return the result as a new
   //      LetterInventory object
   //      if any of the counts is negative, return null
   public LetterInventory subtract(LetterInventory other) {
      LetterInventory result = new LetterInventory(this.word);
      for (int i = 0; i < LETTERS; i++) {
         result.count[i] -= other.count[i];
         if (result.count[i] < 0) {
            return null;
         }
         result.size -= other.count[i];
      }
      return result;
   }
}