import java.util.Scanner;

public class InClass
{
   
   public static void main(String[] args)
   {
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("1. pizza");
      System.out.println("2. burger");
      System.out.println("3. salad\n");
      
      System.out.print("Enter menu choice (1 - 3): ");
      int choice = in.nextInt();
      System.out.println();
      
      switch (choice)
      {
         
         case 1:
         {
            System.out.println("You ordered pizza.");
            break;
         }
         
         case 2:
         {
            System.out.println("You ordered a burger.");
            break;
         }
         
         case 3:
         {
            System.out.println("You ordered a salad.");
            break;
         }
         
         default:
         {
            System.out.println("Error! Must be 1 - 3.");
         }
         
      }
   
   }
   
}