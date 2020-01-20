import java.util.*;

public class FilterApplicator <T>{

    public static <T> List<T> filter(List<T> list, Comparator<? super T> c) {
        list.sort(c);
        return list;
    }



    public static  <T> Collection <? extends Comparable<?>> sort(Collection<? extends Comparable<?>> collection){
       
        return collection;

    }




}
