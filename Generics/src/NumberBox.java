public class NumberBox<T extends Number> extends Box<T> {

    public long incrementAndGet(){
        T item = getItem();
        return item.longValue() + 1;
    }

    public static <Z extends Number> void print(NumberBox<Z> box){
        System.out.println(box.getItem());
    }

    public static void printInt(NumberBox<? extends Integer> box){
        System.out.println(box.getItem());
    }

    public static void printDouble(NumberBox<? super Double> box){
        System.out.println(box.getItem());
    }

}
