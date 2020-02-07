import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Tom", 20));
        persons.add(new Person("John", 25));
        persons.add(new Person("Brad", 23));
        persons.add(new Person("Alex", 26));

        List<Person> personFiltered = persons.stream()
                .filter(Person -> Person != null)// filtered no null
                .filter(Person ->{
            return Person.getName().equals("Tom") ||
                    Person.getName().equals("Alex");
        })
        .collect(Collectors.toList()); //terminal command


        for (Person person : personFiltered) {
            System.out.println(person);

        }
    }
}
