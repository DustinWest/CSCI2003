import java.util.Scanner;

public class Shapes
{

   public static void main(String[] args)
   {
      
      Scanner in = new Scanner(System.in);
   
      System.out.print("Enter a shape (SQUARE or HEXAGON): ");
      int shape = in.nextInt();
      
      System.out.print("Enter a design (STAR or DASH): ");
      int design = in.nextInt();
      
      if (shape == 1)
      {
         if (design == 1)
         {
            System.out.println("*******************");
            System.out.println("* *************** *");
            System.out.println("* *             * *");
            System.out.println("* *             * *");
            System.out.println("* *             * *");
            System.out.println("* *             * *");
            System.out.println("* *             * *");
            System.out.println("* *************** *");
            System.out.println("*******************");
         }
         else
         {
            System.out.println("-------------------");
            System.out.println("- --------------- -");
            System.out.println("- -             - -");
            System.out.println("- -             - -");
            System.out.println("- -             - -");
            System.out.println("- -             - -");
            System.out.println("- -             - -");
            System.out.println("- --------------- -");
            System.out.println("-------------------");
         }
      }
      else
      {
         if (design == 1)
         {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("* *             * *");
            System.out.println(" * *           * *");
            System.out.println("  * *         * *");
            System.out.println("   * ********** *");
            System.out.println("*******************");
         }
         else
         {
            System.out.println("*******************");
            System.out.println("* *************** *");
            System.out.println("* *             * *");
            System.out.println("* *             * *");
            System.out.println("* *             * *");
            System.out.println("* *             * *");
            System.out.println("* *             * *");
            System.out.println("* *************** *");
            System.out.println("*******************");
         }
      }
      
   }
   
}