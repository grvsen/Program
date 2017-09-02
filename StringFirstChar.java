import java.io.IOException;
import java.util.Scanner;

public class StringFirstChar 
{
	
	
	/*public static String first(String str)
	{
		if(str!=null)
		{
			System.out.println(str.charAt(0));
		}
		return str;
		
	}*/
	
	public static String firstNFirst(String input1)
    {
		String first="";
		
		
		first=String.valueOf(input1.charAt(0));
		
		return first;
	    	
	    
    }
	
	public static void main(String[] args) throws IOException
	{
        Scanner in = new Scanner(System.in);
        String output;
        String ip1 = in.nextLine().trim();
        output = firstNFirst(ip1);
        System.out.println(String.valueOf(output));
    }
	
	

	/*public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);
		
		if(str!=null)
		{
			System.out.println(str.charAt(0));
		}
		else 
		{
			System.out.println("Enter a String");
		}

	}*/

}
