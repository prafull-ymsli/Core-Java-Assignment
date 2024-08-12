
// Write a Java program that uses the Stream API to partition a list of integers into odd and even numbers.
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterEvenAndOdd {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Partition the list into odd and even numbers
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        // Print the partitioned result
        System.out.println("Even Numbers: " + partitionedNumbers.get(true));
        System.out.println("Odd Numbers: " + partitionedNumbers.get(false));
    }
}
