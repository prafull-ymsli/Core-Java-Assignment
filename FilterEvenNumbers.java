import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a Java program that uses the Stream API to filter out all even numbers from a list of integers.
public class FilterEvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 10); // Example list

        // Filter out all even numbers using Stream API
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("List with even numbers filtered out: " + oddNumbers);
    }
}
