import java.util.HashSet;
import java.util.Set;

// First Non-Repeating Character: Write a Java program to find the first non-repeating character in a string.
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "swiss"; // Change this to test with different strings
        char result = findFirstNonRepeatingCharacter(str);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    private static char findFirstNonRepeatingCharacter(String str) {
        Set<Character> seen = new HashSet<>();
        Set<Character> repeating = new HashSet<>();

        // First pass: Identify repeating characters
        for (char c : str.toCharArray()) {
            if (seen.contains(c)) {
                repeating.add(c);
            } else {
                seen.add(c);
            }
        }

        // Second pass: Find the first non-repeating character
        for (char c : str.toCharArray()) {
            if (!repeating.contains(c)) {
                return c;
            }
        }

        return '\0'; // No non-repeating character found
    }
}
