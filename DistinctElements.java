import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Write a Java program that uses the Stream API to collect all distinct elements from a list of integers into a set.
public class DistinctElements {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 7); // Example list

        // Collect all distinct elements into a Set using Stream API
        Set<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toSet());

        System.out.println("Distinct elements: " + distinctNumbers);
    }
}
