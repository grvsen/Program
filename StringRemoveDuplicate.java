import java.util.Scanner;

public class StringRemoveDuplicate 
{
	
	public static String removeDuplicate(String str)
	{
		String res=" ";
		for (int i = 0; i < str.length(); i++) 
		{
			if(!res.contains(String.valueOf(str.charAt(i))))
			{
				res+=String.valueOf(str.charAt(i));
			}
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String result=removeDuplicate(str);
		System.out.println(result);

	}

}
