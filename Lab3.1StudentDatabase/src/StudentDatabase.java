import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//Calling methods and creating objects
		String[] studentN = studentName();
		String[] studentC = studentCity();
		int[] studentG = studentGrade();
		
		//Global variables
		String studentInfo = "";
		String yesNo = "";
		int studentPick;
		
		System.out.println("Welcome to our Java class.");
		System.out.println("\n");
		
		//Providing user with student information
		System.out.println("**** Student Database****\r\n"
				+ "1.  Jackie Brown \r\n"
				+ "2.  James Smith\r\n"
				+ "3.  Paul Dunbar \r\n"
				+ "4.  Chuck Berry \r\n"
				+ "5.  Amy Poehler");
		
		System.out.println("\n");
		
		
		
		
		//Prompt to select a specific student and returns the specified student
		//Allowing users to choose the student information they would like to know
		try {
			
			do {
				//Getting user's input about student data
				System.out.println("Which student would you like to learn more about? (Enter a number 1-5):");
			    studentPick = scan.nextInt();
			
			    scan.nextLine();
			    System.out.println("\n");
			
		    //System.out.println("Please chose a number between 0-4");
			//Display user's choice and accepting user's input
			do{
				if(studentPick >= 0 || studentPick <= 4) {
				
				System.out.println("Student " + studentPick +  " is " + studentN[studentPick - 1] + 
			    ".  What would you like to know about " + studentN[studentPick - 1] + "?" + "  "
				+ "\"City\" or \"Grade\"?" );
				
				studentInfo = scan.nextLine();
				System.out.println("\n");
			}
			
			//User's choices
			if(studentInfo.equals("city") ) {
					
					System.out.println(studentN[studentPick - 1] + " is from " + studentC[studentPick - 1] 
					+ " Would you like to know more? (enter yes or no):");
					yesNo = scan.nextLine();
					
					System.out.println("\n");	
					
				}else if(studentInfo.equalsIgnoreCase("grade")) {
					
					System.out.println(studentN[studentPick - 1] + " is in grade " + studentG[studentPick - 1] 
					+ "!. Would you like to know more? (enter ?yes? or ?no):" );
					yesNo = scan.nextLine();	
					
					System.out.println("\n");
				}
			
			
		 //Loop for user's choice and input
		 }while(yesNo.equalsIgnoreCase("yes"));	
			
			if(yesNo.equalsIgnoreCase("no") ) {
				
				System.out.println("Thanks!");
				
		   }
			
			
		  // Validation of input for checking that student choice is an int.
		  // Validation of input for city or grade prompt.
		  // Validation of input for user input between 1-5.	
		}while(yesNo.equalsIgnoreCase("yes"));
		
			
		}catch(InputMismatchException e) {
			System.out.println("Error: That is not a number. Please pick numbers from 1-5.");
			
		}catch(IndexOutOfBoundsException e) {
			
			System.out.println("Error: The number is too high or too low. Please pick numbers from 1-5.");
			
		}finally { cityGrade();	}
		
		
		scan.close();
			
	}
		
	
	//Method for Checking against city and grade. 
	public static void cityGrade() {
		Object yesNo = "";
		
		if(!((String) yesNo).equalsIgnoreCase("City") || !((String) yesNo).equalsIgnoreCase("grade")) {
			
			System.out.println("Error: That is not an option. Please choose city or grade.");
			}
	}	
	
	
	
	/*List or arrays containing 5 students*/
	
	//Student names array method
	public static String[] studentName() {
		
		String [] students = {"Jackie Brown", "James Smith", "Paul Dunbar", "Chuck Berry", "Amy Poehler"};
		return students;
	}
	
	
	//Student cites array method
	public static String[] studentCity() {
		
		String [] studentCity = {"Detroit", "Southfield", "Dearborn", "Tayler", "Lavonia"};
		return studentCity;
	}
	
	
	//Student grades array method
	public static int[] studentGrade() {
		int [] studentGrade = {2, 3, 4, 5, 6 };
		return studentGrade;
	}
}
	
	
