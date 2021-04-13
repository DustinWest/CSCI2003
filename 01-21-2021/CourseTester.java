/** 
   Create different ULM courses
*/

// DRIVER PROGRAM - start program; use Course class
public class CourseTester
{
   /**
      Create different ULM courses
      @param args commandline arguments
   */
   
   public static void main(String[] args)
   {
            
      // //  test no-argument constructor and getters
//       Course course1 = new Course();
//       
//       // check if instance variables
//       // initialized correctly
//       System.out.println("\n" + course1.getName());
//       System.out.println("Expected: Intermediate Programming");
//       
//       // test setters
//       course1.setName("Intro to Programming");
//       System.out.println("\n" + course1.getName());
//       System.out.println("Expected: Intro to Programming");
//       
//       // test argument constructor
//       Course course2 = new Course("Ethics", "CSCI", 2098);
//       System.out.println("\n" + course2.getName());
//       System.out.println("Expected: Ethics");
//       
//       // non-linked addresses with ints
//       System.out.println();
//       int num = 10;
//       int num2 = num;
//       num2 = 5;
//       System.out.println(num);
//       System.out.println(num2);
      
      // object references
      Course c1 = new Course(); // addr1
      Course c2 = c1; // c2 stores addr1
      c2.setName("Ethics");
      System.out.print("c1 name: ");
      System.out.println(c1.getName());
      System.out.print("c2 name: ");
      System.out.println(c2.getName());
      
      // 1. Code Comments
      // 2. Output Comments
      // -- Result
      
      System.out.println("Set c2 -> new Course");
      c2 = new Course(c1.getName(), "", 0);
      c2.setName("Stuff");
      System.out.print("c1 name: ");
      System.out.println(c1.getName());
      System.out.print("c2 name: ");
      System.out.println(c2.getName());
      
   }  
}