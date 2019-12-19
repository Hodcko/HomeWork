import java.util.Random;
public class HeadsOrTails {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        Random randNumber = new Random();
        for (int i = 0; i < 1000; i ++){
            int coin = randNumber.nextInt(2) + 1;
            if (coin == 1){
                head++;
            }else{
                tail++;
            }
        }
        System.out.printf("Орел выпал %d раз \n", head);
        System.out.printf("Решка выпала %d раз \n", tail);
    }
}
