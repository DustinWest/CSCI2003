public class Marble
{
   
   private String color;
   private String size; // S,M,L
   
   public static final double PRICE = 0.20; // all marbles are $0.20
   
   public Marble()
   {
      color = "green";
      size = "S";
   }
   
   public Marble(String col, String sz)
   {
      color = col;
      size = sz;
   }

   public boolean equals(Marble other)
   {
      if(!this.color.equals(other.color))
      {
         return false;
      }
      return true;
   }
   
   public String toString()
   {
      return "Color: " + color +
             "\nSize: " + size;
   }
   
}