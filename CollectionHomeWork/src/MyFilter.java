
import java.util.Collection;
import java.util.Iterator;

public class MyFilter {
    public void myFilter(Collection collection){
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            Object object = iterator.next();
            if(object instanceof Integer){
                iterator.remove();
            }
        }
    }
}
