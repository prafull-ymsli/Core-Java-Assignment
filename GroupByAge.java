import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


// Write a Java program that uses the Stream API to group a list of Person objects by age.
public class GroupByAge {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = Arrays.asList(
                new Person("Prafull", 30),
                new Person("Harsh", 20),
                new Person("Shivani", 30),
                new Person("Ankur", 40),
                new Person("Aman", 20),
                new Person("Bittu", 40),
                new Person("Kanak", 50)
        );

        // Group by age using the Stream API
        Map<Integer, List<Person>> groupedByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        // Print the grouped result
        groupedByAge.forEach((age, personList) -> {
            System.out.println("Age " + age + ": " + personList);
        });
    }
}
