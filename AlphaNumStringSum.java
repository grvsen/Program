import java.util.Scanner;

public class AlphaNumStringSum 
{
	
	static int calsum(String s)
	{
		int sum=0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			if(Character.isDigit(s.charAt(i)))
			{
				sum=sum+Character.getNumericValue(s.charAt(i));
			}
			
		}
				
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int sum=calsum(str);
		System.out.println(sum);
		

	}

}
