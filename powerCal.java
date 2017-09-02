
import java.util.Scanner;


class power
{
    void pow(int a,int n)
    {
        int d=1;
        for (int i =1 ; i < n; i++)
        {
            d=a*d;
        }
        System.out.println(d);
    }
}   
    
    
    public class powerCal 
    {
    	public static void main(String[] args)
    	{
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter number");
    		int a=sc.nextInt();
    		System.out.println("Enter power");
    		int b=sc.nextInt();
        
    		power c=new power();
    		c.pow(a,b);     
    	}
    }
