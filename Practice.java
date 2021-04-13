public class Practice
{
   public static void main(String[] args)
   {
      //
      String month = "January";
      
      int monthLen = month.length();
      
      System.out.println(monthLen);   // object.method()
   
      // replace method: replace part or all of a String
      
      String state = "Mississippi";
      state = state.replace("i", "1");
      state = state.replace("ss", "00");
      state = state.replace("pp", "--");
      System.out.println(state);
   
   }
}