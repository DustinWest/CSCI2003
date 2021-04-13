// DRIVER PROGRAM - start program; use Course class
public class AvailableCourses
{
   public static void main(String[] args)
   {
      // create a Course object
      Course course1 = new Course();
      Course course2 = new Course("Ethics", 
                                  "CSCI", 2003);
                                  
      System.out.println(course1.getSubject());
      
      // change name
      course1.setName("Ethics");
      
      System.out.println(course1.getName());
      
      // display course number of course2
      
      // update course number of course2 with 2010
      
      // display course number of course2
      
      if (course1.equals(course2))
      {
         System.out.println("same");
      }      
      else
      {
         System.out.println("different");
      }
      
      
   }  
}