import java.util.Scanner;

// String Comparison: Write a program to compare two strings, ignoring case differences.
public class CompareString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Compare the two strings ignoring case differences
        if (firstString.equalsIgnoreCase(secondString)) {
            System.out.println("The strings are equal (case insensitive).");
        } else {
            System.out.println("The strings are not equal (case insensitive).");
        }

        scanner.close();
    }
}
