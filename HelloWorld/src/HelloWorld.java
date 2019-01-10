import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		String string1 = "A.b.";
		System.out.println("Hi, my name is " + string1  + ", what is your name?");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("Hi " + input + ", hope you are doing well.");
	}

}
