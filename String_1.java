class Email{
// Implement Email Class according to the specifiaction.
Header header;
String body;
String greetings;

Email(Header header, String body,String greetings)
{
	this.header=header;
	this.body=body;
    this.greetings=greetings;
}
}
class Header{
// Implemet the Header Class according to the specifiaction.
String from;
String to;
Header(String from,String to)
{
	this.from=from;
	this.to=to;
}
}


class EmailOperations{
// Implemet the Three methods specified in the specified.	

public int emailVerify(Email e)
{
String fromEmail = e.header.from;
String toEmail = e.header.to;
String regex =  "^([A-Za-z_]+)@([a-zA-Z]+)(\\.[A-Za-z]+)$";
Pattern pattern = Pattern.compile(regex);
 Matcher matcher1 = pattern.matcher(fromEmail);
  Matcher matcher2 = pattern.matcher(toEmail);
  if(matcher1.matches() && matcher2.matches())
	  return 2;
   else if(matcher1.matches() || matcher2.matches())
	  return 1;	   
   else
	  return 0;
}

public String bodyEncryption(Email e)
{
	String text = e.body;

StringBuffer result= new StringBuffer();
 
        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                                  3 - 65) % 26 + 65);
                result.append(ch);
            }
         else if(Character.isSpace(text.charAt(i)))
{
result.append(text.charAt(i));
}
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                                  3 - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
        
}

public String greetingMessage(Email e)
{
	String greeting1 = e.greetings;
	String fromEmail = e.header.from;
	String[] name = fromEmail.split("@");
	String s = name[0];
	String message = greeting1+" "+s;

	
return message;
}
}