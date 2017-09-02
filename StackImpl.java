import java.util.NoSuchElementException;
import java.util.Scanner;

class Stack
{
	int arr[];
	int top,size,len;
	
	
	public Stack(int n)
	{
		size=n;
		top=-1;
		len=0;
		arr=new int[size];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top==size-1;
	}
	
	public int getSize()
	{
		return len;
	}
	
	public int peek()
	{
		if(isEmpty())
			throw new  NoSuchElementException("Underflow Condition");
		return arr[top];
		
	}
	
	public void push(int i)
	{
		if(top + 1 >= size)
			throw new IndexOutOfBoundsException("Overflow Condition");
		
		if(top + 1 < size)
			arr[++top]=i;
		len++;
	}
	
	public int pop()
	{
		if(isEmpty())
			throw new NoSuchElementException("Underflow Condition");
		
		len--;
		return arr[top--];
	}
	
	public void display()
	{
		if(len==0)
		{
			System.out.println("Stack Empty");
		}
		
		for (int i = top; i >= 0 ; i--) 
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
	}
}

public class StackImpl 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Stack s=new Stack(n);
		
		char ch;
		do
		{
			System.out.println("\nStack Operations");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. CheckEmpty");
			System.out.println("5. CheckFull");
			System.out.println("6. Size");
			
			int choice=sc.nextInt();
			switch (choice) 
			{
			case 1 :
				System.out.println("Enter element to push");
				try
				{
					s.push(sc.nextInt());
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
				break;
				
			case 2 :
				//System.out.println("Enter element to push");
				try
				{
					System.out.println("Popped element is :"+s.pop());
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
				break;
				
			case 3 :
				//System.out.println("Enter element to push");
				try
				{
					System.out.println("Peeked element is :"+s.peek());
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
				break;
				
			case 4 :
				//System.out.println("Enter element to push");
				System.out.println("Empty status :"+s.isEmpty());
				break;
				
			case 5 :
				//System.out.println("Enter element to push");
				System.out.println("Full status :"+s.isFull());
				break;
				
			case 6 :
				//System.out.println("Enter element to push");
				System.out.println("Size :"+s.getSize());
				break;

			default:
				System.out.println("Wrong Entry");
				break;
			}
			
			s.display();
			System.out.println("Do you want to continue(Type y or n) \n");
			ch=sc.next().charAt(0);
			
		}while(ch=='Y' || ch=='y');
		

	}

}
