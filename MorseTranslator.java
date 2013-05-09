import java.util.*;
import Trees.*;

/**
 * MorseTranslator translates between English and Morse Code.
 * Depending on user input, it translates to the other language.
 * @author Crystal Chen
 * @version May 2013
 */
public class MorseTranslator{

    public final MorseCodeTree refTree = new MorseCodeTree();
    public final MorseCodeDict refDict = new MorseCodeDict();

    /**
     * Default constructor
     */
    public MorseTranslator(){

    }

    /**
     * Translates the given text into its Morse Code equivalent.
     *
     * @param text      the English text to be translated
     * @return          a String of the Morse Code of the original text
     */
    public String toMorse(String text){
        String result = "";

        for (int i=0; i<text.length(); i++){
            String code = refDict.get(text.charAt(i));
            if (code == null){
                throw new IllegalArgumentException("Cannot find: "+text.charAt(i));
            }
            result += code + " ";
        }
        return result;
    }

    /**
     * Translates the given Morse Code message into English.
     *
     * @param morse     the Morse Code message to be decoded
     * @return          a String of the decoded message in English
     */
    public String toEnglish(String morse){
        String[] message = morse.split(" ");
        String result = "";

        for (String str: message){
            result += refTree.find(str).getItem();
        }
        return result;
    }


    public static void main(String[] args){
        MorseTranslator test = new MorseTranslator();
        Scanner sc = new Scanner(System.in);
        Boolean tree, dict = false;
        String input;

        System.out.println("\n[[MorseTranslator]] English to Morse Code | Morse Code to English\n");

        while (true){
            System.out.print("Input your message (return to end): ");
            input = sc.nextLine().toUpperCase();

            if (input.length() == 0){
                break;
            }

            try{
                if (input.charAt(0) != '.' && input.charAt(0)!= '-'){ //Message is in English
                    System.out.println(test.toMorse(input));
                } else{
                    System.out.println(test.toEnglish(input));
                }
            } catch (IllegalArgumentException e){
                System.out.println(e);
            }
        }

        System.out.print("Print encoding/decoding reference? ");
        String response = sc.nextLine().toUpperCase();
        if (response.equals("Y") || response.equals("YES")){
            System.out.println(test.refDict);
        }
    }
}

