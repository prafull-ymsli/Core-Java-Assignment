import java.util.LinkedHashSet;
import java.util.Set;

// Remove Duplicates: Write a Java program to remove duplicate characters from a string.
public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "programming"; // Original string
        String result = removeDuplicates(str);
        System.out.println("String after removing duplicates: " + result);
    }

    private static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        Set<Character> charSet = new LinkedHashSet<>();

        // Add each character to the set
        for (char c : str.toCharArray()) {
            charSet.add(c);
        }

        // Build the resulting string
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        return result.toString();
    }
}
