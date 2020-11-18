import java.awt.*;
import java.util.*;

public class LabTA extends Critter {

   private boolean isWhite;
   private Random rand;

   public LabTA() {
      rand = new Random();
      isWhite = false;
   } 

   public Direction getMove() {
      isWhite = !isWhite;
      boolean goEW = rand.nextBoolean();
      if (goEW) {
         return Direction.WEST;
      } else {
         return Direction.EAST;
      }
   }
   
   public Color getColor() {
      if (isWhite) {
         return Color.WHITE;
      } else {
         return Color.MAGENTA;
      }
   }

   public String toString() {
      return ":-)";
   }   
    
   public boolean eat() {
      return true;
   }

   public Attack fight(String opponent) {
      return Attack.POUNCE;
   }
}