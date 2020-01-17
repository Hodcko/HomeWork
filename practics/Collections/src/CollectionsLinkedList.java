import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsLinkedList {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();

        Person person1 = new Person("Black", 1);
        Person person2 = new Person("Fish", 2);
        Person person3 = new Person("White",3);


        list.add(person1);
        list.add(person2);
        list.add(person3);


        System.out.println(list.getFirst());
        System.out.println(list.getLast());


        Iterator<Person> iterator = list.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }









    }
}
