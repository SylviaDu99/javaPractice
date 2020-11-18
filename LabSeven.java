//lab notes
//11.14, Tue.
//TA: Judith Kim
//
//arrays!

public class LabSeven {
   public static void main(String[] args) {
      int[] a = new int[5];     // a = [0, 0, 0, 0, 0]
      int[] b = a;              // a = [0, 0, 0, 0, 0] (still), b = [0, 0, 0, 0, 0]
      a[0] = 10;                // a = [10, 0, 0, 0, 0], b = [10, 0, 0, 0, 0]
      b[1] = 8;                 // a = [10, 8, 0, 0, 0], b = [10, 8, 0, 0, 0]
      //Setting b = a means b and a now reference the same array.
      //Changes to either a or b change both a and b.
      int[] data = new int[8];
      data[4] = 5;
      int x = data[4];
      data[4] = 6;
      data[x] = 9;
      //data[x] = data[5]!!
      
      //Arrays.binarySearch(array, value)
      //returns index of value in a sorted array (< 0 if not found)
      
      //Arrays.copyOf(array, length)
      //returns a new copy of an array
      
      //Arrays.equals(array1, array2)
      //returns true if the two arrays contain same elements
      
      //Arrays.fill(array, value)
      //sets every element to the given value
      
      //Arrays.sort(array)
      //arranges the elements into sorted order
      
      //Arrays.toString(array)
      //returns a string for the array, such as "[10, 30, -25, 17]"
      
   }
}