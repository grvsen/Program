import java.util.Scanner;

public class BubbleSortDemo {

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
		
		System.out.println("Print Array");
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array is :");
		for (int i : arr) 
		{
			System.out.println(i);
			
		}
		

	}

}



/*public class BubbleSortDemo 
{
	public static void main(String[] args) 
	{
		int noOfSwap=0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int a_i=0; a_i < n; a_i++)
		{
			a[a_i] = in.nextInt();
		}
    
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					a[j]=a[j] + a[j+1];
					a[j+1]=a[j] - a[j+1];
					a[j]=a[j] - a[j+1];
					noOfSwap++;
				}
			} 
		}
    System.out.println("Array is sorted in "+ noOfSwap +" swaps.");
    System.out.println("First Element: "+a[0]);
    System.out.println("Last Element: "+a[n-1]);
}
}
*/



