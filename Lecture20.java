//lecture notes
//11.17, Fri. ; 11.20, Mon.
//TA: Judith Kim
//
//class and object
//
//AND lecture 21
//
//private!!!!

public class Lecture20 {
   //access: <variable>.<field>
   //modify: <variable>.<field> = <value>
   //Point p1 = new Point();
   //Point p2 = new Point();
   //System.out.println("x1 is " + p1.x);
   //p2.y = 13;
   
   //instance method: method inside an object that operates on that object
   //public <type> <name> (<parameters>) {   ***not static!!
   //   <statements>;
   //}
   //accessor: an instance method that provides information about the state of an object
   //public int getX() {
   //   return x;
   //}
   //mutator: an instance method that modifies the object's internal state
   //public void translate(int dx, int dy) {
   //   x += dx;
   //   y += dy;
   //}
   //constructor: initializes the state of new objects  !ITS NOT A METHOD!
   //have to have SAME NAME as CLASS to show the constructor refer to this class
   //can have more than one constructors
   //public type(parameters) {
   //   statements;
   //}
   //use instance method: <variable>.<method>(<parameters>);
   //p1.translate(11, 6);
   
   public static void main(String[] args) {
      Point p1 = new Point();
      Point p2 = new Point(5, 2);
      Point p3 = new Point(7, 9);
      
      p1.setXY(3, 4);
      
      p2.translate(2, 4);
      
      System.out.println(p2.getX() + " " + p2.getY());
      System.out.println(p2);
      
      System.out.println(p1.distanceFromOrigin());
      System.out.println(p2.distanceFromOrigin());
      System.out.println(p3.distanceFromOrigin());
   }
   
   //encapsulation! private!
   //private type name;
   //read only access to x field (accessor)
   //public int getX() {
   //   return x;
   //}
   //change x field (mutator)
   //public void setX(int newX) {
   //   x = newX;
   //}
}