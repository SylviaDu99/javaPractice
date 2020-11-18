//Lecture Note with LECTURE NINE
//10.13, Fri; 10.16, Mon
//TA: Judith Kim
//print time...? long!
//**void: nothing return
//place of void: type of data returned
//here it's long!
//drawing panel to animate!! LECTURE NINE FIGURE ON BALLS!!!
//SCANNER!!

import java.awt.*;

import java.util.*;

public class LectureEight {
   public static final int SIZE = 30;
   public static final int HALF = SIZE / 2;
   
   public static void main(String[] args) {
      //number of milliseconds since Jan 1, 1970
      long millis = System.currentTimeMillis();
      long days = millisToDays(millis);
      //System.out.print(days);
      
      //won't move before user typing in anything
      //scanner execute one word a time
      Scanner console = new Scanner(System.in);
      System.out.print("Please enter the displacement:");
      double displacement = console.nextDouble();
      System.out.print("Please enter the angle:");
      double angle = console.nextDouble();
      
      DrawingPanel panel = new DrawingPanel(1000, 1000);
      panel.setBackground(Color.CYAN);
      Graphics pen = panel.getGraphics();
      
      double x = 500.0;
      double y = 500.0;
      
      double radians = Math.toRadians(angle);//radians!  
      double xDisplacement = displacement * Math.cos(radians); //pixels
      double yDisplacement = displacement * Math.sin(radians) * -1; //pixels

      
      pen.fillOval((int) x - HALF, (int) y - HALF, SIZE, SIZE);
      
      for (int i = 1; i <= 1000; i++) {
         panel.sleep(100); //pause the program for 1000 millisecond
         
         x = x + xDisplacement;//change the x location
         y = y + yDisplacement;//change the y location
         
         if (x - HALF <= 0 || x + HALF >= 1000) {
            xDisplacement = xDisplacement * -1;
         }
         
         if (y - HALF <= 0 || y + HALF >= 1000) {
            yDisplacement = yDisplacement * -1;
         }
         
         pen.fillOval((int) x - HALF, (int) y - HALF, SIZE, SIZE);//draw the ball again
      }     
   }
   
   public static long millisToDays(long millis) {
      long days = millis / 1000 / 60 / 60 / 24;
      return days;
   }
}