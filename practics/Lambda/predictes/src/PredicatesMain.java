

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PredicatesMain {
    public static void main(String[] args) {
        List<PredicatesPerson> persons = new ArrayList<>();
        persons.add(new PredicatesPerson("John", 20));
        persons.add(new PredicatesPerson("Patric", 25));
        persons.add(new PredicatesPerson("Black", 19));
        persons.add(new PredicatesPerson("Tom", 34));
        persons.add(new PredicatesPerson("Kate", 22));

        System.out.println(persons.stream().filter(p -> p.getAge() > 18).mapToInt(p -> p.getAge()).average().getAsDouble());

        List <String> sortedPersons = persons.stream()
                .filter((p)-> p.getAge()>20)
                .sorted(Comparator.comparing(PredicatesPerson::getAge))
                .map (p -> p.getName())
                .collect(Collectors.toCollection(ArrayList::new));

        sortedPersons.stream().forEach(System.out::println);
    }


}
