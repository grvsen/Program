import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		int d=2;
		
		System.out.println("Enter elements in arr");
		for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
		
		//System.out.println("Rotate Array");
		for(int j=0;j<d;j++)
		{
			int temp;
			temp=arr[0];
			for(int i=0;i<size-1;i++)
				{
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
		}
		
		System.out.println("Print Array");
		for (int i : arr)
			{
			System.out.println(i);
			}
		

	}

}
