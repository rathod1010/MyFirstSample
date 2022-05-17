import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Mobile{
    // Write your code here..
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

	public String addMobile(String company,String model)
	{
         ArrayList<String> list = null;
		 if(mobiles.containsKey(company))
			 list=mobiles.get(company);
		 else
			 list = new ArrayList<String>();

		 list.add(model);
		 mobiles.put(company,list);
		 return "model successfully added";
	}

	public ArrayList<String> getModels(String company)
	{
             if(mobiles.containsKey(company))
				 return mobiles.get(company);
			 else
			 return null;
			
	}

	public String buyMobile(String company, String model)
	{
         if(mobiles.containsKey(company))
		 {
			 ArrayList<String> list = mobiles.get(company);
             boolean flag = false;
			 for(String ss : list)
			 {
				 if(ss.equals(model))
				 {
					 list.remove(ss);
					 flag=true;
					 break;
				 }
			 }
			 mobiles.put(company,list);
			 if(flag)
			 return "mobile sold successfully";
			 else
			 return "item not available";


		 }
		  return "item not available";

	}
}

public class Source {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}
}