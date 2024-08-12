import java.util.HashSet;
import java.util.Set;

// Write a Java program to print all permutations of a given string.
public class Permutations {

    public static void main(String[] args) {
        String str = "ABCA"; // Change this to test with different strings
        Set<String> permutations = new HashSet<>();
        generatePermutations(str, "", permutations);
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    private static void generatePermutations(String str, String perm, Set<String> permutations) {
        if (str.isEmpty()) {
            permutations.add(perm);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String newStr = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(newStr, perm + str.charAt(i), permutations);
            }
        }
    }
}
