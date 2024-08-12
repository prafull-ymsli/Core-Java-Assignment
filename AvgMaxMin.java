import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

// Write a Java program that uses the Stream API to find the average, maximum, and minimum values of a list of integers.
public class AvgMaxMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 1);

        // Finding the average
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(Double.NaN);

        // double avg = numbers.stream().mapToInt((x)->(int)x).average().orElse(0);

        // Finding the maximum
        OptionalInt max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max();

        // Finding the minimum
        OptionalInt min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min();

        System.out.println("Average: " + average);
        System.out.println("Maximum: " + (max.isPresent() ? max.getAsInt() : "No maximum value"));
        System.out.println("Minimum: " + (min.isPresent() ? min.getAsInt() : "No minimum value"));
    }
}
