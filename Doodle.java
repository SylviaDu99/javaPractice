// Jingyun Du
// 10/17/17
// CSE142
// TA: Judith Kim
// Assignment #3A
//
// This program will draw a doodle!
// Original character from game Doodle Jump. I don't own anything.

import java.awt.*;

public class Doodle {
   public static void main(String[] args) {
      DrawingPanel drawPanel = new DrawingPanel (400, 400);
      Graphics pen = drawPanel.getGraphics();
      drawPanel.setBackground(Color.CYAN);
      pen.setColor(Color.YELLOW);
      pen.fillOval(150, 50, 100, 100);
      pen.fillRect(150, 100, 100, 80);
      pen.fillRect(120, 95, 35, 10);
      pen.fillRect(155, 180, 10, 30);
      pen.fillRect(180, 180, 10, 30);
      pen.fillRect(210, 180, 10, 30);
      pen.fillRect(235, 180, 10, 30);
      pen.setColor(Color.GREEN);
      pen.fillRect(150, 125, 100, 40);
      pen.fillRect(145, 280, 110, 15);
      pen.setColor(Color.BLACK);
      pen.fillOval(170, 80, 9, 9);
   }
}