import java.util.Scanner;

public class StringNumSum 
{

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 String s=sc.nextLine();
		 int c=0;
		 for(int i=0;i<s.length();i++)
		 {
		    char ch=s.charAt(i);         // Getting each char from String
		    int x=(int)ch;               
		    for(int y=48;y<=57;y++)      // Loop for checking the ASCII
		    {       
		       if(x==y)
		       {
		    	   int num=Integer.parseInt(""+ch); //Getting the int value
		    	   c=c+num;
		       }
		    }
		 }
		 System.out.println("Total Sum:"+c); // Final sum 

		   }

	}

