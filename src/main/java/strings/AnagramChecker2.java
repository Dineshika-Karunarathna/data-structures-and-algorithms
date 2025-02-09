package strings;

public class AnagramChecker2 {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] charCount = new int[26]; // Array to store character frequencies

        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++; // Increase count for str1
        }

        for (char c : str2.toCharArray()) {
            charCount[c - 'a']--; // Decrease count for str2
        }

        for (int count : charCount) {
            if (count != 0) return false; // If any count is nonzero, not an anagram
        }

        return true;
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        System.out.println("Are they anagrams? " + areAnagrams(word1, word2));
    }
}
