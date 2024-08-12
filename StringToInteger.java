// Write a Java program to convert a string to an integer without using built-in parse methods.
public class StringToInteger {

    public static void main(String[] args) {
        String str = "12345"; // Change this to test with different strings
        try {
            int result = stringToInt(str);
            System.out.println("Converted integer: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    private static int stringToInt(String str) throws NumberFormatException {
        if (str == null || str.isEmpty()) {
            throw new NumberFormatException("Input string is null or empty.");
        }

        int result = 0;
        boolean negative = false;
        int startIndex = 0;

        // Handle optional negative sign
        if (str.charAt(0) == '-') {
            negative = true;
            startIndex = 1;
        } else if (str.charAt(0) == '+') {
            startIndex = 1;
        }

        for (int i = startIndex; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Invalid character found: " + c);
            }
            result = result * 10 + (c - '0');
        }

        return negative ? -result : result;
    }
}
