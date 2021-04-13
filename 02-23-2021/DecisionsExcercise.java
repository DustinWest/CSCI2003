import java.util.Scanner;

public class DecisionsExcercise
{
   public static void main(String[] args)
   
   {
   
      Scanner in = new Scanner(System.in);
   
      System.out.print("Enter a month(1-12): ");
   
      int month = in.nextInt();
   
      System.out.print("Enter a day(1-31): ");
   
      int day = in.nextInt();
   
      System.out.print("Enter a year(YY): ");
   
      int year = in.nextInt();
   
      if ( month * day == year)
      
      {
      
         System.out.println(month + "\\" + day + "\\" + year + " is a magic date!");
      
      }
      
      else
      
      {
      
         System.out.println(month + "\\" + day + "\\" + year + " is not a magic date!");
      
      }
      
      String actualMonth = "";
      
      if (month == 1 )
      
      {
      
         actualMonth = "January";
       
      }
      
      else if ( month == 2)
      
      {
      
         actualMonth = "February";
      
      }
      
      else if (month == 3)
      
      {
      
         actualMonth = "March";
      
      }
      
      else if ( month == 4)
      
      {
      
         actualMonth = "April";
      
      }
      
      else if ( month == 5)
      
      {
      
         actualMonth = "May";
      
      }
      
      else if (month == 6)
      
      {
      
         actualMonth = "June";
      
      }
      
      else if (month == 7)
      
      {
      
         actualMonth = "July";
      
      }
      
      else if (month == 8)
      
      {
      
         actualMonth = "August";
      
      }
      
      else if (month == 9)
      
      {
      
         actualMonth = "September";
      
      }
      
      else if (month == 10)
      
      {
      
         actualMonth = "October";
      
      }
      
      else if (month == 11)
      
      {
      
         actualMonth = " November";
      
      }
      
      else if (month == 12)
      
      {
      
         actualMonth = "December";
      
      }
        
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
      
      System.out.println(actualMonth + " " + dayString + ", " + (2000 + year));
   
   }
   
}