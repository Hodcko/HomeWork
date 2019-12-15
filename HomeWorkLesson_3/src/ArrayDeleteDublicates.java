import com.sun.tools.javac.util.ArrayUtils;

import java.util.Scanner;
import java.util.Arrays;


public class ArrayDeleteDublicates {
    public static void main(String[] args){

        // объявляем и инициализируем массив
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Введи элемент массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(array)+" первоначальный вид массива");

        // сортируем пузырьковой сортировкой
        int temp;
        boolean toMove = true;
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
        System.out.println(Arrays.toString(array)+" массив после сортировки");

        //находим количество дубликатов в массиве для определения длины нового массива
        int j = 0;
        for (int i = 1; i < array.length; i ++){
            if(array[i-1] == array[i]){
                j++;
            }
        }

        //инициализируем новый массив необходимой длины
        int[] arraySorted = new int[array.length-j];
        int index = 0;

        //удаляем дубликаты
        for (int i = 1; i < array.length; i ++){
            if(array[i] == array[i-1]){
                arraySorted[index] = array[i];
            }
            if(array[i] != array[i-1]){
                index ++;
                arraySorted[index] = array[i];
            }
        }
        System.out.println(Arrays.toString(arraySorted)+" новый массив без дубликатов.");
    }
}
