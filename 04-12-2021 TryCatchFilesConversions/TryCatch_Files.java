import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException; // no more data to read

public class TryCatch_Files
{
   public static void main(String[] args)
   {
      
      Scanner in = new Scanner(System.in);
      
      // display all years > 2018
      
      try
      {
         
         File file = new File("years.txt");
         Scanner infile = new Scanner(file);
         
         boolean endFile = true; // true = more lines; false = no lines
         
         while (endFile) // try/catch used for each line of the file.
         {
            try
            {
               // read file
               System.out.println(infile.next());
            }
            catch(NoSuchElementException object)
            {
               endFile = false;
            }
         }
         
         infile.close();
         
      }
      catch (FileNotFoundException e) // object of exception trying to catch
      {
      
      }
   
         
      
   }
}
