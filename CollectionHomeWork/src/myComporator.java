import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class myComporator implements Comparator<Passport> {

    @Override
    public int compare(Passport first, Passport second) {
        return first.getId().compareTo((second.getId()));
    }




}
