import java.util.Scanner;

class Solution 
{
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Solution(String firstName, String lastName, int idNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}
	
	// Print person data
	public void printPerson()
	{
		 System.out.println("Name: " + firstName + " " + lastName  + "\nID: " + idNumber); 
	}
	 
}

class Student extends Solution
{
	private int[] testScores;
	
    	Student(String firstName,String lastname,int idNumber,int[] testScores)
        {
           super(firstName,lastname,idNumber);
            this.testScores=testScores;
            
        }

    	public char calculate()
        {
            int n = testScores.length;
            int sum = 0;
            double a = 0.0; 
            char grade = '\0';
            for (int i = 0; i<n; i++)
            {
                sum = sum + testScores[i];
            }
            a = sum / n;
            if (a >= 90 && a <= 100)
                grade = 'O';
            if (a >= 80 && a < 90)
                grade = 'E';
            if (a >= 70 && a < 80)
                grade = 'A';
            if (a >= 55 && a <70)
                grade = 'P';
            if (a >= 40 && a < 55)
                grade = 'D';
            if (a < 40)
                grade = 'T';
            return grade;
        }    
}

class Person {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}