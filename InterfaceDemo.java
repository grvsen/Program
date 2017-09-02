import java.util.Scanner;

interface AdvancedArithmatic
{
	int divisorSum(int n);
}
class Calculator implements AdvancedArithmatic
{
	public int divisorSum(int n)
	{
		int sum=0;
		for (int i = 1; i < n; i++) 
		{
			if(n%i==0)
			{
				sum=sum+i;
				
			}
		}
		return sum;
	}
}


public class InterfaceDemo
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		AdvancedArithmatic myCalculator=new Calculator();
		int sum=myCalculator.divisorSum(n);
		System.out.println("I implemented :"+myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);

	}

}
