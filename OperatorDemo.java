import java.util.*;
import java.math.*;

public class OperatorDemo {

    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	double meal=sc.nextDouble();
    	double tipPer=20;
    	double taxPer=8;
    	
    	double tip=meal*(tipPer/100);
    	double tax=meal*(taxPer/100);
    	double totalCost=meal+tip+tax;
    	
    	System.out.println(totalCost);
    }
}