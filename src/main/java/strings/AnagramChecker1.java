package strings;

import java.util.Arrays;

public class AnagramChecker1 {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false; // Anagrams must be the same length

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1); // Sort both strings
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2); // Compare sorted arrays
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        System.out.println("Are they anagrams? " + areAnagrams(word1, word2));
    }
}
