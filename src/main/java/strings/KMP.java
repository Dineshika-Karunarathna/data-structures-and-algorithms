package strings;

public class KMP {
    // Function to compute the LPS (Longest Prefix Suffix) array
    private static int[] computeLPS(String pattern){
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while(i<m){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len!= 0){
                    len = lps[len -1];// Reduce prefix length
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // KMP Pattern Searching Algorithm
    public static void KMPSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] lps = computeLPS(pattern); //Precompute LPS array

        int i = 0, j = 0; //i -> text index, j-> pattern index
        while (i < n){
            if (text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }

            if (j == m){
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1]; // Move to previous LPS position
            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1]; // Use LPS to skip redundant checks
                } else {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        String text = "ababcabcababc";
        String pattern = "abc";
        KMPSearch(text, pattern);
    }
}
