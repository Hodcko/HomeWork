import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Personss> persons = new ArrayList<>();
        persons.add(new Personss("Tom", 20));
        persons.add(new Personss("John", 25));
        persons.add(new Personss("Brad", 23));
        persons.add(new Personss("Alex", 26));

        List<Personss> personFiltered = persons.stream()
                .filter(Personss -> Personss != null)// filtered no null
                .filter(Personss ->{
            return Personss.getName().equals("Tom") ||
                    Personss.getName().equals("Alex");
                })
        .collect(Collectors.toList()); //terminal command


        for (Personss person : personFiltered) {
            System.out.println(person);

        }
    }
}
