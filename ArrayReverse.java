/*import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int len=sc.nextInt();
		int[] arr=new int[len];
		System.out.println("Enter elements in array");
		for (int i = 0; i < len; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("elements of array are:");
		for (int i : arr) 
		{
			System.out.println(i);
		}
		
		int start=0;
		int end=len-1;
		
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		System.out.println("Reverse array is:");
		for (int i : arr) 
		{
			System.out.println(i);
			
		}

	}

}
*/


import java.util.Scanner;
class ArrayReverse 
{
    static void rev(int arr[],int start,int end)
    {
        int temp;
        if(start>=end)
        
            return;
        
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        
        rev(arr,start+1,end-1);
        
    }
    
    static void printArray(int arr[],int size)
    {
        int i;
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    
    public static void main(String args[] ) throws Exception
    {
       /* int arr[]={5,4,12,7,15,9};
        printArray(arr,6);
        rev(arr,0,5);
        System.out.println("Reverse Array is");
        printArray(arr,5);*/
        
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
        	arr[i]=sc.nextInt();
        }
        int start=0;
        int end=size-1;
        printArray(arr,size);
        rev(arr,start,end);
        System.out.println("Reverse array is :");
        printArray(arr,size);
    }
}


