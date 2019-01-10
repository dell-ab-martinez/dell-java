import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let's play rock, paper, scissors!");
		System.out.println("Type rock, paper, or scissors into the console.");
		Scanner reader = new Scanner(System.in);
		String userChoice = reader.nextLine();
		reader.close();
		String computerChoice = generateChoice();
		
		System.out.println("You chose " + userChoice + ", the computer chose " + computerChoice + ".");
		compareChoices(userChoice, computerChoice);
	}
	
	public static String generateChoice() {
		Random randNumGenerator = new Random();
		int randNum = randNumGenerator.nextInt(3);
		
		if (randNum == 0) {
			return "rock";
		} else if (randNum == 1) {
			return "paper";
		} else {
			return "scissors";
		}
	}
	
	public static void compareChoices(String user, String computer) {
		if (user.equals("rock") && computer.equals("paper")) {
			System.out.println("Paper covers rock, you lose!");
		} else if (user.equals("rock") && computer.equals("scissors")) {
			System.out.println("Rock crushes scissors, you win!");
		} else if (user.equals("rock") && computer.equals("rock")) {
			System.out.println("Tie!");
		} else if (user.equals("scissors") && computer.equals("rock")) {
			System.out.println("Rock crushes scissors, you lose!");
		} else if (user.equals("scissors") && computer.equals("paper")) {
			System.out.println("Scissors cut paper, you win!");
		} else if (user.equals("scissors") && computer.equals("scissors")) {
			System.out.println("Tie!");
		} else if (user.equals("paper") && computer.equals("rock")) {
			System.out.println("Paper covers rock, you win!");
		} else if (user.equals("paper") && computer.equals("scissors")) {
			System.out.println("Scissors cut paper, you lose!");
		} else {
			System.out.println("Tie!");
		}
	}

}
