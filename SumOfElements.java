import java.util.Arrays;
import java.util.List;

// Write a Java program that uses the Stream API to find the sum of all elements in a list of integers.
public class SumOfElements {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // Example list

        // Find the sum of all elements using Stream API
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of all elements: " + sum);
    }
}
