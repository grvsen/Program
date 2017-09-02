import java.util.Scanner;

abstract class Customer
{
	 String name;
	 String address;
	 int number;
	
	/*public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number) 
	{
		this.number = number;
	}*/
	
	

	public Customer(String name, String address, int number) 
	{
		super();
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public abstract String toString();
	
}

class Salary extends Customer
{
	private double sal;
	
	public Salary(String name,String address,int number,double sal)
	{
		super(name,address,number);
		this.sal=sal;
	}
	
	public String toString()
	{
		return "Employee [name=" + name + ", address=" + address + ", number=" + number + ",sal=" + sal +"]";
	}
	
}


public class AbstractDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String address=sc.nextLine();
		int num=sc.nextInt();
		double sal=sc.nextDouble();
		
		Customer e=new Salary(name, address, num, sal);
		System.out.println(e.toString());
		
		
	}

}
