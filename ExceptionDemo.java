import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
				
		try
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(x/y);
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e.getClass());
		}
		catch (InputMismatchException e) 
		{
			System.out.println(e.getClass().getName());
		}
		

	}

}
