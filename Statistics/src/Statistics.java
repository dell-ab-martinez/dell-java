import java.util.*;

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a list of numbers.");
		String submittedNumbers = reader.nextLine();
		reader.close();
		
		String[] stringArray = submittedNumbers.split(",");
		
		System.out.println(stringArray);
		
		// Print minimum value
		System.out.println("Minimum is " + returnMin(stringArray));
		
		// Print maximum value
		System.out.println("Maximum is  "  + returnMax(stringArray));
		
		// Print number of values
		System.out.println("You entered " + stringArray.length + " numbers.");
		
		// Print the average of the values
		System.out.println("Average is " + returnAverage(stringArray));
		
		// Print the sum of the values
		System.out.println("Sum is " + returnSum(stringArray));
	}
	
	// Return minimum value
	public static int returnMin(String[] array) {
		int minimum = 0;
		
		for(int i = 0; i < array.length; i++) {
			int currentNum = Integer.parseInt(array[i]);
			if (i == 0 || currentNum < minimum) {
				minimum = currentNum;
			}
		}
		
		return minimum;
	}
	
	// Return maximum value
	public static int returnMax(String[] array) {
		int maximum = 0;
		
		for(int i = 0; i < array.length; i++) {
			int currentNum = Integer.parseInt(array[i]);
			if (i == 0 || currentNum > maximum) {
				maximum = currentNum;
			}
		}
		
		return maximum;
	}
	
	// Return average of values
	public static float returnAverage(String[] array) {
		float total = 0;
		
		for(int i = 0; i < array.length; i++) {
			total += Integer.parseInt(array[i]);
		}
		
		return total / array.length;
	}
	
	// Return sum of values
	public static int returnSum(String[] array) {
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			total += Integer.parseInt(array[i]);
		}
		
		return total;
	}

}
