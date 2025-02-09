package strings;

public class ValidAnagram {
    /* Leetcode Problem 242
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.


     */
    public static boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()) return false;
        int[] alphabet = new int[26];
        for (char ch: s.toCharArray()){
            alphabet[ch-'a']++;
        }
        for (char ch: t.toCharArray()){
            alphabet[ch-'a']--;
        }
        for (int i: alphabet){
            if (i!=0) return false;
        }
        return true;
    }
}
