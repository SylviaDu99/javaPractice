//Notes and exercises for lab3
//practice to use debugger!
//and practice to use graphics!
//for loop use in graphics!!!
//10.10, Tue

import java.awt.*;

public class LabThree {
   public static void main(String[] args) {
      int number = 42;
      for (int i = 1; i <= 1000; i++) {
          number = number * 37 % 103;
      }
      int number2 = number * number;
      System.out.println("result = " + number2);
      
        
      //create a new panel!
      DrawingPanel panel = new DrawingPanel(500, 500);
        
      //get a paint brush!
      Graphics g = panel.getGraphics();
      
      //!!!!!parameters for drawpanels must be int!!!!!
      
      //g.drawLine(x1, y1, x2, y2);
      //This will draw a line from (x1, y1) to (x2, y2)
      g.drawLine(200, 200, 350, 425);
      
      //g.drawOval(x, y, width, height);
      //This will draw the biggest oval that fits within the box of size width * height
      //with the top left corner at (x, y).
      g.drawOval(350, 300, 140, 100);
      
      //g.drawRect(x, y, width, height);
      //This will draw a rectangle of size width x height with the top left at (x, y)
      g.drawRect(10, 10, 150, 250);
      
      //g.setColor(Color.RED);
      //This will change the color of your paint brush.
      g.setColor(Color.MAGENTA);
      
      //panel.setBackground(Color.BLUE);
      //This will change the color of the canvas.
      panel.setBackground(Color.LIGHT_GRAY);
      
      //g.fillOval(x, y, width, height);
      //Fill oval with color
      g.fillOval(25, 50, 100, 50);
      
      //g.fillRect(x, y, width, height);
      //fill rectangle with color
      g.fillRect(150, 200, 50, 75);
      
      
      for (int i = 1; i <= 10; i++) {
         g.drawRect(5, 10 * i - 5, 10 * i, 10);
      }
   }
   
   public static void drawStuff(Graphics g, int a, int b, int c) {
      //some drawing methods here!!!
   }
}