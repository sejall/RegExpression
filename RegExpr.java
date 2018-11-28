import java.util.regex.*;
class RegExpr5
{
	public static void main(String args[])
	{
					
		Pattern pat= Pattern.compile("t[eist]+");
		Matcher mat= pat.matcher("this tee tie is a test");
		while(mat.find())
		{
			System.out.println ("Match:"+ mat.group());
		}
			
	}
}