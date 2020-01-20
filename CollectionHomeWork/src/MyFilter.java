
import java.util.Collection;
import java.util.Iterator;

public class MyFilter {
    public void myFilter(Collection collection){
        Iterator iterator = collection.iterator();
        int countOfElements = 0;
        while(iterator.hasNext()){
            iterator.next();
            countOfElements += 1;
            if (countOfElements > 2){
                iterator.remove();
            }
        }
    }
}
