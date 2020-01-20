import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class myComporator implements Comparator<Passport> {

    @Override
    public int compare(Passport first, Passport second) {
        return  first.getId().compareTo((second.getId()));
    }

    public static List<Passport> compare1(List<Passport> list) {
        Iterator<Passport> iterator = list.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if(Integer.parseInt(list.get(count).getId()) > 20) {
                iterator.remove();
            }
            count += 1;
        }
        return list;

    }


}
