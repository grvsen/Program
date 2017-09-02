
public class BinarytoDecimal 
{
	
	public int getBtoD(int binary)
	{
		int decimal=0;
		int power=0;
		
		while(true)
		{
			if(binary==0)
			{
				break;
			}
			else
			{
				int temp=binary%10;
				decimal +=temp * Math.pow(2, power);
				binary=binary/10;
				power++;
			}
		}
		
		return decimal;
		
	}

	public static void main(String[] args) 
	{
		BinarytoDecimal bd=new BinarytoDecimal();
		System.out.println(bd.getBtoD(1011));
		System.out.println(bd.getBtoD(01010101));
		

	}

}
