import java.util.HashMap;
import java.util.Scanner;

public class StringCharCount
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		
		String str1=str.toLowerCase();
		
		char[] ch=str1.toCharArray();
		
		for (char i = 'a'; i < 'z'; i++)
		{
			for (char c : ch) 
			{
				if(c==i)
				{
					count++;
				}
				
			}
			
			if(count!=0)
			{
				System.out.println(i+" = "+count);
				count=0;
			}
			
		}

	}

}


/*public class StringCharCount
{
	public static void charCount(String str)
	{
		HashMap<Character, Integer> count=new HashMap<Character,Integer>();
		char[] ch=str.toCharArray();
		
		for (char c : ch) 
		{
			if(count.containsKey(c))
			{
				count.put(c, count.get(c)+1);
			}
			else
			{
				count.put(c, 1);
			}
			
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		charCount("Hello World");
		charCount("Welcome to java");
		
	}
}*/



