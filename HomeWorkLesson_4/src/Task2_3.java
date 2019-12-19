import java.util.Random;
public class Task2_3 {
    public static void main(String[] args) {
        Random randNumber = new Random();

        //Проверка на совершенное число

        System.out.println("Проверка на совершенное число");
        int number = randNumber.nextInt(1000)+100;
        System.out.printf("Сгенерировано число %d \n", number);
        int sumDividers = 0;
        for(int i = 1; i <= number; i ++){
            if ((number % i == 0) && (i != number)){
                sumDividers += i;
            }
        }
        if (sumDividers == number){
            System.out.printf("Число %d совершенное, сумма делителей не считая самого числа равна %d\n", number, sumDividers);
        }else{
            System.out.printf("Число %d не совершенное, сумма делителей не считая самого числа равна %d\n", number, sumDividers);
        }
    }
}
