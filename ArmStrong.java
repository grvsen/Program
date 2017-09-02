import java.util.Scanner;

public class ArmStrong {

	private static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0;
		int temp=number;
		while(number>0)
		{
			int r=number%10;
			number=number/10;
			sum=sum + (r*r*r);
		}
		
		if(sum==temp)
		{
			System.out.println(temp);
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println(temp);
			System.out.println("Not Armstrong number");
		}

	}

}
