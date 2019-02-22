import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class GradeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ask for total number of students
		System.out.println("Please enter the total number of students.");
		Scanner reader = new Scanner(System.in);
		int numStudents = Integer.parseInt(reader.nextLine());
		
		// Generate gradeBook
		HashMap<String, String> gradeBook = new HashMap<String, String>();
		
		for(int i = 0; i < numStudents; i++) {
			System.out.println("Enter a student's name: ");
			String name = reader.nextLine();

			System.out.println("Enter the student's grades: ");
			String grades = reader.nextLine();
			
			gradeBook.put(name, grades);
		}
		
		reader.close();
		
		// Create gradeAverages map
		HashMap<String, Double> gradeAverages = new HashMap<String, Double>();
		
		// Store all names in an array
		ArrayList<String> names = new ArrayList<String>(gradeBook.keySet());
		
		// Fill gradeAverage map
		for(int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			double gradeAverage = returnGradeAverage(gradeBook.get(name));

			gradeAverages.put(name, gradeAverage);
		}
		
		System.out.println("Grade averages are: " + gradeAverages);
	}
	
	// Return grade average
	public static double returnGradeAverage(String grades) {
		double total =  0;
		String[] gradeArray = grades.split(",");
		for(int i = 0; i < gradeArray.length; i++) {
			total += Integer.parseInt(gradeArray[i]);
		}
		
		return total / gradeArray.length;
	}

}
