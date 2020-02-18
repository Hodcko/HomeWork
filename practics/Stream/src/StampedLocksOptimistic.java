
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

import static java.lang.Thread.sleep;

public class StampedLocksOptimistic {
    public static void main(String[] args) {
        ExecutorService executor  = Executors.newFixedThreadPool(2);
        StampedLock lock = new StampedLock();
        double x = 5;
        double y = 10;

        executor.submit(() -> {
            long stamp = lock.tryOptimisticRead();
            try {
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                sleep(5);
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                sleep(10);
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                lock.unlock(stamp);
                System.out.println("Write done");
            }
        });

        executor.submit(() -> {
            long stamp = lock.writeLock();
            try {
                System.out.println("Write Lock acquired");
                sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                lock.unlock(stamp);
                System.out.println("Write done");
            }
        });

        executor.submit(() -> {
            long stamp = lock.tryOptimisticRead();
            double currentX = x, currentY = y;
            if (!lock.validate(stamp)) {
                stamp = lock.readLock();
                try {
                    currentX = x;
                    currentY = y;
                } finally {
                    lock.unlockRead(stamp);
                }
            }
            System.out.println(Math.sqrt(currentX * currentX + currentY * currentY));
        });

        executor.shutdown();
    }
}
