import java.lang.reflect.Field;

public class Exception1 {
    public static void main(String[] args) {
        //Задание 1
        try {
            int number = 1 / 0;
        }catch (ArithmeticException e){
            System.out.println("Обработка try catch: cant divine by zero");
        }

        try {
            int number = 1 / 0;
        }catch (ArithmeticException e){
            System.out.println("Обработка try catch finally: cant divine by zero");
        }finally {
            System.out.println("Обработка try catch finally: cant divine by zero");
        }

        try {
            int number = 1 / 0;
        }finally {
            System.out.println("Обработка try finally: cant divine by zero");
        }
    }
}
