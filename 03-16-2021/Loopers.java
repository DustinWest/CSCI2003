import java.util.Scanner;

public class Loopers
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      String month = "March";
      
      for (int index = 0; index < month.length(); index++)
      {
         // display letter
         // System.out.print(month.charAt(index) + " ");
         System.out.print(month.substring(index, index + 1) + " ");
         // System.out.print(month.charAt(index) + " ");
      }
      
      
      // // for(create loop var; check condition; update loop variable)
//       for(int count = 1; count <= 10; count ++)
//       {
//          System.out.print(count + " ");
//       }
      
      // // loop variable
//       // get number of ints user will enter
//       System.out.print("How many integers?: ");
//       int numInts = in.nextInt();
//       
//       int count = 0;
//       
//       while(count < numInts)
//       {
//          
//          // get ints
//          System.out.print("Enter an integer: ");
//          int num = in.nextInt();
//          
//          count ++;
//          
//       }
      
      // // ask user to enter some number integers
//       String keepGoing = "";
//       String numbers = "";
//       
//       while(true) // loop until user is done entering ints
//       {
//          // get ints
//          System.out.print("Enter an integer: ");
//          int num = in.nextInt();
//          numbers += num + " ";
//          
//          System.out.print("Would you like to keep going? (y/n): ");
//          keepGoing = in.next();
//          
//          if (!keepGoing.equals("y"))
//          {
//             System.out.println("DONE");
//             break;
//          }
//          System.out.println("OK");
//       
//       }
//       System.out.println(numbers);
      
      // // display 1 - 10
   //       
   //       // loop variable
   //       int count = 1;
   //       
   //       String numList = "";
   //       
   //       while (count <= 20) // count < 11
   //       {
   //          
   //          if (count % 2 == 0)
   //          {
   //             numList += count + " ";
   //          }
   //          // update loop variable
   //          count++;
   //          
   //       }
   //       
   //       System.out.print(numList);
   }
}