import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Conditions {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int account= 0;

    public static void main(String[] args) {

        new WithDraw().start();
        new Deposit().start();
    }

    static class Deposit extends Thread{
        @Override
        public void run() {
            lock.lock();
            account += 10;
            condition.signal();
            lock.unlock();
        }
    }

    static class WithDraw extends Thread{
        @Override
        public void run() {
            if(account < 10){
                try {
                    lock.lock();
                    System.out.println(account);
                    condition.await();
                    System.out.println(account);
                    lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            account -= 10;
            System.out.println(account);
        }
    }

}
