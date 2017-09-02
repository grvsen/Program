import java.util.Scanner;

abstract class Book
{
	String title;
	String author;
	
	Book(String title, String author) 
	{
		this.title = title;
		this.author = author;
	}
	
	abstract void display();
	
}

class MyBook extends Book
{
	int price;

	MyBook(String title, String author,int price)
	{
		super(title, author);
		this.price=price;
	}
	
	public void display()
	{
		System.out.println("Book title :"+title+"\nAuthor :"+author+"\nPrice :"+price);
	}
	
}

public class AbstractExample
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		String author=sc.nextLine();
		int price=sc.nextInt();
		sc.close();
		
		Book b=new MyBook(title,author,price);
		b.display();

	}

}
