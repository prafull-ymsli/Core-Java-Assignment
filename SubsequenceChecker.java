// Write a Java program to check if one string is a subsequence of another.
public class SubsequenceChecker {

    public static void main(String[] args) {
        String target = "abcde";
        String subsequence = "ace";

        boolean result = isSubsequence(target, subsequence);
        System.out.println(result);
    }

    private static boolean isSubsequence(String target, String subsequence) {
        if (subsequence == null || subsequence.isEmpty()) {
            return true; // An empty subsequence is always a subsequence
        }
        if (target == null) {
            return false; // Non-empty subsequence cannot be a subsequence of a null string
        }

        int targetIndex = 0;
        int subseqIndex = 0;

        while (targetIndex < target.length() && subseqIndex < subsequence.length()) {
            if (target.charAt(targetIndex) == subsequence.charAt(subseqIndex)) {
                subseqIndex++;
            }
            targetIndex++;
        }

        return subseqIndex == subsequence.length();
    }
}
