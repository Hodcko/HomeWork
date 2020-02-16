

public class StreamsJoin {
    public static int number = 0;
    public static void main(String[] args) {

        Thread thread = new Thread(()->
        {
            for (int i = 0; i <= 100; i ++){
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main");

    }
}


