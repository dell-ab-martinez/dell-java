import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.lang.StringBuilder;

public class WordGuessGame {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		List<String> words = new ArrayList<String>();
		
		try {
			// Store words  from file in ArrayList
			in = new BufferedReader(new FileReader("words_alpha.txt"));
			
			String line;
			while((line = in.readLine()) != null) {
				words.add(line);
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
		
		// Get random word
		String word = getRandomWord(words);
		
		// Create game board
		StringBuilder gameBoard = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			gameBoard.append("-");
		}
		
		// Start game
		System.out.println("Let's play a guessing game! Here's a word: \n");
		System.out.println(gameBoard);
		
		Scanner reader = new Scanner(System.in);
		Boolean continueGuessing = true;
		List<String> allGuesses = new ArrayList<String>();
		int correctGuesses = 0;
		
		// Begin guessing
		while (continueGuessing) {
			String userGuess = getUserGuess(reader);
			userGuess = userGuess.toLowerCase();
			
			//  Check if user entered more than one char or non-alpha char
			if (userGuess.length() > 1 || !userGuess.matches("^[a-zA-Z]*$")) {
				System.out.println("Invalid input.");
				System.out.println("\n" + "Your guesses:" + allGuesses);
			} else if (allGuesses.contains(userGuess)) {
				System.out.println("You've already guessed that letter, guess again.");
				System.out.println("\n" + "Your guesses:" + allGuesses);
				continue;
			} else {
				allGuesses.add(userGuess);
				// if word contains letter that user guessed, replace game board with letter at that index
				if (word.contains(userGuess)) {
					for(int i = 0; i < word.length(); i++) {
						if (word.charAt(i) == userGuess.charAt(0)) {
							gameBoard.replace(i, i+1, userGuess);
							correctGuesses++;
						}
					}
					
				} else {
					System.out.println("That letter is not in this word. Try again.");
				}
				
				// Print game board and all guesses
				if (correctGuesses == word.length()) {
					System.out.println("Congrats! You guessed the word!");
					System.out.println("\n" + gameBoard);
					continueGuessing = false;
				} else {
					System.out.println("\n" + gameBoard);
					System.out.println("\n" + "Your guesses:" + allGuesses);
				}
			}
		}
		
		
	}
	
	// Return random word
	public static String getRandomWord(List<String> words) {
		Random randNumGenerator = new Random();
	    int randNum = randNumGenerator.nextInt(words.size()); // Give me a random number between 0 (inclusive) and size of arrayList (exclusive)
	    
	    String randWord = words.get(randNum);
	    
	    return randWord;
	}
	
	
	// Prompt user for guess and return
	public static String getUserGuess(Scanner reader) {
		System.out.println("Guess a letter (lower or uppercase accepted):");
		String userGuess = reader.nextLine();

		return userGuess;
	}

}
