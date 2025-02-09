package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidAnagramTest {

    @Test
    public void testValidAnagram(){
        String s = "anagram";
        String t = "nagaram";
        boolean expected = true;
        assertEquals(expected, ValidAnagram.isAnagram(s,t));
    }
}
