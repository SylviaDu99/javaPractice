// Jingyun Du
// 3/1/18
// CSE143
// TA: Ning Hong
// Assignment #7
//
// Class QuestionNode can store a node structure of question or answer content
// for a guessing game.

public class QuestionNode {
   public String data;
   public QuestionNode left;
   public QuestionNode right;
   
   // pre: take in a string of content
   // post: create a question node object with a content data
   public QuestionNode(String data) {
      this.data = data;
      this.left = null;
      this.right = null;
   }
}