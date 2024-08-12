import java.util.Scanner;

// Write a Java program to check whether a year is a leap year or not.
public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    // Method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // Check if the year is divisible by 100
            if (year % 100 == 0) {
                // Check if the year is divisible by 400
                return year % 400 == 0;
            } else {
                return true; // Divisible by 4 but not by 100
            }
        } else {
            return false; // Not divisible by 4
        }
    }
}
