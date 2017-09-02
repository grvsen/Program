import java.util.Scanner;

public class PrintMinAndMaxSubString 
{

	public static void main(String []args)
	{ 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        String s = in.nextLine();
        String min = "",max = "";
        int k = in.nextInt();
        for(int i=0;i<s.length()-k+1;i++)
        {
            String w = "";
            for(int j=i;j<i+k;j++)
            	w+=s.charAt(j);
            if(i==0){
            	min=w;
            	max=w;
            }
            else{
                if(w.compareTo(min)<0)
                	min=w;
                if(w.compareTo(max)>0)
                	max=w;
            }

        }
        System.out.println(min);
        System.out.println(max);
  }
}
