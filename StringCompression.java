
// Write a Java program to perform basic string compression using the counts of repeated characters
// (e.g., "aabcccccaaa" -> "a2b1c5a3").
public class StringCompression {
    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String compressed = compressString(input);
        System.out.println("Original String: " + input);
        System.out.println("Compressed String: " + compressed);
    }

    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            // If current character is the same as previous, increase count
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // Append character and count to the compressed string
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1; // Reset count for the new character
            }
        }

        // Append the last character and its count
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        // Return the original string if compression does not make the string smaller
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
