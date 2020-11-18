//related to lecture 20 and 21
//class and object
//point class

public class Point {
   private int x;
   private int y;
   
   public int getX() {
      return x;
   }
   
   public int getY() {
      return y;
   }
   
   public void setXY(int x, int y) {
      this.x = x;
      this.y = y;
   }
   
   public Point() {
      x = 0;
      y = 0;
   }
   
   public Point(int x, int y) {
      this.x = x;
      this.y = y;
   }
   
   public void translate(int dx, int dy) {
      x += dx;
      y += dy;
   }
   
   public double distanceFromOrigin() {
      return Math.sqrt(x * x + y * y);
   }
   
   public String toString() {
      return "(" + this.getX() + ", " + this.getY() + ")";
   }
}