import java.util.Scanner;

public class SelectionSortDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i = 0 ; i < size-1 ; i++)
		{
			int index=i;
			
			for (int j = i+1 ; j < size; j++) 
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}
			}
			
			int snum=arr[index];
			arr[index]=arr[i];
			arr[i]=snum;
		}
		
		System.out.println("Sorted Array is :");
		for (int i : arr) 
		{
			System.out.println(i);
			
		}

	}

}
