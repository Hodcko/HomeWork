package CollectionsClasswork.src;

import java.util.*;

public class CollectionsSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("2");
        set.add("3");
        set.add("1");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("---------------");

        Set<String> words = new HashSet<>();
        words.add("one");
        words.add("two");
        words.add("three");

        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---------------");

        Queue<String> queue = new LinkedList<>();
        System.out.println("Количество элементов " + queue.size());
        queue.add("element 1");
        queue.add("element 2");
        queue.add("element 3");

        System.out.println("Количество после итерации " + queue.size());

        for (String s : queue) {
            System.out.println(s);
        }

        Iterator<String> iterator1 = queue.iterator();
        while(iterator1.hasNext()){
            System.out.println(queue.element());
        }

        Passport passport1 = new Passport();
        passport1.setId("MP....12121");
        passport1.setEffectiveAt(new Date());
        passport1.setFio("Александр Игоревич");

        Map<String, Passport> pas = new HashMap<>();
        pas.put(passport1.getId(), passport1);

        pas.get(passport1.getId()); // бытсрый поиск значений ?



    }
}
