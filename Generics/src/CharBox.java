public class CharBox<T extends CharSequence> extends Box<T> {

    public int length(){
        T item = getItem();
        return item.length();
    }
}
