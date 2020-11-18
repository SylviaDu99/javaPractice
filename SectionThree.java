//practice section 3
//

import java.awt.*;

public class SectionThree {
   public static void main(String[] args) {
      DrawingPanel drawPanel = new DrawingPanel(220, 150);
      Graphics pen = drawPanel.getGraphics();
      drawPanel.setBackground(Color.YELLOW);
      pen.setColor(Color.BLUE);
      pen.fillOval(50, 25, 40, 40);
      pen.fillOval(130, 25, 40, 40);
      pen.setColor(Color.RED);
      pen.fillRect(70, 45, 80, 80);
      pen.setColor(Color.BLACK);
      pen.drawLine(70, 85, 150, 85);
   }
}