///////Сортировка слиянием////////////////////////////////

import javax.crypto.spec.PSource;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Arrays;
public class SortArray2 {
    public static void main(String[] args) {
        int temp;
        int[] numbers = new int[10];
        Random rand = new Random(10);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
        mergeSort(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }
        public static void mergeSort(int[] numbers, int left, int right){
        int delimiter = left + ((right - left) / 2) + 1;  //разделитель для разделения входного массива пополам
        if (delimiter > 0 && right > (left + 1)){
            mergeSort(numbers, left, delimiter - 1);//рекурсивная функция для левой половины
            mergeSort(numbers, delimiter, right);         //рекурсивная функция для правой половины
        }
        int[] buffer = new int [right - left + 1];        //создание временного массива для отсортированного участка
        int cursor = left;                                //курсор для прохождения временного массива
        for (int i = 0; i < buffer.length; i++){
            if (delimiter > right || numbers[cursor] > numbers[delimiter]) {
                buffer[i] = numbers[cursor];    //сортируем массив пока курсор не выйдет за границы сортируемого участка
                cursor ++;                      //или не заполнится весь массив
            } else {
                buffer[i] = numbers[delimiter];
                delimiter ++;
            }
        }
        System.arraycopy(buffer, 0, numbers, left, buffer.length);
        }




}
