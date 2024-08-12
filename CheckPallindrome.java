
import java.util.stream.IntStream;

// Check Palindrome: Write a program to check if a given string is a palindrome.
public class CheckPallindrome {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = checkPalindromeUsingStreams(input);
        System.out.println(isPalindrome?"Is Palindrome":"Not a Palindrome");
    }

    public static boolean checkPalindromeUsingStreams(String str) {
        return IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
    }
}
