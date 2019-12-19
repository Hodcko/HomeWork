

import java.util.Random;
public class Task2_4 {
    public static void main(String[] args) {
        Random randNumber = new Random();

        //Нахождение дружественных чисел

        int endOfRange = randNumber.nextInt(10000)+1;
        System.out.printf("Поиск дружественных чисел в диапазоне от 1 до %d \n", endOfRange);
        int summDev;
        int summDevOfDev;
        for (int i = 1; i <= endOfRange; i++){
            summDev = devidersSumm(i);
            summDevOfDev = devidersSumm(summDev);
            if ((i == summDevOfDev) && (summDevOfDev!=summDev)){
                System.out.printf("%4d и %4d являются дружественными числами\n", i,summDev);
            }
        }
    }
    public static int devidersSumm(int x) {
        int summOfDeviders = 0;
        for (int i = 1; i <= x; i++) {
            if ((x % i == 0) && (i != x)) {
                summOfDeviders += i;
            }
        }
        return summOfDeviders;
    }
}
