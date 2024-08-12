import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a Java program that uses the Stream API to sort a list of strings alphabetically.
public class SortStringsWithStream {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date"); // Example list

        // Sort the list alphabetically using Stream API
        List<String> sortedStrings = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted list: " + sortedStrings);
    }
}
