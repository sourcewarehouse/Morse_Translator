import java.util.*;

public class MorseCodeDict extends HashMap<Character, String>{

   /**
     * A MorseCodeDict maps the English alphabet, integers 0-9,
     * and symbols (Period, Comma, Question Mark, Slash, At-sign)
     * to the corresponding Morse Code. Whitespace is mapped as a new line
     * to denote the beginning of a new word.
     */

    public MorseCodeDict(){
        put('A', ".-");
        put('B', "-...");
        put('C', "-.-.");
        put('D', "-..");
        put('E', ".");
        put('F', "..-.");
        put('G', "--.");
        put('H', "....");
        put('I', "..");
        put('J', ".---");
        put('K', "-.-");
        put('L', ".-..");
        put('M', "--");
        put('N', "-.");
        put('O', "---");
        put('P', ".--.");
        put('Q', "--.-");
        put('R', ".-.");
        put('S', "...");
        put('T', "-");
        put('U', "..-");
        put('V', "...-");
        put('W', ".--");
        put('X', "-..-");
        put('Y', "-.--");
        put('Z', "--..");

        put('1', ".----");
        put('2', "..---");
        put('3', "...--");
        put('4', "....-");
        put('5', ".....");
        put('6', "-....");
        put('7', "--...");
        put('8', "---..");
        put('9', "----.");
        put('0', "-----");

        put('.', ".-.-.-");
        put(',', "--..--");
        put('?', "..--..");
        put('/', "-..-.");
        put('@', ".--.-.");
        put(' ', "\n");
    }

    /**
     * Returns a String representation of this MorseCodeDict.
     */
    public String toString(){
        Iterator iterator = keySet().iterator();
        String result = "";
   
        while (iterator.hasNext()) {  
            Character key = (Character)iterator.next();
            if (key == ' '){
                continue;
            } 
            String value = get(key);  
            result += (key + "  " + value + "\n");
        }
        return result;
    }

}