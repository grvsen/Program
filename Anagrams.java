import java.util.Arrays;
import java.util.Scanner;

public class Anagrams 
{
	static boolean isAnagaram(String str1,String str2)
	{
		char[] s1=str1.toLowerCase().replaceAll("[\\s]", " ").toCharArray();
		char[] s2=str2.toLowerCase().replaceAll("[\\s]", " ").toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		return Arrays.equals(s1, s2);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		boolean result=isAnagaram(str1, str2);
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
