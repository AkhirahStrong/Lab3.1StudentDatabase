import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] studentN = studentName();
		String[] studentC = studentCity();
		int[] studentG = studentGrade();
		
		//System.out.println(studentN[1]);
		//System.out.println(studentC[1]);
		//System.out.println(studentG[1]);
		
		System.out.println("Which student would you like to learn more about? (enter a number 1-10):");
		int studentPick = scan.nextInt();
		
		//do {
				 
				 if(studentPick == 1) {
					 System.out.println(studentN[0]);
				 }else if(studentPick == 2) {
					 System.out.println(studentN[1]);
				 }else if(studentPick == 3) {
					 System.out.println(studentN[2]);
				 }
			 //}
				
			//}while();
			
		}
		
		
		
	
	

	public static String[] studentName() {
		
		String [] students = {"Jackie", "James", "Paul", "Chuck", "Amy", 
				"Shakirah", "DeAndre", "Darius", "Nia", "Amy"};
		return students;
	}
	
	public static String[] studentCity() {
		
		String [] studentCity = {"Detroit", "Southfield", "Dearborn", "Tayler", "Lavonia", 
				"Birmingham", "Westland", "Ferdale", "Royal Oak", "Oak Park"};
		return studentCity;
	}
	
	public static int[] studentGrade() {
		int [] studentGrade = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		return studentGrade;
	}
}
