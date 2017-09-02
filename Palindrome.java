import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("String :"+str);
		
		String rev="";
		for (int i=str.length()-1;i>=0;i--)
		{
			rev=rev+ str.charAt(i);
		}
		System.out.println("Rev String :"+rev);
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("String is palindrome");
		}
		else
			System.out.println("String not palindrome");

	}

}
