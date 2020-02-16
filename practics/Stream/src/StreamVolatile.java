

public class StreamVolatile {
    volatile  static int i = 0;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while( i < 5){
                System.out.println("Increment i to " + (++i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(() -> {

            int localVar = i;
            while (localVar < 5){
               if (localVar != i){
                   System.out.println("new valut of i is " + i);
                   localVar = i;
               }
            }
        });
        thread.start();
        thread2.start();
    }

}
