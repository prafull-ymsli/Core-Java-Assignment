import java.util.HashMap;
import java.util.Map;

// Character Frequency: Write a Java program to count the frequency of each character in a string.
public class CharacterFrequency {

    public static void main(String[] args) {
        String str = "hello world"; // Original string

        Map<Character, Integer> frequencyMap = countCharacterFrequency(str);
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static Map<Character, Integer> countCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        if (str == null || str.isEmpty()) {
            return frequencyMap;
        }

        for (char c : str.toCharArray()) {
            if (c != ' ') { // Optionally, exclude spaces from the count
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        return frequencyMap;
    }
}
