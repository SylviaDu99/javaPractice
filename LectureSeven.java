//Lecture Note!!
//Lecture 7!!
//Car Drawing again!!!
//and parameter practices
//Oct.11, Wed.
//

import java.awt.*;

public class LectureSeven {
   public static void main(String[] arg) {
      int x = 5;
      DrawingPanel drawPanel = new DrawingPanel(700, 1000);
      Graphics pen = drawPanel.getGraphics();

      drawCar(pen, 10, 10, 10);
      
      for (int i = 1; i <= 3; i++) {
         drawCar(pen, 250, (i * 200), 5);
      }
      
      String lol = "2";
      String wtg = "3";
      String aaa = "1";
      
      mystery(lol, wtg, aaa);
   }
   
   public static void drawCar(Graphics g, int x, int y, int size) {
      g.setColor(Color.BLACK);
      g.fillRect(x, y, 20 * size, 10 * size);
      g.fillOval(x + size, y + 8 * size, 6 * size, 6 * size);
      g.fillOval(x + 13 * size, y + 8 * size, 6 * size, 6 * size);
      g.setColor(Color.BLUE);
      g.fillRect(x + 13 * size, y + 2 * size, 7 * size, 4 * size);
      g.setColor(Color.RED);
      g.fillRect(x, y + 4 * size, 10 * size, size);
   }
   
   public static void mystery(String one, String two, String three) {
      System.out.print(one + " " + three + " " + two);
   }
}