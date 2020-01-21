import sun.tools.jstat.Literal;

import java.util.*;

public class CollectionTask3_1And3_2 {
    public static void main(String[] args) {

        List<SortAndFilterTestClass> list = new ArrayList<>();
        list.add(new SortAndFilterTestClass(12));
        list.add(new SortAndFilterTestClass(9));
        list.add(new SortAndFilterTestClass(3));
        list.add(new SortAndFilterTestClass(2));
        list.add(new SortAndFilterTestClass(16));

        System.out.println("Вывод коллекции на консоль");
        for (SortAndFilterTestClass sortAndFilterTestClass : list) {
            System.out.println(sortAndFilterTestClass);
        }

        System.out.println("Вывод коллекции на консоль после сортировки");
        Collection myList = FilterApplicator.sort(list);
        for (Object o : myList) {
            System.out.println(o);
        }

        List myList1 = new ArrayList();
        myList1.add("Привет");
        myList1.add("мне");
        myList1.add(30);
        myList1.add("лет");
        System.out.println("Вывод коллекции на консоль");

        for (Object o : myList1) {
            System.out.println(o);
        }
        System.out.println("Вывод коллекции на консоль после фильтрации");

        FilterApplicator.filter(myList1, new MyFilter());
        for (Object o : myList1) {
            System.out.println(o);
        }
    }
}
