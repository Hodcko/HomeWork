/////////////////Быстрая сортировка///////////////
import java.util.Arrays;
import java.util.Random;

public class SortArray3 {
    public static void main(String[] args) {
        int temp;
        int[] numbers = new int[10];
        Random rand = new Random(10);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
        quick(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }

    public static void quick(int[] numbers, int left, int right) {
        int leftMarker = left;
        int rightMarker = right;
        int middle = numbers[(leftMarker + rightMarker) / 2];
        do {
            while (numbers[leftMarker] < middle) {   //двигаем левый маркер пока он меньше опорного элемента
                leftMarker++;
            }
            while (numbers[rightMarker] > middle) {  //двигаем правый маркер пока он больше опорного элемента
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {    //проверка на необходимость обмена элементов
                if (leftMarker < rightMarker) { //если левый маркер меньше правого, меняем элементы местами
                    int temp = numbers[leftMarker];
                    numbers[leftMarker] = numbers[rightMarker];
                    numbers[rightMarker] = temp;
                }
                leftMarker++;            //сдвиг маркеров для изменения границ
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < right){         //вызов рекурсии для сортировки от левого маркера до конца сортируемого участка
            quick(numbers, leftMarker, right);
        }
        if (left < rightMarker){       //вызов рекурсии для сортировки от начала сортируемого участка до правого маркера
            quick(numbers, left, rightMarker);
        }
    }
}
