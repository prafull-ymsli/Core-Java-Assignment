import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Write a Java program that uses the Stream API to generate a stream of 10 random integers.
public class GenerateRandomInteger {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> randomIntegers = IntStream.generate(() -> random.nextInt(100))
                .limit(10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Random Integers: " + randomIntegers);
    }
}
