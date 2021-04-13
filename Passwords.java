import java.util.Scanner;

public class Passwords
{
   public static void main(String[] args)
   {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a password with only letters and no spaces: ");
      String plain = input.nextLine();
      
      System.out.println();
      System.out.print("(1) Enter the vowel to replace: ");
      String whatToReplace_1 = input.nextLine();
      System.out.println();
      System.out.print("(1) Enter what to replace it with: ");
      String whatToReplaceItWith_1 = input.nextLine();
      plain = plain.replace(whatToReplace_1, whatToReplaceItWith_1);
      
      System.out.println();
      System.out.print("(2) Enter the vowel to replace: ");
      String whatToReplace_2 = input.nextLine();
      System.out.println();
      System.out.print("(2) Enter what to replace it with: ");
      String whatToReplaceItWith_2 = input.nextLine();
      plain = plain.replace(whatToReplace_2, whatToReplaceItWith_2);
      
//       plain = plain.replace("A", "0");
//       plain = plain.replace("E", "1");
//       plain = plain.replace("I", "2");
//       plain = plain.replace("O", "3");
//       plain = plain.replace("U", "4");
//       plain = plain.replace("a", "5");
//       plain = plain.replace("e", "6");
//       plain = plain.replace("i", "7");
//       plain = plain.replace("o", "8");
//       plain = plain.replace("u", "9");
      
      System.out.println();
      System.out.println("New password: " + plain);
      
   }
}