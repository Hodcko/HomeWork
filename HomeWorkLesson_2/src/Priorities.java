public class Priorities {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int x;
        boolean y;



        x = 5 + 2 / 8;
        System.out.println(x); // получили 5 т.к. деление 2/8 дало 0, 5+0=5

        x = (5 + 2) / 8;
        System.out.println(x); // получили 0, т.к. сразу выполняется действие в сколбках, а 7 не делится нацело на 8

        a = 2;
        x = (5 + a++)/8;      // значение 2 занесено в переменную а, т.к. постфиксный оператор
        System.out.println(x);// ++ не работает со значением без переменной и в IDE выдыет ошибку. (данные переменные будут использованы в дальнейшем)
                             // Получили 0, т.к. увеличение значение в переменной а не повлияло на результат сложения(использован постинкремент) в скобках и
                             // последующий результат деления 7 на 8 дал меньше единицы.


        a = 2;
        b = 8;              // по аналогии с предыдущим примером получили в скобках 7. В знаменателе так же получили 7, т.к.
        x = (5 + a++) / --b;// был использован преинкремент, а значит, что сразу было посчитано значение переменной b а только
        System.out.println(x);  // потом эта переменная участвовала в выражении.


        a = 2;                   // постинкремент не увеличил значение y в выраженни. В результате чего биты в двоичном выражении
        b = 8;                   // числа 10 были перемещены на 2 позиции вправо. Это значит, что 10 было поделено 2 раза на 2 и
        x = (5 * 2 >> a++) / --b;// в скобках получислось значение 2. 2/7 в начем случае равняется 0.
        System.out.println(x);

        a = 2;                      // в нвчвле посчитали значение тернарного оператора, получили значение false, далее 22*2,
        b = 8;                      // свдинули на 2 байта вправо ((44/2)/2) и разделили получившееся значение 11 на 7. В результате получили 1.
        x = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b;
        System.out.println(x);

        //a = 2;                                             // выдает ошибку компиляции
        //b = 8;
        //x = (5 + 7 > 20 ? 68 => 68 : 22 * 2 >> a++) / --b;
        //System.out.println(x);

        y=6 - 2 > 3 && 12 * 12 <= 119; // слева от логического AND получили true (4>3), справа получили false т.к.
        System.out.println(y);         // 144>119. Результат выражения равен false по причине неравенства операндов.


        y = true && false;
        System.out.println(y); // получили false т.к. операнды не равны

















    }

}

