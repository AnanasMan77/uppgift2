package Uppgift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMorseCode {

    @Test
    public void testToMorseCode() {
       String input = "All";
       String expected = "*- *-** *-**";
       String actual = MorseCodeConverter.toMorse(input);
       assertEquals(expected,actual);
    }

    @Test
    public void testToEnglish() {
        String input = "*- *-** *-**";
        String expected = "All";
        String actual = MorseCodeConverter.toEnglish(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testToMorseCodeNoInput() {
        String input = "";
        String expected = "No input";
        String actual = MorseCodeConverter.toMorse(input);
        assertEquals(expected, actual);
    }

}
