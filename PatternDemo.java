import java.util.Scanner;

public class PatternDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		for(int i=1;i<=size;i++)      //1
		{                             //1 2 
			for(int j=1;j<=i;j++)     //1 2 3 
			{                         //1 2 3 4
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=size-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		/*for(int i=1;i<=size;i++)      //1
		{                               //2 2 
			for(int j=1;j<=i;j++)       //3 3 3 
			{                           //4 4 4 4
				System.out.print(i+" ");
			}
			System.out.println();
		}*/
		
	}

}
