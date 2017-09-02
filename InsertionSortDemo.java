import java.util.Scanner;

public class InsertionSortDemo
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
		
		for (int j = 1; j < size; j++)
		{  
            int key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr[i] > key ) )
            {  
                arr[i+1] = arr[i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
		System.out.println("Sorted Array is :");
		for (int i : arr) 
		{
			System.out.println(i);
			
		}


	}
	
}
