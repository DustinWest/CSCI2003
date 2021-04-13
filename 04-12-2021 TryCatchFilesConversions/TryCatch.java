import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;

public class TryCatch
{
   public static void main(String[] args)
   {
      
      Scanner in = new Scanner(System.in);
      
      boolean flag = true; // true = error, false = no error
      
      while (flag) // input validation
      {
         try
         {
            System.out.print("Enter an integer: ");
            
            int num = in.nextInt();
            
            int result = 500 / num;
            
            flag = false; // was an int, wasn't 0
            
            System.out.println("Success!");
         }
         catch (ArithmeticException object) // object of exception trying to catch
         {
            // handle exception here
            System.out.println("Can't divide by 0.");
         }
         // mismatch catcher
         catch (InputMismatchException object)
         {
            System.out.println("Error! Must be an integer");
            in.nextLine();
         }
         
         System.out.println("After try/catch");
         
      } // </while>
      
   }
}
