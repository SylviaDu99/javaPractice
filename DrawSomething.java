//Lecture Notes!!
//Basic Drawing Tool -- JAVA!!!!!
//10.9, Mon
//In Lecture6
//This program actually draws a CAR!!!!!

import java.awt.*;

public class DrawSomething {
   public static void main(String[] arg) {
      int x = 5;
      DrawingPanel drawPanel = new DrawingPanel(700, 700);
      Graphics pen = drawPanel.getGraphics();
      pen.drawLine(0, 0, 100, 100);
      drawCar(pen);
   }
   
   public static void drawCar(Graphics g) {
      g.fillRect(10, 100, 200, 100);
      g.fillOval(15, 180, 60, 60);
      g.fillOval(145, 180, 60, 60);
      g.setColor(Color.BLUE);
      g.fillRect(140, 120, 70, 40);
      g.setColor(Color.RED);
      g.fillRect(10, 140, 100, 10);
   }
}