// Write a Java program to check if one string is a rotation of another (e.g., "waterbottle" is a rotation of "erbottlewat").
public class StringRotation {

    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";

        boolean result = isRotation(str1, str2);
        System.out.println(result);
    }

    private static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length() || str1.isEmpty()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenated = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenated.contains(str2);
    }
}
