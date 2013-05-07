import java.util.*;
import Trees.*;

/**
 * MorseTranslator translates between English and Morse Code.
 * Depending on user input, it translates to the other language.
 */
public class MorseTranslator{

	private final MorseCodeTree morseCode;

	public MorseTranslator(Boolean numeric){
		morseCode = new MorseCodeTree(numeric);
	}

	public String toMorse(String text){
		String result = "";
		return result;
	}

	public String toEnglish(String morse){
		String result = "";
		return result;
	}

	/**
	 * Returns the MorseCodeTree used for reference
	 * in this MorseTranslator
	 */
	public MorseCodeTree getReference(){
		return morseCode;
	}

	public static void main(String[] args){
		MorseTranslator test;
		String result = "";

		Scanner sc = new Scanner(System.in);
		System.out.print("Does your message contain numbers?: ");
		String numeric = sc.nextLine().toUpperCase();
		if (numeric.equals("Y") || numeric.equals("YES")){
			test = new MorseTranslator(true);
		} else{
			test = new MorseTranslator(false);
		}
		System.out.println("Reference tree:\n"+test.getReference().toString());

		System.out.print("Input your message: ");
		String input = sc.nextLine();
		if (input.charAt(0) != '.' && input.charAt(0)!= '-'){
			System.out.println("Please enter morse code");
		} else{
			System.out.println("To be implemented");
			//pass each morse code letter parsed by whitespace into find
			//result += find(morse code letter)
			//make morsecodetreenodes that store letter and morse representations
			//implement find in morsecodetree that takes string param
			//if string has letters, return morse code val in node, vice versa
		}
	}
}