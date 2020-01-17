import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSet {
    public static void main(String[] args) {
        Set<Person> hashSet = new HashSet<>();
        Set<Person> linkedSet = new LinkedHashSet<>();
        Set<Person> treeSet = new TreeSet<>(); // для работы с объектами необходимо классом объекта имлиментить
                                               //Comparable и переопределять compareTo

        Person person1 = new Person("Person1",1 );
        Person person2 = new Person("Person2",2);
        Person person3 = new Person("Person3",3);
        Person person4 = new Person("Person4",4);
        Person person5 = new Person("Person5",5);

        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);
        hashSet.add(person4);
        hashSet.add(person5);

        //iter tab - вызов foreach

        System.out.println("Вывод на консоль HashSet");
        for (Person person : hashSet) {
            System.out.println(person);
        }

        linkedSet.add(person1);
        linkedSet.add(person2);
        linkedSet.add(person3);
        linkedSet.add(person4);
        linkedSet.add(person5);

        System.out.println("Вывод на консоль LinkedSet");
        for (Person person : linkedSet) {
            System.out.println(person);
        }

        System.out.println("Вывод на консоль TreeSet");
        treeSet.add(person4);
        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person5);
        treeSet.add(person3);
        for (Person person : treeSet) {
            System.out.println(person);
        }
    }
}
