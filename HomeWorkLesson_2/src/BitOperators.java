
public class BitOperators {
    public static void main(String[] args) {

        byte a = 42; //00101010
        byte b = 15; //00001111
        byte c = -42; //11010110
        byte d = -15; //11110001
        long n = -42L;
        long m = -15L;

        // Побитовый унарный оператор NOT
        System.out.println(~a); //результат -43 или 11010101
        System.out.println(~b); //результат -16 или 11110000
        System.out.println(~c); //результат 41 или 00101001
        System.out.println(~d); //результат 14 или 00001110

        //Побитовый AND
        System.out.println(a&b); //результат 10 или 00001010
        System.out.println(c&d); //результат -48 или 11010000

        //Побитовый OR
        System.out.println(a|b); //результат 47 или 00101111
        System.out.println(c|d); //результат -9 или 11110111

        //Побитовый исключающее OR
        System.out.println(a^b); //результат равен 37 или 00100101
        System.out.println(c^d); //результат равен 39 или 00100111

        //Сдвиг право
        System.out.println(a>>2); //результат равен 10 или 00001010
        System.out.println(b>>2); //результат равен 3 или 00000011
        System.out.println(c>>2); //результат равен -11 или 11110101
        System.out.println(d>>2); //результат равен -4 или 11111100

        //Свиг вправо с заполнением нулями
        System.out.println(a>>>2); //результат равен 10 или 00001010
        System.out.println(b>>>2); //результат равен 3 или 00000011
        System.out.println(n>>>2); //результат равен 4611686018427387893 или 11111111111111111111111111111111111111111111111111111111110101 и записан в перменную n
        System.out.println(m>>>2); //результат равен 4611686018427387900 или 11111111111111111111111111111111111111111111111111111111111100 и записан в перменную m

        //Сдвиг влево
        System.out.println(a<<2); //результат равен 168 или 0000000010101000
        System.out.println(b<<2); //результат равен 60 или 00111100
        System.out.println(c<<2); //результат равен -168 или 1111111101011000
        System.out.println(d<<2); //результат равен -60 или 11000100

        //Побитовый AND с присваиванием
        a = 42; //00101010
        b = 15; //00001111
        c = -42; //11010110
        d = -15; //11110001
        System.out.println(a&=b); //результат 10 или 00001010 и занесен в переменную а
        System.out.println(c&=d); //результат -48 или 11010000 и занесен в переменную b

        //Побитовый OR с присваиванием
        a = 42; //00101010
        b = 15; //00001111
        c = -42; //11010110
        d = -15; //11110001
        System.out.println(a|=b); //результат 47 или 00101111 и записан в переменную а
        System.out.println(c|=d); //результат -9 или 11110111 и записан в переменную с

        //Побитовый исключающее OR с присваиванием
        a = 42; //00101010
        b = 15; //00001111
        c = -42; //11010110
        d = -15; //11110001
        System.out.println(a^=b); //результат равен 37 или 00100101 и записан в перменную а
        System.out.println(c^=d); //результат равен 39 или 00100111 и записан в переменную с


        //Сдвиг право с присваиванием
        a = 42; //00101010
        b = 15; //00001111
        c = -42; //11010110
        d = -15; //11110001
        System.out.println(a>>=2); //результат равен 10 или 00001010 и записан в перменную а
        System.out.println(b>>=2); //результат равен 3 или 00000011 и записан в перменную b
        System.out.println(c>>=2); //результат равен -11 или 11110101 и записан в перменную c
        System.out.println(d>>=2); //результат равен -4 или 11111100 и записан в перменную d


        //Свиг вправо с заполнением нулями и присваиванием
        a = 42; //00101010
        b = 15; //00001111
        n = -42L; //11010110
        m = -15L; //11110001
        System.out.println(a>>>=2); //результат равен 10 или 00001010 и записан в перменную а
        System.out.println(b>>>=2); //результат равен 3 или 00000011 и записан в перменную b
        System.out.println(n>>>=2); //результат равен 4611686018427387893 или 11111111111111111111111111111111111111111111111111111111110101 и записан в перменную c
        System.out.println(m>>>=2); //результат равен 4611686018427387900 или 11111111111111111111111111111111111111111111111111111111111100 и записан в перменную m


        //Сдвиг влево с присваиванием
        a = 42; //00101010
        b = 15; //00001111
        c = -42; //11010110
        d = -15; //11110001
        System.out.println(a<<2); //результат равен 168 или 0000000010101000 и записан в перменную а
        System.out.println(b<<2); //результат равен 60 или 00111100 и записан в перменную b
        System.out.println(c<<2); //результат равен -168 или 1111111101011000 и записан в перменную c
        System.out.println(d<<2); //результат равен -60 или 11000100 и записан в перменную d


    }
}
