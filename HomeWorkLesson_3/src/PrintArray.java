import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элемент массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Вывели через for");


        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("Вывели через for каждый воторой элемент массива");
        System.out.println("");


        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println("Вывели через while");


        i = 0;
        while (i < array.length) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        }
        System.out.println("Вывели через while каждый воторой элемент");
        System.out.println("");


        i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
        System.out.println("Вывели через do while");


        i = 0;
        do {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        } while (i < array.length);
        System.out.println("Вывелии через do while каждый второй элемент");
        System.out.println("");


        for (int f : array) {
            System.out.print(f + " ");
        }
        System.out.println("Вывели через foreach");


        i = 0;
        for (int f : array) {
                if (i % 2 != 0){
                System.out.print(f + " ");
            }
                i ++;
        }
        System.out.println("Вывели через foreach каждый второй элемент");
    }
}
