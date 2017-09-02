import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameChecker {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int testCase=Integer.parseInt(sc.nextLine());
		
		while(testCase>0)
		{
			String username=sc.nextLine();
			String pattern="^[A-Za-z]([A-Za-z0-9_]){7,29}$";
			Pattern p=Pattern.compile(pattern);
			Matcher m=p.matcher(username);
		
			if(m.find())
			{
				System.out.println("Valid");
			}
			else
			{
				System.out.println("Invalid");
			}
				testCase--;
		}

	}

}
