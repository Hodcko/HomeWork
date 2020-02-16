import java.util.concurrent.atomic.AtomicInteger;

public class StreamAtomic {
    static AtomicInteger  atomicInteger= new AtomicInteger(0);

    public static void main(String[] args) {
        for (int j = 0; j < 10000 ; j++) {
            new myThread().start();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(atomicInteger);

    }
    static class myThread extends Thread {
        @Override
        public void run(){
            atomicInteger.incrementAndGet();

        }
    }

}



