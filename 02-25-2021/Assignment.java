import java.util.Scanner;

public class Assignment
{
   public static void main(String[] args)
   {
      
      Scanner in = new Scanner(System.in);
      
      // get cost from user
      System.out.print("Enter the cost of your groceries: ");
      double cost = in.nextDouble();
      double discount = 0.0;
      
      // calculate discount
      // if/else statements
      if (cost < 10.0)
      {
         discount = 0.00;
      }
      else if (cost <= 60.0)
      {
         discount = 0.08;
      }
      else if (cost <= 150.0)
      {
         discount = 0.10;
      }
      else if (cost <= 210.0)
      {
         discount = 0.12;
      }
      else
      {
         discount = 0.14;
      }
      
      // calculate how much saved
      double saved = cost * discount;
      
      System.out.printf("You win a discount coupon of $%.2f. (%.0f%% of your purchase)", saved, discount * 100.0);
      
   }
}