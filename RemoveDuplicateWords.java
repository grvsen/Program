import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicateWords 
{

	    public static void main(String[] args)
	    {

	        String regex = "(\\b\\w+\\b)(\\s+\\1\\b)+";
	        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

	        Scanner sc = new Scanner(System.in);
	        int num = Integer.parseInt(sc.nextLine());
	        
	        while (num-- > 0) {
	            String str = sc.nextLine();
	            
	            Matcher m = p.matcher(str);
	            
	            // Check for subsequences of input that match the compiled pattern
	            while (m.find()) {
	                str = str.replaceAll(m.group(), m.group(1));
	            }
	            
	            // Prints the modified sentence.
	            System.out.println(str);
	        }
	        
	        sc.close();
	    }
	}
