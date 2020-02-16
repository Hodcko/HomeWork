import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StreamTryLock {
    public static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        new myThread().start();
        new myThread2().start();

    }
    static class myThread extends Thread{
        @Override
        public void run(){
            lock.lock();
            System.out.println(getName() + " working");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " stop working");
            lock.unlock();
            System.out.println(getName() + " lock is released");
        }
    }

    static class myThread2 extends Thread {
        @Override
        public void run() {
            System.out.println(getName() + " begin working");
            while (true) {
                if (lock.tryLock()) {
                    System.out.println(getName() + " working");
                    break;
                } else {
                    System.out.println(getName() + "waiting");
                }

            }
        }
    }

}
