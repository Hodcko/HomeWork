import sun.tools.jstat.Literal;

import java.util.*;

public class CollectionTask3_1And3_2 {
    public static void main(String[] args) {

        List<SortAndFilterTestClass> list = new ArrayList<>();
        SortAndFilterTestClass example1 = new SortAndFilterTestClass(12);
        SortAndFilterTestClass example2 = new SortAndFilterTestClass(9);
        SortAndFilterTestClass example3 = new SortAndFilterTestClass(3);
        SortAndFilterTestClass example4 = new SortAndFilterTestClass(2);
        SortAndFilterTestClass example5 = new SortAndFilterTestClass(16);
        list.add(example1);
        list.add(example2);
        list.add(example3);
        list.add(example4);
        list.add(example5);

        System.out.println("Вывод коллекции на консоль");
        for (SortAndFilterTestClass sortAndFilterTestClass : list) {
            System.out.println(sortAndFilterTestClass);
        }

        System.out.println("Вывод коллекции на консоль после сортировки");
        Collection myList = FilterApplicator.sort(list);
        for (Object o : myList) {
            System.out.println(o);
        }

        System.out.println("Вывод коллекции на консоль после фильтрации");
        FilterApplicator.filter(list, new MyFilter());
        for (SortAndFilterTestClass sortAndFilterTestClass : list) {
            System.out.println(sortAndFilterTestClass);
        }
    }
}
