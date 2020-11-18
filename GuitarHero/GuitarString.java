// Jingyun Du
// 1/19/18
// CSE143
// TA: Ning Hong
// Assignment #2A
//
// Class GuitarString can be used to store a ring buffer to model
// the vibration of a guitar string with given frequency.

import java.util.*;

public class GuitarString {
   private Queue<Double> guitar;   //a ring buffer
   private int capacity;           //capacity of the ring buffer
   
   public static final double ENERGY_DECAY = 0.996;
   
   //pre: take in a double frequency as parameter, compute ring buffer capacity
   //     if frequency <= 0 or capacity < 2, throw IllegalArgumentException
   //post: create a GuitarString with a ring buffer
   //      to represent a string of guitar
   public GuitarString(double frequency) {
      if (frequency <= 0) {
         throw new IllegalArgumentException();
      }
      capacity = (int) Math.round(StdAudio.SAMPLE_RATE / frequency);
      if (capacity < 2) {
         throw new IllegalArgumentException();
      }
      guitar = new LinkedList<Double>();
      for (int i = 0; i < capacity; i++) {
         guitar.add(0.0);
      }
   }
   
   //pre: take in a double array as parameter
   //     if array has less than 2 elements, throw IllegalArgumentException
   //post: create a GuitarString object with a ring buffer
   //      to represent a string of guitar
   public GuitarString(double[] init) {
      capacity = init.length;
      if (capacity < 2) {
         throw new IllegalArgumentException();
      }
      guitar = new LinkedList<Double>();
      for (int i = 0; i < capacity; i++) {
         guitar.add(init[i]);
      }
   }
   
   //pre: none
   //post: replace elements in ring buffer by random doubles
   public void pluck() {
      for (int i = 0; i < capacity; i++) {
         double randDouble = Math.random() - 0.5;
         guitar.remove();
         guitar.add(randDouble);
      } 
   }
   
   //pre: none
   //post: apply Karplus-Strong update to each element in ring buffer once
   public void tic() {
      double temp = guitar.remove();
      temp = ENERGY_DECAY * 0.5 * (temp + guitar.peek());
      guitar.add(temp);
   }
   
   //pre: none
   //post: return value at the front of ring buffer
   public double sample() {
      return guitar.peek();
   }
}