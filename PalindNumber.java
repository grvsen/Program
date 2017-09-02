import java.util.Scanner;

public class PalindNumber 
{

	public static void main(String[] args)
	{
		int r,sum=0;
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int temp=num;
		while (num>0) 
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		System.out.println(sum);
		
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not Palindrome");
		}

	}

}
