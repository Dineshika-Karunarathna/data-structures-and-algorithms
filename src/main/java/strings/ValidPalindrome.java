package strings;

import java.util.Locale;

public class ValidPalindrome {
    /* Leetcode Problem 125

    Problem: A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.

    Following are two solutions with different approaches to skip non-alphanumeric characters
     */

    public static boolean isPalindrome(String s){
        // Time Complexity: O(n)
        // Space Complexity: O(n) , as a new string is created in the replaceAll. Hence, we can check for non-alpha numeric characters while traversing through the string.

//        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//        int i=0, j=s.length()-1;
//        while (i<=j){
//            if (s.charAt(i)!=s.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;


        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int i=0, j=s.length()-1;
        while (i<j){
            while (i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while (i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
