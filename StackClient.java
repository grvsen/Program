import java.util.Scanner;

public class StackClient {

	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int size=sc.nextInt();*/
		
		Stacker stack=new Stacker(5);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		//stack.push(4);
		
		System.out.println("1. Size of stack after puch operation: "+stack.size());
		System.out.println("2. Pop element from stack: ");
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
		
		System.out.println("3. Size of satck after pop operation: "+stack.size());
		

	}

}
