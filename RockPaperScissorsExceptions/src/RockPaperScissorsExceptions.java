import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let's play rock, paper, scissors!");
		
		// Start game
		Scanner reader = new Scanner(System.in);
		rockPaperScissors(reader);
	}
	
	public static void rockPaperScissors(Scanner reader) {
		// Give the user the rules
		System.out.println("Type rock, paper, or scissors into the console. (Entries are case-sensitive, and no other entries are valid.)");
		
		try {
			// Take the user's input
			String userChoice = reader.nextLine();
		
			// Check the user's input
			if (!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))) {
				throw new IllegalArgumentException("You didn't enter rock, paper, or scissors.");
			}
			
			// Continue the game if user's input is okay
			reader.close();
			String computerChoice = generateChoice();
			
			System.out.println("You chose " + userChoice + ", the computer chose " + computerChoice + ".");
			
			// Tell the user who won
			compareChoices(userChoice, computerChoice);
			
		} catch(IllegalArgumentException e) {
			// Give user error then restart game
			System.out.println(e.toString());
			rockPaperScissors(reader);
		}
	}
	
	// Return random choice
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
	
	// Compare user's choice to computer's
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
