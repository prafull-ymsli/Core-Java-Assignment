import java.util.Scanner;

// Write a Java program to print the Fibonacci series up to a given number.
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit for the Fibonacci series: ");
        int upperLimit = scanner.nextInt();

        printFibonacciSeries(upperLimit);

        scanner.close();
    }

    // Method to print the Fibonacci series up to a given number
    private static void printFibonacciSeries(int limit) {
        if (limit < 0) {
            System.out.println("Upper limit must be a non-negative integer.");
            return;
        }

        int a = 0, b = 1;

        if (limit >= 0) {
            System.out.print("Fibonacci Series: " + a);
        }
        while (b <= limit) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

