
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ExceptionMainAndTask5 {
    public static void main (String[] args) throws MyException, MyException2, FileNotFoundException {
        // задание 2.1 и 2.2
        Exception2_1 exception = new Exception2_1();
        Exception2_2 exception2 = new Exception2_2();
        int result = exception.squaring(101);
        int result2 = exception2.squaring(100);

        //создание массива через консоль. Задание 3
        int[] myArray = Exception3AndTask4.createArray();
        System.out.println(Arrays.toString(myArray));

        //преобразование массива в коллекцию и сортировка во возрастанию. Задание 4
        ArrayList<Integer> collection = Exception3AndTask4.arrayToCollection(myArray);
        for(int i = 0; i < collection.size(); i++) {
            System.out.print(collection.get(i));
        }

        //Задание 5
        String path = "/Users/hodcko/Desktop/test";
        int result3 = 0;
        try {
            result3 = division(path, 12);
        }catch (FileNotFoundException e){
            System.out.println("Неверный путь к файлу");
        }catch (ArithmeticException e){
            System.out.println("Нельзя делить на ноль");
        }
        System.out.println(result3);


        int result4 = 0;
        try {
            result4 = division(path, 1);
        }catch (FileNotFoundException | ArithmeticException e){
            System.out.println("Неверный путь к файлу или ноль передан в функцию");
            e.printStackTrace(); // добавил для того чтобы определить какая именно ошибка возникла
        }
        System.out.println(result4);
    }

    public static int division(String path, int firstNumber) throws FileNotFoundException {
        File file = new File(path);
        int result;
        int secondNumber;
        Scanner scanner = new Scanner(file);
        secondNumber = scanner.nextInt();
        result = secondNumber / firstNumber;
        return result;
    }
}
