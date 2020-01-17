import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        Person person1 = new Person("Person1",1); //Collescions/Person
        Person person2 = new Person("Person2",2);
        Person person3 = new Person("Person3",3);
        Person person4 = new Person("Person4",4);
        Person person5 = new Person("Person5",5);

        Student student1 = new Student("Studetn1", 1);
        Student student2 = new Student("Studetn2", 2);

        List<Person> persons = new ArrayList<>();

        List<Student> students = new ArrayList<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        students.add(student1);
        students.add(student2);

        Person myPerson = persons.get(0);
        System.out.println(myPerson);

        test(persons);
        test(students);
        
    }
    private static void test(List<? extends Person> list){
        for (Person person : list) {
            System.out.println(person.toString());
        }
    }
}
