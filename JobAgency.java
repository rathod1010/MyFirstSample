import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class CompanyJobRepository {
	static String getJobPrediction(int age, String highestQualification) throws NotEligibleException
	{
		String s ;
		if(age>18)
		{
			if(age>20 && highestQualification.equals("B.E"))
			s="We have openings for junior developer";

			else if(age>25 && (highestQualification.equals("M.S")) || (highestQualification.equals("PhD")))
			s="We have openings for senior developer";

			else if(age>18 && !(highestQualification.equals("B.E")) && !(highestQualification.equals("M.S")) && !(highestQualification.equals("PhD")))
			throw new NotEligibleException("We do not have any job that matches your qualifications");

			else
			s="Sorry we have no openings for now";
		}
		else
		throw new NotEligibleException("You are underage for any job");
		return s;
	}

}

public class Source {

	public static String searchForJob(int age, String highestQualification) throws NotEligibleException {
		String s = new String();
		if(age>=200 || age<=0)
		{
			throw new NotEligibleException("The age entered is not typical for a human being"); 
		}
		else{
			s = CompanyJobRepository.getJobPrediction(age,highestQualification);
		}
		return s;
	}
	public static void main(String args[] )  {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}
}
class NotEligibleException extends Exception {

	public NotEligibleException(String a)
	{
		super(a);
	}
}