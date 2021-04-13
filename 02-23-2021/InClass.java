import java.util.Scanner;

public class InClass
{

   public static void main(String[] args)
   {
      
   //       Scanner in = new Scanner(System.in);
   //       
   //       // if statement - 1 option
   //       
   //       int age = 35;
   //       
   //       String name = "";
   //       
   //       if (age >= 30)
   //       {
   //          name = "Ryan";
   //          
   //          System.out.println("You get a 10% discount.");
   //       }
   //       
   //       System.out.println("Goodbye!" + name);
   //       
   //       // if/else - 2 options
   //       
   //       char letter = 'Z';
   //       
   //       if (letter < 'm') // determine if word comes before or after m
   //       {
   //          System.out.println("'" + letter + "' comes before 'm'.");
   //       }
   //       else if (letter == 'm')
   //       {
   //          System.out.println("'" + letter + "' IS 'm'");
   //       }
   //       else
   //       {
   //          System.out.println(letter + " comes after 'm'.");
   //       }
   //          
   //       System.out.println("\nEND");
   //       
      
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter a month (1-12): ");
      
      int month = in.nextInt();
      
      System.out.print("Enter a day (1-31): ");
      
      int day = in.nextInt();
      
      System.out.print("Enter a year (YY): ");
      
      int year = in.nextInt();
      
      
      
      // Very important string conversation from DAY
      String dayString = "";
      
      if (day <= 1)
      {
         dayString = day + "st";
      }
      else if (day <= 2)
      {
         dayString = day + "nd";
      }
      else if (day <= 3)
      {
         dayString = day + "rd";
         
      }
      else if (day <= 20)
      {
         dayString = day + "th";
      }
            
      else if (day <= 21)
      {
         dayString = day + "st";
      }
      
      else if (day <= 22)
      {
         dayString = day + "nd";
      }
      else if (day <= 23)
      {
         dayString = day + "rd";
      }
      
      else if (day <= 30)
      {
         dayString = day + "th";
      }
      else
      {
         dayString = day + "st";
      }
      
      
      // Print output
      if (month * day == year)
      
      {
      
         System.out.println(month + "\\" + dayString + "\\" + year + " is a magic date!");
      
      }
      
      else
      
      {
      
         System.out.println(month + "\\" + dayString + "\\" + year + " is not a magic date!");
      
      }
      
   }

}