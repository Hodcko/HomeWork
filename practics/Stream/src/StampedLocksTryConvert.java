
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.StampedLock;

public class StampedLocksTryConvert {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        StampedLock lock = new StampedLock();
        AtomicInteger count = new AtomicInteger();

        executor.submit(() -> {
           long stamp = lock.readLock();
           try{
               if (count.get() == 0){
                   stamp = lock.tryConvertToWriteLock(stamp);
                   if(stamp == 0L){
                       System.out.println("Could not convert to write lock");
                       stamp = lock.writeLock();
                   }
                   count.set(23);
               }
               System.out.println(count);
           }finally {
               lock.unlock(stamp);
           }
        });
        executor.shutdown();
    }
}
