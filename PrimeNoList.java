import java.util.Scanner;

public class PrimeNoList 
{

	public static void main(String[] args) 
	{
		int flag=0;
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		for(int i=num1 ;i<=num2 ; i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(i);
			}
		}
		

	}

}
