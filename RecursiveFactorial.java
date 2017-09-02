import java.util.Scanner;

public class RecursiveFactorial 
{

	static int factorial(int number)
	{
		if(number==0)
		{
			return 1;
		}
		else
		{
			return number*factorial(number-1);
		}
	}
	
	public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        int number=sc.nextInt();
	        
	        int fact=1;
	        fact=factorial(number);
	        System.out.println("Factorial is:"+fact);
	       
	}
}