import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a Java program that uses the Stream API to filter a list of Person objects
// (having fields name and age) to find all people older than 25.
public class FilterPersons {

    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 22),
                new Person("Charlie", 28),
                new Person("Diana", 24)
        );

        // Filter people older than 25 using Stream API
        List<Person> olderThan25 = people.stream()
                .filter(person -> person.getAge() > 25)
                .collect(Collectors.toList());

        // Print the result
        System.out.println("People older than 25:");
        olderThan25.forEach(person -> System.out.println(person.getName() + " (" + person.getAge() + ")"));
    }
}