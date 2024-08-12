import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a Java program that uses the Stream API to filter a list of strings that start with the letter "A" and collect them into a list.
public class StringStrtingWithA {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry"); // Example list

        // Filter strings that start with 'A' and collect them into a list
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Strings that start with 'A': " + filteredStrings);
    }
}
