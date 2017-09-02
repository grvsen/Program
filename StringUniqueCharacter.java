import java.util.Scanner;

public class StringUniqueCharacter
{
	
	public static boolean isUnique(String str)
	{
		boolean[] ch=new boolean[256];
		for (int i = 0; i < str.length(); i++) 
		{
			int value=str.charAt(i);
			
			if(ch[value])
			
				return false;
			
			ch[value]=true;
			
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//int size=sc.nextInt();
		boolean result=isUnique(str);
		System.out.println((result) ? "Unique" : "Not Unique");

	}

}
