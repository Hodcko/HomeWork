@FunctionalInterface
public interface FunkInter2 {
    int plus(int a, int b);

    default int plus(int a, int b, int c){
        return plus(plus(a, b), c);
    }

}
