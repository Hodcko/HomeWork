import java.lang.reflect.Field;

public class Exception1 {
    public static void main(String[] args) throws MyException {
        //Задание 1
        int firstNumber = 1;
        int secondNumber = 0;
        try {
            int number = firstNumber / secondNumber;
        }catch (ArithmeticException e){
            System.out.println("Обработка try catch: cant divine by zero");
        }

        try {
            int number = firstNumber / secondNumber;
        }catch (ArithmeticException e){
            System.out.println("Обработка try catch finally: cant divine by zero");
        }finally {
            System.out.println("Hello World!");
        }

        try {
            int number = firstNumber / secondNumber;
        }finally {
            if(secondNumber == 0){
                throw new MyException("Обработка try finally: cant divine by zero");
            }
        }
    }
}
