import java.util.Scanner;

public class PrimeCheck 
{

	static boolean isPrime(int n)
	{
		if(n%2==0)
		{
			return false;
		}
		for(int i=3;i*i<=n;i+=2)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean result=isPrime(num);
		System.out.println((result) ? "Prime" : "Not Prime");
	}

}
