package src;
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
        int[] choise = SortArrays.choisesSort(numbers);
        System.out.println(Arrays.toString(choise)+" массив отсортирован методом сортировки выбором");
        //Функция сортировки пузырьком
        int[] bubble = SortArrays.bubbleSort(numbers);
        System.out.println(Arrays.toString(bubble)+" массив отсортирован методом сортировки пузырьком");
        //Функция сортировки методом шейкера
        int[] sheik = SortArrays.sheikSort(numbers);
        System.out.println(Arrays.toString(sheik)+" массив отсортирован методом сортировки шейкером");
        //Функция сортировки вставками
        int [] insert = SortArrays.insertionSort(numbers);
        System.out.println(Arrays.toString(insert)+" массив отсортирован методом сортировки вставками");
        //Функция сортировки слиянием c возвратом отсортированного массива
        int[] merge = SortArrays.mergeSort(numbers, 0, numbers.length);
        System.out.println(Arrays.toString(merge)+" массив отсортирован методом сортировки слиянием");
        //Функция быстрой сортировки с возвратом отсортированного массива
        int[] quick = SortArrays.quickSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(quick)+" массив отсортирован методом быстрой сортировки");




    }


}

























































