
// Write a Java program that uses the Stream API to generate an infinite stream of integers
// starting from 1 and find the first 10 prime numbers.
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstTenPrimeNumber {
    public static void main(String[] args) {
        List<Integer> firstTenPrimes = IntStream.iterate(2, i -> i + 1)
                .filter(FirstTenPrimeNumber::isPrime)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("First 10 prime numbers: " + firstTenPrimes);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> number % n == 0);
    }
}
