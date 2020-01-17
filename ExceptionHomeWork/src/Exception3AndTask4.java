import java.util.*;
import java.util.Collections;

public class Exception3AndTask4 {
    public static int[] createArray() {

        //Задание 3. Создание массива через консоль с не более чем 3 ошибками под ряд
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int countOfExceptions = 0;
        System.out.println("Введите элементы массива");
        Integer s = null;
        for (int i = 0; i < array.length;) {
            do {
                try {
                    s =  Integer.valueOf(scanner.nextLine());
                    array[i] = s;
                    i++;
                    countOfExceptions = 0;
                } catch (NumberFormatException ex) {
                    System.out.println("Нужно вводить только цифры");
                    countOfExceptions += 1;
                    if(countOfExceptions == 4){
                        System.out.println("Вы превысили допустимое количество попыток ввода");
                        return array;
                    }
                }
            } while (s == null);
        }
        return array;
    }

    //Задание 4. Преобразование массива в коллекцию и сортировка по возврастанию
    public static ArrayList<Integer> arrayToCollection(int [] array) {
        ArrayList<Integer> collection = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            collection.add(array[i]);
        }
        Collections.sort(collection);
        return collection;
    }
}

