
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
       // Задание № 1

public class SortMethods {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random(10);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers)+" новый массив");

        //Демонстрация работы функций для всех типов сортировки

        //Функция сортировки выбором
        int[] choise = choiseSort(numbers);
        System.out.println(Arrays.toString(choise)+" массив отсортирован методом сортировки выбором");
        //Функция сортировки пузырьком
        int[] bubble = bubbleSort(numbers);
        System.out.println(Arrays.toString(bubble)+" массив отсортирован методом сортировки пузырьком");
        //Функция сортировки методом шейкера
        int[] sheik = sheikSort(numbers);
        System.out.println(Arrays.toString(sheik)+" массив отсортирован методом сортировки шейкером");
        //Функция сортировки вставками
        int [] insert = insertionSort(numbers);
        System.out.println(Arrays.toString(insert)+" массив отсортирован методом сортировки вставками");
        //Функция сортировки слиянием c возвратом отсортированного массива
        int[] merge = mergeSort(numbers, 0, numbers.length);
        System.out.println(Arrays.toString(merge)+" массив отсортирован методом сортировки слиянием");
        //Функция быстрой сортировки с возвратом отсортированного массива
        int[] quick = quickSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(quick)+" массив отсортирован методом быстрой сортировки");




    }

    //Функция сортировки выбором
    public static int[] choiseSort(int[] array){
        for (int i = 0; i < array.length; i++){
            int temp = 0;
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }




    //Функция сортировки пузырьком
    public static int[] bubbleSort(int[]array){
        boolean toMove = true;
        int temp = 0;
        while (toMove){
            toMove = false;
            for (int i =0; i<array.length - 1; i++){
                if (array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    toMove = true;
                }
            }
        }
        return array;
    }


    //Функция сортировки методом шейкера
    public static int [] sheikSort(int[] array){
        int temp = 0;
        int left = 1;
        int right = array.length - 1;
        do {
            for (int i = right; i >= left; i--) {
                if (array[i - 1] > array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++;
            for (int i = left; i <= right; i++) {
                if (array[i - 1] > array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }while (left<=right);
        return array;
    }




    //Функция сортировки вставками
    public static int[] insertionSort(int [] array){
        int left;
        int temp;
        for (left = 0; left < array.length; left ++){
            temp = array[left];
            int i = left -1;
            for (; i >= 0; i--){
                if (temp < array[i]){
                    array[i + 1] = array[i];
                }else{
                    break;
                }
            }
            array[i + 1] = temp;
        }
        return array;
    }


    //Сортировка слиянием
    public static int[] mergeSort(int[] array, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) >>> 1;
            mergeSort(array, left, mid);
            mergeSort(array, mid, right);

            int length = right - left;
            int[] buffer = new int[length];
            int i = left;
            int j = mid;
            for (int k = 0; k < length; k++) {
                if (j >= right || i < mid && array[i] < array[j]) {
                    buffer[k] = array[i++];
                } else {
                    buffer[k] = array[j++];
                }
            }
            System.arraycopy(buffer, 0, array, left, length);
        }
        return array;

    }


    //Функция быстрой сортировки
    public static int[] quickSort(int[] array, int left, int right) {
        int leftMarker = left;
        int rightMarker = right;
        int middle = array[(leftMarker + rightMarker) / 2];
        do {
            while (array[leftMarker] < middle) {
                leftMarker++;
            }
            while (array[rightMarker] > middle) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int temp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = temp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < right){
            quickSort(array, leftMarker, right);
        }
        if (left < rightMarker){
            quickSort(array, left, rightMarker);
        }
        return array;
    }

}












