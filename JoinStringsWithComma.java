import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsWithComma {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Join the list of strings using a comma separator
        String joinedString = strings.stream()
                .collect(Collectors.joining(","));

        // Print the joined string
        System.out.println("Joined String: " + joinedString);
    }
}
