// Jingyun Du
// 1/19/18
// CSE143
// TA: Ning Hong
// Assignment #2B
//
// Class Guitar37 can be used to 

public class Guitar37 implements Guitar {
   private GuitarString[] guitarKeys;
   private double[] guitarPitch;
   private int time;
   
   public static final String KEYBOARD =
        "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";  // keyboard layout
   
   public Guitar37() {
      guitarKeys = new GuitarString[KEYBOARD.length()];
      guitarPitch = new double[KEYBOARD.length()];
      for (int i = 0; i < KEYBOARD.length(); i++) {
         guitarPitch[i] = 440 * Math.pow(2, (double)(i - 24) / 12);
         guitarKeys[i] = new GuitarString(guitarPitch[i]);
      }
   }
   
   public void playNote(int pitch) {
      if (pitch >= -24 && pitch <= 12) {
         guitarKeys[pitch + 24].pluck();
      }
   }
   
   public boolean hasString(char key) {
      if (KEYBOARD.indexOf(key) != -1) {
            return true;
      }
      return false;
   }
   
   public void pluck(char key) {
      if (!hasString(key)) {
         throw new IllegalArgumentException();
      }
      guitarKeys[KEYBOARD.indexOf(key)].pluck();
   }
   
   public double sample() {
      double sum = 0.0;
      for (int i = 0; i < KEYBOARD.length(); i++) {
         sum += guitarKeys[i].sample();
      }
      return sum;
   }
   
   public void tic() {
      time++;
      for (int i = 0; i < KEYBOARD.length(); i++) {
         guitarKeys[i].tic();
      }
   }
   
   public int time() {
      return time;
   }
}