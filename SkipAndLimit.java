
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a Java program that uses the Stream API to skip the first 5 elements of a list and then collect the next 5 elements.
public class SkipAndLimit {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15); // Example list

        // Skip the first 5 elements and collect the next 5 elements
        List<Integer> result = numbers.stream()
                .skip(5)        // Skip the first 5 elements
                .limit(5)       // Limit to the next 5 elements
                .collect(Collectors.toList());

        System.out.println("Next 5 elements after skipping the first 5: " + result);
    }
}
