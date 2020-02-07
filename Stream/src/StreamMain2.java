import java.util.Random;
import java.util.stream.Stream;

public class StreamMain2 {
    public static void main(String[] args) {
        long count = Stream
                .generate(()-> new Random().nextInt(255))// предназначен для того чтобы источником данных был
                // не массива или коллекция, а то, что сгенерируется в методе
                .limit(100)//ограничивает количество сгенерированных значений
                .filter(intValue -> intValue != 0)//фильтрует не нули
                .map(intValue -> (char) intValue.intValue())//кастит к чару
                .peek(System.out::print)//выводит на консоль
                .count();
        System.out.println(count);

    }
}
