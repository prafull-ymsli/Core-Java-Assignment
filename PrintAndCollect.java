import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a Java program that uses the Stream API to print each element of a list of strings before collecting them into a new list.
public class PrintAndCollect {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"); // Example list

        List<String> collectedList = strings.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("Collected list: " + collectedList);
    }
}
