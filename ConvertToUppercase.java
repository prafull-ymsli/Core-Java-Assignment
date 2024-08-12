import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a Java program that uses the Stream API to convert a list of strings to uppercase.
public class ConvertToUppercase {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date"); // Example list

        // Convert each string to uppercase using Stream API
        List<String> uppercasedStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("List with strings in uppercase: " + uppercasedStrings);
    }
}
