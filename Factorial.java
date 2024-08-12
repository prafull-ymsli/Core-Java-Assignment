import java.math.BigInteger;

// Write a Java program to find the factorial of a given number.
public class Factorial {

    public static void main(String[] args) {
        int number = 20;

        // Iterative method using BigInteger
        BigInteger iterativeResult = factorialIterative(number);
        System.out.println("Factorial of " + number + " (iterative): " + iterativeResult);
    }

    private static BigInteger factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
