import java.util.Scanner;

public class InClass
{
   public static void main (String[] args)
   {      
      Scanner in = new Scanner(System.in);
      
      Marble marble1 = new Marble("red", "M");
      Marble marble2 = new Marble("red", "M");
      
      if (marble1.equals(marble2))
      {
         System.out.println("Same");
      }
      
      System.out.printf("Price of marbles: $%-10.2f!!!", Marble.PRICE);
      
//       System.out.print("Enter a price: ");
//       
//       // read in only if it's an integer
//       
//       if(in.hasNextDouble()) // check if int or not
//       {
//          double age = in.nextDouble();
//          System.out.println("\nPrice: " + age);
//       }
//       else
//       {
//          System.out.println("\nError! Price must be a double.");
//       }
   
   }
}