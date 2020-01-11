import java.util.Scanner;

public class ExceptionTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer s = null;
        do {
            System.out.println("Введите пожалуйста цифры");
            try {
                s = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException ex){
                System.out.println("Нужно ввести только цифры");
            }
        } while (s == null);

        System.out.println("Вы ввели " + s);
    }
}
