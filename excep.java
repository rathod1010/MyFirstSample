import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Activity{
  //Implement Activity class here..

  String string1;
  String string2;
  String operator;
  Activity(String string1,String string2,String operator)
  {
    this.string1=string1;
    this.string2=string2;
    this.operator=operator;
  }
}



public class Source {
  //Implement the two function given in description in here...

  public String handleException(Activity a)
  {
   
    try
    {
      if(a.string1==null || a.string2==null)
          throw new NullPointerException("Null values found");

      if(!(a.operator.equals("+")) && !(a.operator.equals("-")))
          throw new Exception("Default exception "+a.operator);
    }

    catch(NullPointerException ex)
    {
      return ex.getMessage();
    }
    catch(Exception e)
    {
      return e.getMessage();
    }
    return "No Exception Found";

  }

  public String doOperation(Activity a)
  {
        String result = new String();
        switch(a.operator)
        {
          case "+" : { 
            result=a.string1.concat(a.string2);
            return result;
            }
            case "-" : 
            {
              String regex = a.string2;
              result = a.string1.replaceAll(regex,"");
              return result;
            }

        }
        return result;
  }


  
	public static void main(String args[] ) throws Exception {
    //Write your own main to check the program...

  }
}