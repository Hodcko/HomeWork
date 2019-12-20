import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;
public class Task1_1 {
    public static void main(String[] args) {

        //Обмен значениями переменных без новых переменных

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        exchangeOfValues(number, number2);
        System.out.println("");

        //Реверсия семизначного числа

        System.out.println("Введите семизначное число число");
        number = scanner.nextInt();
        reverse(number);
        System.out.println("");

        //Арифметическое и геометрическое среднее

        System.out.println("Введите число");
        number = scanner.nextInt();
        ariAndGeo(number);
        System.out.println("");

        //Убывающая последовательность цифр 4-х значного числа

        System.out.println("Введите 4-х значное число");
        number = scanner.nextInt();
        descendingSequence(number);
        System.out.println("");

        //Площать кольца

        System.out.println("Введите радиусы двух кругов. Первый должен быть больше второго");
        number = scanner.nextInt();
        number2 = scanner.nextInt();
        areaCicle(number, number2);
        System.out.println("");

        // Масса динозавра

        System.out.println("Введите массу динозавра в килограммах");
        number = scanner.nextInt();
        dinoMass(number);
        System.out.println("");

        // Одинаковые числа

        System.out.println("Введите три числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        sameNumbers(a, b, c);


    }
    //Обмен значениями переменных без новых переменных
    public static void exchangeOfValues(int number, int number2) {
        number = number + number2;
        number2 = number - number2;
        number = number - number2;
        System.out.printf("Значение первой переменной %d, значение второй переменной %d\n", number, number2);
    }

    //Реверсия семизначного числа
    public static void reverse(int number) {
        int reverseNumber = 0;
        int digit = 0;
        for (int i = 1; number > 0; number /= 10) {
            digit = number % 10;
            for (int j = 1; j < 2; j++) {
                reverseNumber *= 10;
                reverseNumber += digit;
            }
        }
        System.out.printf("Реверсия введенного числа %d\n", reverseNumber);
    }

    //Арифметическое и геометрическое среднее
    public static void  ariAndGeo(int number) {
        int summ = 0;
        int mult = 1;
        int arihmeticMean = 0;
        double geometricMean = 0;
        for (int i = 1; number > 0; i++) {
            summ += number % 10;
            mult *= number % 10;
            arihmeticMean = summ / i;
            geometricMean = Math.pow(mult, (1.0 / i));
            number /= 10;
        }
        System.out.printf("Среднее арифметическое равно %d \n", arihmeticMean);
        System.out.printf("Среднее геометрическое равно %.3f \n", geometricMean);
    }

    //Убывающая последовательность цифр 4-х значного числа
    public static void descendingSequence(int number) {
        int digit = 0;
        int previousDigit = 0;
        for (int i = 1; number > 0; i++) {
            digit = number % 10;
            number /= 10;
            if (digit > previousDigit) {
                previousDigit = digit;
                if (number == 0) {
                    System.out.println("Цифры числа имеют убывающую последовательность");
                }
            } else {
                System.out.println("Цифры числа не имеют убывающую последовательность");
                break;
            }
        }
    }

    //Площать кольца
    public static void areaCicle(int r1, int r2) {
        double areaCicle = Math.PI * (r1 * r1);
        double areaCicle2 = Math.PI * (r2 * r2);
        double areaRing = areaCicle - areaCicle2;

        System.out.printf("Площадь кольца равна %.2f\n", areaRing);
    }

    // Масса динозавра
    public static void dinoMass(int dinosaurMass) {
        int gramMass = dinosaurMass * 1000;
        int milligramMass = gramMass * 1000;
        float tonMass = dinosaurMass / 1000f;
        System.out.printf("Масса динозавтра в граммах %d грамм, в миллиграммах %d миллиграмм, в тоннах %.2f тонн\n", gramMass, milligramMass, tonMass);
    }

    // Одинаковые числа
    public static void  sameNumbers(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            System.out.printf("Числа %d, %d, %d одинаковые \n", a, b, c);
        } else {
            System.out.printf("Числа %d, %d, %d различны \n", a, b, c);
        }
    }
}
