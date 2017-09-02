import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int x=0, y=1;
		
		System.out.print(x+" "+y);
		
		for(int i=2;i<size;i++)
		{
			int z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;
			
		}

	}

}
