// Jingyun Du
// 1/19/18
// CSE143
// TA: Ning Hong
// Assignment #2B
//
// Class Guitar37 can be used to keep track of a guitar with 37 strings.

public class Guitar37 implements Guitar {
   private GuitarString[] guitarKeys;   //list of GuitarString
   private int time;                    //time the guitar has been tic
   
   public static final String KEYBOARD =
        "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";  // keyboard layout
   
   //pre: none
   //post: create a Guitar37 object that connects the pitch and the key
   //      on keyboard to the string they represent
   public Guitar37() {
      guitarKeys = new GuitarString[KEYBOARD.length()];
      double[] guitarPitch = new double[KEYBOARD.length()];
      for (int i = 0; i < KEYBOARD.length(); i++) {
         guitarPitch[i] = 440 * Math.pow(2, (double)(i - 24) / 12);
         guitarKeys[i] = new GuitarString(guitarPitch[i]);
      }
   }
   
   //pre: take in a integer
   //     if integer is out of range of the guitar pitch, ignore
   //post: pluck the string represented by the pitch
   public void playNote(int pitch) {
      if (pitch >= -24 && pitch <= 12) {
         guitarKeys[pitch + 24].pluck();
      }
   }
   
   //pre: take in a character
   //post: return whether the character represents a string
   public boolean hasString(char key) {
      if (KEYBOARD.indexOf(key) != -1) {
            return true;
      }
      return false;
   }
   
   //pre: take in a character
   //     if character does not represent a guitar string,
   //        throw IllegalArgumentExcpetion
   //post: pluck the string represented by the character
   public void pluck(char key) {
      if (!hasString(key)) {
         throw new IllegalArgumentException();
      }
      guitarKeys[KEYBOARD.indexOf(key)].pluck();
   }
   
   //pre: none
   //post: return the sum of all current value of the strings
   public double sample() {
      double sum = 0.0;
      for (int i = 0; i < KEYBOARD.length(); i++) {
         sum += guitarKeys[i].sample();
      }
      return sum;
   }
   
   //pre: none
   //post: tic each string of the guitar once
   public void tic() {
      time++;
      for (int i = 0; i < KEYBOARD.length(); i++) {
         guitarKeys[i].tic();
      }
   }
   
   //pre: none
   //post: return the number that tic() has been called
   public int time() {
      return time;
   }
}