
import sun.tools.jstat.Literal;

import java.util.*;

public class CollectionMap {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Map hashtable = new Hashtable(); //для многопоточных приложений
        Map linkedHashMap = new LinkedHashMap(); //упорядоченная мапа (ordered)
        Map treeMap = new TreeMap();

        Map<String, Integer> map = new HashMap<>();
        map.put("key", 1);
        map.put("key2", 2);
        map.put("key3", 3);
        map.put("key4", 4);
        map.put("key5", 5);
        Integer key = map.get("key");
        System.out.println(key);
        map.remove("key"); //удаление

        Set<String> strings= map.keySet(); //вывод ключей на консоль
        for (String string : strings) {
            System.out.println(string);
        }

        for (Integer k : map.values()) { //вывод значений на консоль
            System.out.println(k);
        }

        System.out.println("-------------------------");

        Person person1 = new Person("Person1",1 );
        Person person2 = new Person("Person2",2);
        Person person3 = new Person("Person3",3);
        Person person4 = new Person("Person4",4);
        Person person5 = new Person("Person5",5);

        hashMap.put("1", person1); // ключ и значение
        hashMap.put("3", person3);
        hashMap.put("2", person2);
        hashMap.put("5", person5);
        hashMap.put("4", person4);



        System.out.println("Выводим hashMap на консоль");
        Set set = hashMap.entrySet();
        for (Object o : set) {
            System.out.println(o);
        }

        linkedHashMap.put("1", person1); // ключ и значение
        linkedHashMap.put("3", person3);
        linkedHashMap.put("2", person2);
        linkedHashMap.put("5", person5);
        linkedHashMap.put("4", person4);

        System.out.println("Выводим linkedMap на консоль");
        Set set1 = linkedHashMap.entrySet();
        for (Object o : set1) {
            System.out.println(o);
        }

        treeMap.put("1", person1); // ключ и значение
        treeMap.put("3", person3);
        treeMap.put("2", person2);
        treeMap.put("4", person5);
        treeMap.put("5", person4);

        System.out.println("Выводим TreeMap на консоль");
        Set set2 = treeMap.entrySet();
        for (Object o : set2) {
            System.out.println(o);
        }

    }
}
