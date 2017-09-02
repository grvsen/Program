import java.util.Scanner;

public class CamelcaseConvertor 
{
	static String CamelCase(String str)
	{
		StringBuffer sb = new StringBuffer();
	    for (String s : str.split("_"))
	    {
	        sb.append(Character.toUpperCase(s.charAt(0)));
	        if (s.length() > 1) 
	        {
	            sb.append(s.substring(1, s.length()).toLowerCase());
	        }
	    }
	    return sb.toString();
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    String str = sc.nextLine();
	    String s=CamelCase(str);
	    System.out.println(s);
	    
	    
	}

}
