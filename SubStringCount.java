// Substring Count: Write a Java program to count the number of occurrences of a given substring in a string.
public class SubStringCount {

    public static void main(String[] args) {
        String str = "ababcabcab"; // Original string
        String substring = "abc"; // Substring to count occurrences

        int count = countOccurrences(str, substring);
        System.out.println("Number of occurrences of \"" + substring + "\": " + count);
    }

    private static int countOccurrences(String str, String substring) {
        if (str == null || substring == null || substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move index to avoid counting overlapping substrings
        }

        return count;
    }
}
