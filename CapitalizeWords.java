
// Write a Java program to capitalize the first letter of each word in a given string.
public class CapitalizeWords {

    public static void main(String[] args) {
        String str = "hello world from java"; // Original string
        String result = capitalizeWords(str);
        System.out.println("Capitalized string: " + result);
    }

    private static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                result.append(c);
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
