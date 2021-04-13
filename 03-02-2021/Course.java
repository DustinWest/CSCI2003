/**
   Class that represents a course at ULM 
*/
public class Course  // represents a ULM course
{
   // instance variables/attributes - describe what a course is
   private String name;
   private String subject;
   private int courseNum;
   
   /* constructor - initializes instance variables */
   
   /**
      Initializes all instance variables
   */
   public Course()
   {
      name = "Intermediate Programming";
      subject = "CSCI";
      courseNum = 2003;
   }
   
   /**
      Initializes all instance variables
      @param n name of a course
      @param s subject of a course
      @param c course's number
   */
   public Course(String n, String s, int c)
   {
      name = n;
      subject = s;
      courseNum = c;
   }
      
   /* methods - allow you to interact with instance variables */
   
   /**
      Updates name of course
      @param n name of a course
   */
   public void setName(String n)
   {
      name = n;
   }
   
   /**
      Updates subject of course
      @param s subject of a course
   */
   public void setSubject(String s)
   {
      subject = s;
   }
   
   /**
      Updates course number 
      @param c course number
   */
   public void setCourseNum(int c)
   {
      courseNum = c;
   }
      
   /**
      Gets the name of a course
      @return name of a course
   */
   public String getName()
   {        
      return name;
   }
   
   /**
      Gets the subject of a course
      @return subject of a course
   */
   public String getSubject()
   {
      return subject;
   }
   
   /**
      Gets the course number
      @return course number
   */
   public int getCourseNum()
   {
      return courseNum;
   }
   
   // equals method to compare if two courses are exactly the same
   public boolean equals(Course other)
   {
      
      // check if names are equal
      if (!this.name.equals(other.name))
      {
         return false;
      }
      
      // check if subjects are equal
      if (!this.subject.equals(other.subject))
      {
         return false;
      }
      
      // check if courseNums are equals
      if (this.courseNum != other.courseNum)
      {
         return false;
      }
      
      return true;
   }
   
}  