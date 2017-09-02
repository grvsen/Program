import java.util.Arrays;
import java.util.Scanner;

public class Anagram1
{
	static boolean isAnagram(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		
		char[] s1=str1.toLowerCase().toCharArray();
		char[] s2=str2.toLowerCase().toCharArray();
		boolean anagram=true;
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for (int i = 0; i < s1.length; i++)
		{
			if(s1[i]!=s2[i])
			{
				anagram=false;
			}
			
		}
		return anagram;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		boolean result=isAnagram(str1, str2);
		if(result)
		{
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}

	}

}
