import java.util.Random;
public class Task2_1 {
    public static void main(String[] args) {

    // Орел или решка

        int numberOfCoinFlips = 1000;
        headsOrTails(numberOfCoinFlips);
    }


    public static void headsOrTails(int numberOfCoinFlips) {
        int head = 0;
        int tail = 0;
        Random randNumber = new Random();
        for (int i = 0; i < numberOfCoinFlips; i++) {
            int coin = randNumber.nextInt(2) + 1;
            if (coin == 1) {
                head++;
            } else {
                tail++;
            }
        }
        System.out.printf("Орел выпал %d раз \n", head);
        System.out.printf("Решка выпала %d раз \n", tail);
    }
}
