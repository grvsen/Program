import java.util.EmptyStackException;

public class Stacker
{
	private int arr[];
	private int size;
	private int index=0;
	
	public Stacker(int size)
	{
		this.size=size;
		arr=new int[size];
	}
	
	public boolean isFull()
	{
		if(index==size)
		{
			return true; 
		}
		return false;
	}
	
	
	public boolean isEmpty()
	{
		if(index==0)
		{
			return true;
		}
		return false;
	}
	
	public int size()
	{
		return index;
	}
	
	public void push(int item)
	{
		if(isFull())
		{
			throw new StackOverflowError("Stack is full");
		}
		arr[index]=item;
		index++;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		return arr[--index];
	}

}
