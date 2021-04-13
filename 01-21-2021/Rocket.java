public class Rocket
{
   private int height;
   private String color;
   private double price;
   
   /**
      No-argument constructor
      @param null
   */
   public Rocket()
   {
      height = 10;
      color = "apple red";
      price = 1019.95
   }
   
   /** 
      Argument constructor
      @param h height in inches
      @param col color of the rocket
      @param pr price in euros
   */
   public Rocket(int h, String col, double pr)
   {
      height = h;
      color = col;
      price = pr;
   }
   
}