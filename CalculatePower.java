import java.util.Scanner;

public class CalculatePower 
{
	public static long power(int n, int p) throws Exception
	{
		        if (n < 0 || p < 0) 
		        {
		            throw new Exception("n or p should not be negative");
		        }
		        else if (p==0) 
		        {
		        	throw new Exception("n and p should not be zero");
		        }
		      
		            return n * power(n, p - 1);
		        
	}
    

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		
		try {
			System.out.println(power(n, p));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
