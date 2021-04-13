/**
   Class that represents a course at ULM
   String name; String subject; Int courseNum;
   return value
*/
// create a class
public class Course  // represents a ULM course
{
   // instance variables/attributes - describe what a course is
   private String name;
   private String subject;
   private int courseNum;
   
   /* constructor - initializes instance variables */
   
   /**
      Initializes all instance variables
      @param n name of a course
      @param subject what the course is about
      @param courseNum the banner system course code
   */
   
   // no-argument constructor - class creator decides initial values of instance variable
   public Course()
   {
      name = "Intermediate Programming";
      subject = "CSCI";
      courseNum = 2003;
   }
   
   // argument constructor - object creator decides initial values
   public Course(String n, String s, int c)
   {
      name = n;
      subject = s;
      courseNum = c;
   }
      
   /* methods - allow you to interact with instance variables */
   
   // setters/mutator - change value of instance variables
   
   /*
      Updates name instance variable
      @param n name of a course
   */
   public void setName(String n)
   {
      name = n;
   }
   
   public void setSubject(String s)
   {
      subject = s;
   }
   
   public void setCourseNum(int c)
   {
      courseNum = c;
   }
      
   // getters/accessor - gets value of instance variables out of object
   /**
      Gets the name of a course
      @return the course's name
   */
   public String getName()
   {
      return name;
   }
   
   public String getSubject()
   {
      return subject;
   }
   
   public int getCourseNum()
   {
      return courseNum;
   }
   
}