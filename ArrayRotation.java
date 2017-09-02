import java.util.Scanner;

public class ArrayRotation 
{
	void rotationCount(int arr[],int count,int size)
	{
		for(int i=1;i<count;i++)
		{
			rotate(arr, size);
		}
	}

	void rotate(int arr[],int size)
	{
		int temp;
		temp=arr[0];
		for (int i = 0; i < size-1; i++)
		{
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			
		}
		
	}
	
	void PrintArray(int arr[],int size)
	{
		for (int i : arr)
		{
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args)
	{
		ArrayRotation ar=new ArrayRotation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide size :");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Provide value of count");
		int count=sc.nextInt();
		
		ar.rotationCount(arr, count, size);
		ar.rotate(arr, size);
		ar.PrintArray(arr, size);
		sc.close();

	}

}
