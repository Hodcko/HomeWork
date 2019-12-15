import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Random;
public class SortArray1 {
    public static void main(String[] args) {

        // Сортировка выбором

        int temp;
        int[] numbers = new int[10];
        Random rand = new Random(10);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers)+" новый массив");
        for (int i = 0; i < numbers.length; i++){
            int min = i;                                  //принимаем значение в элементе с индексом i за минимальное
            for (int j = i + 1; j < numbers.length; j++){ //сраниваем с остальными элементами массива
                if (numbers[j] < numbers[min]){           //если находим элемент меньше,
                    min = j;                              //присваиваем его индекс переменной min
                }
            }
            temp = numbers[i];                            //обмен между элементами массива
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }
        System.out.println(Arrays.toString(numbers)+" массив отсортирован выбором");
        System.out.println("");


//        Сортировка пузырьком

        temp = 0;
        int[] numbers2 = new int[10];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers2)+" новый массив");
        boolean toMove = true;
        while (toMove){
            toMove = false;
            for (int i =0; i<numbers2.length - 1; i++){
                if (numbers2[i] > numbers2[i+1]){         //сравниваем предыдущий элемент массива со следующим
                        temp = numbers2[i];               //если предыдущий больше следующего, меняем местами
                        numbers2[i] = numbers2[i+1];
                        numbers2[i+1] = temp;
                        toMove = true;                //для перезапуска цикла. Если обмена нет, цикл не перезапускаются.
                }
            }
        }
        System.out.println(Arrays.toString(numbers2)+" массив отсортирован пузырьком");
        System.out.println("");

//        Шейкер

        temp = 0;
        int[] numbers3 = new int[10];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers3)+" новый массив");
        int left = 1;                               //задается левая граница массива для
        int right = numbers3.length - 1;            //задается правая граница массива
        do {
            for (int i = right; i >= left; i--) {   //проходимся по массиву справа налево
                if (numbers3[i - 1] > numbers3[i]) {//если предыдущий элемент больше последующего - меняем местами
                    temp = numbers3[i];
                    numbers3[i] = numbers3[i - 1];
                    numbers3[i - 1] = temp;
                }
            }                                      //сдвигается левая граница, т.к. в результате работы программы
            left++;                                //самый крайний слева элемент будет минимальными
            for (int i = left; i <= right; i++) {  //проходимя по массиву слева направо
                if (numbers3[i - 1] > numbers3[i]) {//если предыдущий элемент больше последующего - меняем местами
                    temp = numbers3[i];
                    numbers3[i] = numbers3[i - 1];
                    numbers3[i - 1] = temp;
                }
            }                                       //сдвигается правая граница, т.к. в результате работы программы
            right--;                                //самый крайний справа элемент будет максимальны
        }while (left<=right);                       //цикл работает пока границы массива не будут рядом

        System.out.println(Arrays.toString(numbers3)+" массив отсортирован шейкером");
        System.out.println("");

//       Сортировка вставками

        temp = 0;
        int j;
        int[] numbers4 = new int[10];
        for (int i = 0; i < numbers4.length; i++) {
            numbers4[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers4)+" новый массив");

        for (left = 0; left < numbers4.length; left ++){
            temp = numbers4[left];                       // берем значение первого элемента массива
            int i = left -1;
            for (; i >= 0; i--){                         // сравниваем с предыдущим элементом
                if (temp < numbers4[i]){                 // если значение элемента меньше - передвигаем больший элемент дальше
                    numbers4[i + 1] = numbers4[i];
                }else{                                   // если значение элемента больше - сравниваем со следующим
                    break;
                }
            }
            numbers4[i + 1] = temp;                       //в освободишееся место вставлям больший элемент
        }
        System.out.println(Arrays.toString(numbers4)+" массив отсортирован вставками");

    }
}
