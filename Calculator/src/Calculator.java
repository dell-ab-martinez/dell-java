import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi! Please type a number in the console.");
		Scanner reader = new Scanner(System.in);
		int firstInt = reader.nextInt();
		System.out.println("You entered " + firstInt + ". Please type another number in the console.");
		int secondInt = reader.nextInt();
		reader.close();
		System.out.println("You entered " + secondInt + ". Let's do some math...");
		
		System.out.println(firstInt + " + " + secondInt + " = " + addition(firstInt, secondInt));
		System.out.println(firstInt + " - " + secondInt + " = " + subtraction(firstInt, secondInt));
		System.out.println(firstInt + " * " + secondInt + " = " + multiplication(firstInt, secondInt));
		System.out.println(firstInt + " / " + secondInt + " = " + division(firstInt, secondInt));
	}
	
	public static int addition(int firstInt, int secondInt) {
		int result = firstInt + secondInt;
		return result;
	}
	
	public static int subtraction(int firstInt, int secondInt) {
		int result = firstInt - secondInt;
		return result;
	}
	
	public static int multiplication(int firstInt, int secondInt) {
		int result = firstInt * secondInt;
		return result;
	}
	
	public static int division(int firstInt, int secondInt) {
		int result = firstInt / secondInt;
		return result;
	}

}
