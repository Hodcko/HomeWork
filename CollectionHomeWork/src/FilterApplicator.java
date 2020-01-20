import java.util.*;

public class FilterApplicator <T>{

    public static Collection filter(Collection collection, MyFilter filter) {
      filter.myFilter(collection);
      return collection;
    }

    public static  <T extends Comparable> Collection sort(Collection<T> collection){
       Collection<T> set = new TreeSet<T>(collection);
        return set;
    }
}
