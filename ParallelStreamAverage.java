import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Write a Java program that uses a parallel stream to process a large list of integers and find their average.
public class ParallelStreamAverage {

    public static void main(String[] args) {
        // Generate a large list of integers
        List<Integer> numbers = IntStream.rangeClosed(1, 1_000_000) // Example: numbers from 1 to 1,000,000
                .boxed()
                .collect(Collectors.toList());

        // Find the average using parallel stream
        double average = numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .average()
                .orElseThrow(() -> new RuntimeException("List is empty"));

        System.out.println("Average: " + average);
    }
}
