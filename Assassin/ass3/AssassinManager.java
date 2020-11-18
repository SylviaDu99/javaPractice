// Jingyun Du
// 1/25/18
// CSE143
// TA: Ning Hong
// Assignment #3
//
// Class AssassinManager can be used to store a kill ring and a graveyard
// used in the Assassin game. For each player, their target and their killer
// are stored.

import java.util.*;

public class AssassinManager {
   private AssassinNode alive;   //reference to the front of kill ring
   private AssassinNode dead;    //reference to the most recent death in graveyard
   
   //pre: take in a String List of names
   //     if list is empty, throw IllegalArgumentException
   //post: construct an AssassinManager object with a kill ring of the names
   public AssassinManager(List<String> names) {
      dead = null;
      alive = null;
      if (names.size() == 0) {
         throw new IllegalArgumentException();
      }
      for (int i = names.size() - 1; i >= 0; i--) {
         alive = new AssassinNode(names.get(i), alive);
      }
      AssassinNode temp = alive;
      for (int i = 0; i < names.size() - 1; i++) {
         temp = temp.next;
      }
      temp.next = alive;
   }
   
   //pre: none
   //post: print the names of people in the kill ring and who they are stalking
   public void printKillRing() {
      AssassinNode temp = alive;
      do {
         System.out.println("    " + temp.name + " is stalking " + temp.next.name);
         temp = temp.next;
      } while (temp != null && temp != alive);
   }
   
   //pre: none
   //post: print out the names of the people in the graveyard
   public void printGraveyard() {
      AssassinNode temp = dead;
      while (temp != null) {
         System.out.println("    " + temp.name + " was killed by " + temp.killer);
         temp = temp.next;
      }
   }
   
   //pre: take in a String of name, ignore case
   //post: return whether the person is in the kill ring (still alive)
   public boolean killRingContains(String name) {
      AssassinNode temp = alive;
      if (temp.name.equalsIgnoreCase(name)) {
         return true;
      }
      temp = temp.next;
      while (temp != null && temp != alive) {
         if (temp.name.equalsIgnoreCase(name)) {
            return true;
         }
         temp = temp.next;
      }
      return false;
   }
   
   //pre: take in a String of name, ignore case
   //post: return whether the person is in the graveyard (already dead)
   public boolean graveyardContains(String name) {
      AssassinNode temp = dead;
      while (temp != null) {
         if (temp.name.equalsIgnoreCase(name)) {
            return true;
         }
         temp = temp.next;
      }
      return false;
   }
   
   //pre: none
   //post: return whether there is only one person in the kill ring
   public boolean gameOver() {
      return (alive != null && alive.next == alive);
   }
   
   //pre: if game is not over, return null
   //post: return the name of the winner of the game
   public String winner() {
      if (!gameOver()) {
         return null;
      }
      return alive.name;
   }
   
   //pre: take in a String of name, ignore case
   //     if name is not in kill ring or game is over
   //        throw IllegalArgumentException
   //post: kill the person, keep the kill ring order
   public void kill(String name) {
      if (!killRingContains(name) || gameOver()) {
         throw new IllegalArgumentException();
      }
      AssassinNode temp = alive;
      while (!temp.next.name.equalsIgnoreCase(name)) {
         temp = temp.next;
      }
      String killer = temp.name;
      AssassinNode prey = temp.next;
      if (alive == temp.next) {
         alive = temp.next.next;
      }
      temp.next = temp.next.next;
      prey.next = dead;
      dead = prey;
      prey.killer = killer;
   }
}