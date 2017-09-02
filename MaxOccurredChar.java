import java.util.Arrays;
import java.util.Scanner;

public class MaxOccurredChar
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		int max=0;
		int count=1;
		
		char temp=arr[0];
		for (char c : arr) 
		{
			if(c==temp)
			{
				count++;
			}
			else
			{
				temp=c;
				if(count>max)
				{
					max=count;
				}
				count=1;
			}
			
		}
		if(count>max)
		{
			max=count;
		}
		
		System.out.println("count :"+max);
	}

}
