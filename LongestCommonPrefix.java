// Write a Java program to find the longest common prefix string amongst an array of strings.
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"}; // Change this to test with different arrays
        String result = longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + result);
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Find the minimum length among all strings
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        // Find the common prefix
        for (int i = 0; i < minLength; i++) {
            char currentChar = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != currentChar) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0].substring(0, minLength);
    }
}
