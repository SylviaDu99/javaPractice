// Jingyun Du
// 10/17/17
// CSE142
// TA: Judith Kim
// Assignment #3B
//
// This program will draw a picture with many circles and some grids with circles inside.

import java.awt.*;

public class Circles{
   public static void main(String[] args) {
      DrawingPanel drawPanel = new DrawingPanel(500, 350);
      Graphics pen = drawPanel.getGraphics();
      drawPanel.setBackground(Color.CYAN);
      drawCircles(pen, 0, 0, 100, 10);
      drawCircles(pen, 130, 25, 100, 10);
      drawCircles(pen, 260, 0, 60, 6);
      drawCircles(pen, 360, 50, 80, 4);
      drawGrids(pen, 10, 170, 48, 4, 3);
      drawGrids(pen, 180, 200, 24, 2, 5);
      drawGrids(pen, 330, 170, 72, 9, 2);
   }
   
   //to draws circles part (upper part of the whole pic)
   //num = num of circles per figure
   public static void drawCircles(Graphics pen, int x, int y, int size, int num) {
      int gap = size / (num * 2);
      pen.setColor(Color.YELLOW);
      pen.fillOval(x, y, size, size);
      pen.setColor(Color.BLACK);
      int a = size;
      for(int i = 1; i <= size; i++) {
         pen.drawOval(x, y, a, a);
         x = x + gap;
         y = y + gap;
         a = a - 2 * gap;
      }
   }
   
   //to draw grids part (bottom part of the pic)
   //size = size of subfigure
   //num = num of circles per subfigure
   public static void drawGrids(Graphics pen, int x, int y, int size, int num, int rows) {
      size = size * rows;
      pen.setColor(Color.GREEN);
      pen.fillRect(x, y, size, size);
      pen.setColor(Color.BLACK);
      pen.drawRect(x, y, size, size);
      size = size / rows;
      for(int i = 1; i <= rows; i++) {
         for(int j = 1; j <= rows; j++) {
            drawCircles(pen, x, y, size, num);
            x = x + size;
         }
         x = x - size * rows;
         y = y + size;
      }
      pen.drawLine(x, y - size * rows, x + size * rows, y);
      pen.drawLine(x, y, x + size * rows, y - size * rows);
   }
}