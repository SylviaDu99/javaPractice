// Jingyun Du
// 3/8/18
// CSE143
// TA: Ning Hong
// Assignment #8
//
// Class HuffmanTree can be used to store the characters from a file in
// frequency order with Huffman coding scheme

import java.io.*;
import java.util.*;

public class HuffmanTree {
   private HuffmanNode overallRoot;
   
   //pre: take in a array of integer which the index of the integer represents
   //     the character and the number represents the frequency of the
   //     corresponding character
   //post: create a HuffmanTree object storing the characters and their
   //      frequencies, ignoring the characters with frequency of 0
   public HuffmanTree(int[] count) {
      Queue<HuffmanNode> pairQ = new PriorityQueue<HuffmanNode>();
      for (int i = 0; i < count.length; i++) {
         if (count[i] > 0) {
            pairQ.add(new HuffmanNode(count[i], i));
         }
      }
      pairQ.add(new HuffmanNode(1, count.length));
      while (pairQ.size() > 1) {
         HuffmanNode small = pairQ.remove();
         HuffmanNode secondSmall = pairQ.remove();
         int parentFrequency = small.frequency + secondSmall.frequency;
         HuffmanNode parentNode = new HuffmanNode(parentFrequency, small, secondSmall);
         pairQ.add(parentNode);
      }
      overallRoot = pairQ.remove();
   }
   
   //pre: take in a scanner which links to a file, assume it's valid
   //post: create a HuffmanTree object storing the characters from the given
   //      file and their occurring frequencies
   public HuffmanTree(Scanner input) {
      overallRoot = null;
      while (input.hasNextLine()) {
         int n = Integer.parseInt(input.nextLine());
         String code = input.nextLine();
         overallRoot = read(n, code, overallRoot);
      }
   }
   
   //pre: take in an integer representing a character, a string of the Huffman
   //     code, and a HuffmanNode
   //post: create a HuffmanTree object, return a HuffmanNode
   private HuffmanNode read(int n, String code, HuffmanNode root) {
      if (root == null) {
         root = new HuffmanNode(0, null, null);
      }
      if (code.equals("")) {
         root.data = n;
      } else if (code.charAt(0) == '0') {
         root.left = read(n, code.substring(1), root.left);
      } else  {   // (code.charAt(0) == '1')
         root.right = read(n, code.substring(1), root.right);
      }
      return root;
   }
   
   //pre: take in a PrintStream linked to a file
   //post: print out the characters and their Huffman codes stored in the
   //      HuffmanTree to the given file in increasing frequency order
   public void write(PrintStream output) {
      String huffCode = "";
      write(output, overallRoot, huffCode);
   }
   
   //pre: take in a PrintStream, a HuffmanNode, and a string,
   //     assume the HuffmanNode is not null
   //post: print out the characters and their Huffman codes stored in the
   //      HuffmanTree to the given file in increasing frequency order
   private void write(PrintStream output, HuffmanNode root, String huffCode) {
      if (root.left == null && root.right == null) {
         output.println(root.data);
         output.println(huffCode);
      } else {
         write(output, root.left, huffCode + "0");
         write(output, root.right, huffCode + "1");
      }
   }
   
   //pre: take in a BitInputStream, a PrintStream linked to a file, an integer
   //     representing the end of file character
   //post: print out the characters from Huffman codes from the BitInputStream,
   //      stop when reached the end of file character
   public void decode(BitInputStream input, PrintStream output, int eof) {
      HuffmanNode temp = overallRoot;
      int nextBit = input.readBit();
      while (temp.data != eof) {
         if (temp.left == null && temp.right == null) {
            output.write(temp.data);
            temp = overallRoot;
         }
         if (nextBit == 0) {
            temp = temp.left;
         } else {
            temp = temp.right;
         }
         nextBit = input.readBit();
      }
   }
}