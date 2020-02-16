import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Collable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new myCallable();
        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }

    static class myCallable implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            int j = 0;
            for (int i = 0; i <10 ;j++, i++) {
                Thread.sleep(300);
            }
            return j;
        }
    }
}
