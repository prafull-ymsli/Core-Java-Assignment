import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Write a Java program that uses the Stream API to find all distinct strings in a list, ignoring case sensitivity.
public class DistinctStringsIgnoreCase {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "banana", "APPLE", "Cherry", "Banana", "cherry"); // Example list

        // Find all distinct strings ignoring case sensitivity
        Set<String> distinctStrings = strings.stream()
                .map(String::toLowerCase)  // Convert each string to lowercase
                .collect(Collectors.toSet()); // Collect to a Set


        System.out.println("Distinct strings: " + distinctStrings);
    }
}
