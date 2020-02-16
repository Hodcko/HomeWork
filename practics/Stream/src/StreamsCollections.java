import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamsCollections {
    public static void main(String[] args) {
        NameList nameList = new NameList();
        nameList.add("first");
        Thread thread = new Thread(() -> {
            System.out.println(nameList.remove());
        });
        thread.start();
        Thread thread1 = new Thread(() -> {
            System.out.println(nameList.remove());
        });
        thread1.start();

    }
    static class NameList{
        private List list = Collections.synchronizedList(new ArrayList<>());

        public void add(String name){
            list.add(name);
        }

        public String remove(){
            if (list.size() > 0){
                return (String) list.remove(0);
            }
            return null;
        }
    }
}



