import java.util.HashSet;
import java.util.Set;

// Longest Substring Without Repeating Characters: Write a Java program to find the length of the longest substring without repeating characters.
public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        String str = "abcabcbb"; // Example input
        int length = lengthOfLongestSubstring(str);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }

    private static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Set<Character> charSet = new HashSet<>();
        int left = 0; // Left pointer of the sliding window
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the set, move the left pointer to the right
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            charSet.add(currentChar);

            // Calculate the length of the current window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
