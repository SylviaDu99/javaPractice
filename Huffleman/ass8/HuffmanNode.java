// Jingyun Du
// 3/8/18
// CSE143
// TA: Ning Hong
// Assignment #8
//
// Class HuffmanNode can be used to store a integer representing a character
// with its occurring frequency in a file

public class HuffmanNode implements Comparable<HuffmanNode> {
   public int frequency;
   public HuffmanNode left;
   public HuffmanNode right;
   public int data;
   
   //pre: take in an integer representing the occurring frequency and two other
   //     HuffmanNodes
   //post: create a HuffmanNode storing the total frequency of the two other
   //      HuffmanNodes
   public HuffmanNode(int frequency, HuffmanNode left, HuffmanNode right) {
      this.frequency = frequency;
      this.left = left;
      this.right = right;
   }
   
   //pre: take in an integer representing a character and an integer of the
   //     occurring frequency of the character
   //post: create a HuffmanNode storing the character and its frequency
   public HuffmanNode(int frequency, int data) {
      this.frequency = frequency;
      this.data = data;
   }
   
   //pre: take in another HuffmanNode
   //post: compare the two HuffmanNodes and return an integer
   //      if the frequency of this HuffmanNode is smaller than the other's
   //      frequency, the integer returned is less than 0, else if they are
   //      the same, the integer equals to 0, else the integer is bigger than 0
   public int compareTo(HuffmanNode other) {
      return this.frequency - other.frequency;
   }
}