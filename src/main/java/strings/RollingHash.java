package strings;

import java.nio.charset.StandardCharsets;
import java.util.IllegalFormatCodePointException;

public class RollingHash {
    static final int BASE = 256; //Base for ASCII characters
    static final int PRIME = 101; // Prime number for modulus to avoid overflow

    // Compute the hash value of a string using the rolling hash formula
    private static int computeHash(String str, int m) {
        int hash = 0;
        for (int i = 0; i < m; i++) {
            hash = (BASE * hash + str.charAt(i)) % PRIME;
        }
        return hash;
    }

    // Update the rolling hash when shifting the window
    private static int rollingHash(String text, int oldIndex, int newIndex, int oldHash, int m) {
        int newhash = (BASE * (oldHash - text.charAt(oldIndex) * (int) Math.pow(BASE, m - 1)) + text.charAt(newIndex)) % PRIME;
        if (newhash < 0) newhash += PRIME; //Ensure non-negative hash
        return newhash;
    }

    // Rabin-Karp Algorithm using Rolling Hash for substring search
    public static void search(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();

        int patternHash = computeHash(pattern, m);
        int textHash = computeHash(text, m);

        for (int i = 0; i <= n - m; i++) {
            // Check if hash values match, then verify characters
            if (patternHash == textHash && text.substring(i, i+m).equals(pattern)){
                System.out.println("Pattern found at index " + i);
            }
            // Slide the window: remove old char, add new char
            if (i < n-m){
                textHash = rollingHash(text,i,i+m,textHash,m);
            }
        }
    }

    public static void main(String[] args) {
        String text = "xabcyabc";
        String pattern = "abc";
        search(text, pattern);
    }
}
