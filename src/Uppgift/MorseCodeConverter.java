package Uppgift;

import java.util.HashMap;

public class MorseCodeConverter {

    private static final HashMap<Character, String>morseMap = new HashMap<>();

    static {
        morseMap.put('A', "*-");
        morseMap.put('B', "-***");
        morseMap.put('C', "-*-*");
        morseMap.put('D', "-**");
        morseMap.put('E', "*");
        morseMap.put('F', "**-*");
        morseMap.put('G', "--*");
        morseMap.put('H', "****");
        morseMap.put('I', "**");
        morseMap.put('J', "*---");
        morseMap.put('K', "-*-");
        morseMap.put('L', "*-**");
        morseMap.put('M', "--");
        morseMap.put('N', "-*");
        morseMap.put('O', "---");
        morseMap.put('P', "*--*");
        morseMap.put('Q', "--*-");
        morseMap.put('R', "*-*");
        morseMap.put('S', "***");
        morseMap.put('T', "-");
        morseMap.put('U', "**-");
        morseMap.put('V', "***-");
        morseMap.put('W', "*--");
        morseMap.put('X', "-**-");
        morseMap.put('Y', "-*--");
        morseMap.put('Z', "--**");
        morseMap.put('1', "*----");
        morseMap.put('2', "**---");
        morseMap.put('3', "***--");
        morseMap.put('4', "****-");
        morseMap.put('5', "*****");
        morseMap.put('6', "-****");
        morseMap.put('7', "--***");
        morseMap.put('8', "---**");
        morseMap.put('9', "----*");
        morseMap.put('0', "-----");
        morseMap.put('.', "*-*-*-");
        morseMap.put(',', "--**--");
        morseMap.put('?', "**--**");
    }

    public static String toMorse(String text) {
        String morse = "";
        text = text.toUpperCase();
        for (int i=0; i<text.length(); i++) {
            char c = text.charAt(i);
            if (morseMap.containsKey(c)) {
                morse += morseMap.get(c) + " ";
            }
        }
        return morse;
    }

    public static String toEnglish(String morse) {
        String english = "";
        String[] letters = morse.split(" ");
        for (String letter : letters) {
           for (HashMap.Entry<Character, String>entry : morseMap.entrySet()) {
               if (entry.getValue().equals(letter)) {
                   english += entry.getKey();
                   break;
               }
           }
        }
        return english;
    }

}
