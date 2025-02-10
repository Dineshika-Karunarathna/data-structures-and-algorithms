package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPalindromeTest {
    @Test
    public void testValidPalindrome(){
        String s ="A man, a plan, a canal: Panama" ;
        boolean expected = true;

        assertEquals(expected,ValidPalindrome.isPalindrome(s));
    }
}
