// Write a Java program to find the longest palindromic substring in a given string.
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String s = "babad"; // Example input

        String longestPalindrome = findLongestPalindrome(s);
        System.out.println("Longest palindromic substring: " + longestPalindrome);
    }

    private static String findLongestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longestPalindrome = "";

        // Iterate through all possible substrings
        for (int start = 0; start < s.length(); start++) {
            for (int end = start; end < s.length(); end++) {
                String substring = s.substring(start, end + 1);
                if (isPalindrome(substring) && substring.length() > longestPalindrome.length()) {
                    longestPalindrome = substring;
                }
            }
        }

        return longestPalindrome;
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
