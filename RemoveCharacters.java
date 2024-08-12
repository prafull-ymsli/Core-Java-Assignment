
// Write a Java program to remove specific characters from a string.
public class RemoveCharacters {

    public static void main(String[] args) {
        String str = "hello world"; // Original string
        char charToRemove = 'o'; // Characters to remove

        String result = removeCharacters(str, charToRemove);
        System.out.println("Resulting string: " + result);
    }

    private static String removeCharacters(String str, char charToRemove) {
        if (str == null) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c!=charToRemove) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
