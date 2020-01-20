
import java.util.*;

public class CollectionTask2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println("Размер листа до удаления: " + list.size());

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println("Размер листа после удаления: " + list.size());
    }
}
