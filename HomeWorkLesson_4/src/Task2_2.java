import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
public class Task2_2 {
    public static void main(String[] args) {
        Random randNumber = new Random();
        int number = randNumber.nextInt(1000)+100;
        int number2 = randNumber.nextInt(1000)+100;
        //Наибольшая цифра натурального числа
        biggestDigit(number);
        //Является ли число палиндромом
        palindrome(number);
        //Проверка на простое число и нахождение всех простых делителей
        primeNumberAndDelimiters(number);
        //Нахождение НОД
        greatestCommonFactor(number, number2);
        //Нахождение НОК
        leastCommonMultiple(number, number2);
        //Нахождение количества различных цифр у натурального числа
        variousNumbers(number);


    }
    public static void biggestDigit(int number) {
        System.out.println("Поиск наибольшей цифры натурального числа");
        System.out.printf("Сгенерировано число %d \n", number);
        int bigDigit = 0;
        int digit = 0;
        while (number != 0) {
            digit = number % 10;
            if (digit > bigDigit) {
                bigDigit = digit;
            }
            number /= 10;
        }
        System.out.printf("Наибольшая цифра сгенерированного числа %d \n", bigDigit);
        System.out.println("");
    }

    public static void palindrome(int number) {
        System.out.println("Проверка на палиндром");
        System.out.printf("Сгенерировано число %4d \n", number);
        int palNumber = 0;
        for (int i = number, j = i % 10; i > 0; i = i / 10, j = i % 10) {
            palNumber = palNumber * 10 + j;
        }
        if (number == palNumber) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
        System.out.println("");
    }

    public static void primeNumberAndDelimiters(int number) {
        System.out.println("Проверка на простое число и нахождение всех простых делителей");
        System.out.printf("Сгенерировано число %4d \n", number);
        int divider = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divider++;
                System.out.printf("%4d делитель числа %4d \n", i, number);
            }
        }
        if (divider == 2) {
            System.out.printf("Число простое, имеет %d делителя \n", divider);
        } else {
            System.out.printf("Число составное, имеет %d делителей \n", divider);
        }
        System.out.println("");
    }

    public static void greatestCommonFactor(int number, int number2) {
        System.out.println("Нахождение наибольшего общего делителя");
        System.out.printf("Сгенерировано число %10d \n", number);
        System.out.printf("Сгенерировано число %10d \n", number2);
        while (number != number2) {
            if (number > number2) {
                number -= number2;
            } else {
                number2 -= number;
            }
        }
        System.out.printf("Наибольший общий делитель %4d \n", number);
        System.out.println("");
    }

    public static void leastCommonMultiple(int number, int number2) {
        System.out.println("Нахождение наименьшего общего кратного");
        System.out.printf("Сгенерировано число %15d \n", number);
        System.out.printf("Сгенерировано число %15d \n", number2);
        int leastMultiply = Math.max(number, number2);
        boolean t = true;
        while (t) {
            if ((leastMultiply % number == 0) && (leastMultiply % number2 == 0)) {
                break;
            } else {
                leastMultiply += 1;
            }
        }
        System.out.printf("Наименьшее общее кратное %10d \n", leastMultiply);
        System.out.println("");
    }

    public static void variousNumbers(int number) {
        System.out.println("Нахождение количества различных цифр у натурального числа");
        System.out.printf("Количество уникальных цифр числа %d: ", number);
        int number2 = number;
        int digit = 0;
        int digit2 = 0;
        int count = 0;
        int quantity = 0;

        for (int i = 1; number > 0; number /= 10) {
            digit = number % 10;
            count = 0;
            number2 = number;
            for (int j = 1; number2 > 0; number2 /= 10) {
                digit2 = number2 % 10;
                if (digit == digit2) {
                    count++;
                }
            }
            if (count < 2) {
                quantity++;
            }
        }
        System.out.print(quantity);
        System.out.println("");
    }
}
