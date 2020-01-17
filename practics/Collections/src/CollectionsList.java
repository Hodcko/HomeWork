import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsList {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        Person person1 = new Person("Black", 1);
        Person person2 = new Person("Fish", 2);

        list.add(person1);
        list.add(person2);

        Person person1FromCollection = list.get(0);
        Person person2FromCollection = list.get(1);

        System.out.println(person1FromCollection);
        System.out.println(person2FromCollection);

        boolean remove = list.remove(person1);

        System.out.println(remove);

        Person person3FromCollection = list.get(0);
        System.out.println(person3FromCollection);

        List<Person> list2 = new ArrayList<>();

        list2.add(person1);
        list2.add(person2);

        list.addAll(list2);
        System.out.println(list.size());

        System.out.println("Вывод коллекции в консоль");
        for(Person person: list){
            System.out.println(person);
        }

        System.out.println("Вывод коллекции в консоль с помощью итератора");
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            Person iterPerson = iterator.next();
            System.out.println(iterPerson);
        }






    }

}
