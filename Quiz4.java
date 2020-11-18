//Quiz4 note!
//TA: Judith Kim
//

import java.awt.*;

public class Quiz4 {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(400, 300);
      panel.setBackground(Color.CYAN);
      Graphics g = panel.getGraphics();
      drawRect(g, 50, 50);
      drawRect(g, 250, 10);
      drawRect(g, 180, 115);
   }
   
   public static void drawRect(Graphics g, int x, int y) {
      g.setColor(Color.RED);
      for (int i = 1; i <= 5; i++) {
         g.drawRect(x, y, 20 * i, 20 * i);
      }
      g.setColor(Color.BLACK);
      g.drawLine(x, y, x + 100, y + 100);
   }
}