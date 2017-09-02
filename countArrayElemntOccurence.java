import java.util.Scanner;

public class countArrayElemntOccurence
{
	public static int countOccurence(int[] arr,int size,int value)
	{
		int count=0;
		for (int i = 0; i < size; i++) 
		{
			if(value==arr[i])
			{
				count++;
			}
			
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int value=sc.nextInt();
		int[] arr=new int[size];
		
		for (int i = 0; i < size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(countOccurence(arr, size, value));

	}

}
