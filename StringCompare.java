import java.util.Scanner;


public class StringCompare {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        /* Enter your code here. Print output to STDOUT. */
        int len=A.length();
        int len1=B.length();
        int total=len+len1;
        System.out.println(total);
        
        /*int compare=A.compareTo(B);
        if(compare<0)
        {
        	System.out.println("No");
        }
        else if(compare==0)
        {
        	System.out.println("Equal");
        }
        else
        {
        	System.out.println("Yes");
        }*/
        //or
        System.out.println( (A.compareTo(B) > 0) ? "Yes" : "No");
        
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase() +B.substring(1));
        
    }
}
	
