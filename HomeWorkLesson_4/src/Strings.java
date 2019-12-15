import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        // Задание № 2
        String str = "Мама мыла раму";
        String str2 = "Мама" + " мыла " + "раму";
        System.out.println(str == str2); //true т.к. строки имеют одинаковый набор символов и являются литералом,
                                         // а значит, что строка str2 будет иметь ссылку на такой же адрес
                                         // в памяти как и str

        // Задание № 3
        Scanner scanner = new Scanner(System.in);
        String str3 = scanner.nextLine();
        System.out.println(str == str3.intern());//true, потому что метод .intern() нашел в пуле строк такую же строку и
    }                                            //вернул ссылку на нее
}
