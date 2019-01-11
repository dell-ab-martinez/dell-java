import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter an English word.");
		Scanner reader = new Scanner(System.in);
		String word = reader.nextLine();
		reader.close();
		System.out.println("Let me translate that for you...");
		
		if (beginsWithVowel(word)) {
			System.out.println(word + "yay");
		} else if (containsVowel(word)) {
			System.out.println(moveConsonants(word) + "ay");
		} else {
			System.out.println(word + "ay");
		}
	}
	
	public static boolean beginsWithVowel(String word) {
		if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean containsVowel(String word) {
		if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String moveConsonants(String word) {
		int firstVowelIndex = 0;
		for(int i=0; i<word.length(); i++) {
			char character = word.charAt(i);
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
				firstVowelIndex = i;
				break;
			}
		}

		return word.substring(firstVowelIndex) + word.substring(0, firstVowelIndex);
	}
}
