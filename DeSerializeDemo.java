import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	String name;
	String address;
	transient int SSN;
	int number;
		 
	
	public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getSSN() {
			return SSN;
		}

		public void setSSN(int sSN) {
			SSN = sSN;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	public String toString()
	{
		 return name+" "+address+" "+SSN+" "+number;
	}
	
}


/*public class SerializationDemo
{
	public static void main(String [] args) throws IOException
	{
		Employee e=new Employee();
		e.setName("Gaurav");
		e.setAddress("Pune");
		e.setSSN(101);
		e.setNumber(11);
		
		
		FileOutputStream fout=new FileOutputStream("Ser.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(e);
		out.close();
		fout.close();
		System.out.println("Data is saved in Ser.txt");
	}

}*/

public class DeSerializeDemo
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Employee e=null;
		
		FileInputStream fin=new FileInputStream("Ser.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		e=(Employee)in.readObject();
		in.close();
		fin.close();
		System.out.println(e.toString());
	}
}