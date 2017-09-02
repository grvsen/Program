import java.util.Scanner;

public class PrintSubStringFromString 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println(str.substring(start,end));

	}

}
