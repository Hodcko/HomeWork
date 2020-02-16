
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executers {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Thread(()-> System.out.println(Thread.currentThread().getName())));
        executorService.submit(new Thread(()-> System.out.println(Thread.currentThread().getName())));
        executorService.shutdownNow();



    }

}
