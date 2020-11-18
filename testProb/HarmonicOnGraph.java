public class HarmonicOnGraph {
   public static void main(String[] args) {
      double f1 = 9;
      double f2 = 3;
      double f3 = 2;
      double f4 = 3;
      double f5 = 2;
      double f6 = 4;
      double f7 = 7;
      double f8 = 8;
      for (int i = 1; i < 1000; i++) {
         double t1 = (f2 + f3 + f6) / 3;
         double t2 = (f1 + f3) / 2;
         double t3 = (f2 + f4) / 2;
         double t4 = (f3 + f5 + f8) / 3;
         double t5 = (f1 + f4 + f7) / 3;
         double t6 = (f1 + f7) / 2;
         double t7 = (f6 + f5) / 2;
         double t8 = f4;
         f1 = t1;
         f2 = t2;
         f3 = t3;
         f4 = t4;
         f5 = t5;
         f6 = t6;
         f7 = t7;
         f8 = t8;
      }
      System.out.println(f1);
      System.out.println(f2);
      System.out.println(f3);
      System.out.println(f4);
      System.out.println(f5);
      System.out.println(f6);
      System.out.println(f7);
      System.out.println(f8);
   }
}