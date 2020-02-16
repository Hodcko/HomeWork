

import java.util.function.*;

public class FunctionalInterfaceses {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x < 5; // передаем дженерик, на выходе буль
        System.out.println(predicate.test(5));

        Consumer<Integer> consumer = System.out::println;// принимает дженерик, на выходе void
        consumer.accept(5);

        Function<String, String> function = x -> x.toUpperCase();// принимает дженерик, на выходе дженерик
        String str = function.apply("hello");
        System.out.println(str);

        Supplier<String> supplier = () -> new String("Java");//
        System.out.println(supplier.get());

        UnaryOperator<Integer> unaryOperator = x -> x*x;//принимает на вход один параметр, возвражает этот же параметр
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<String>  binaryOperator = (x,y) -> x+y;// принимает на вход два параметра дженерик типа
        System.out.println(binaryOperator.apply("Hello ", "World"));

        myFuncInter<Integer> funcInter = System.out::println;
        funcInter.apply(555);


    }
    interface myFuncInter <T>{
        void apply(T t);
    }
}
