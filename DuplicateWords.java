import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Write a Java program to find duplicate words in a string.
public class DuplicateWords {

    public static void main(String[] args) {
        String str = "this is a test and this test is just a test"; // Original string
        Set<String> duplicates = findDuplicateWords(str);
        System.out.println("Duplicate words: " + duplicates);
    }

    private static Set<String> findDuplicateWords(String str) {
        if (str == null || str.isEmpty()) {
            return new HashSet<>();
        }

        // Split the string into words
        String[] words = str.split(" ");

        // Use a map to count occurrences of each word
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase(); // Handle case insensitivity
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Find words with more than one occurrence
        Set<String> duplicates = new HashSet<>();
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }
}
