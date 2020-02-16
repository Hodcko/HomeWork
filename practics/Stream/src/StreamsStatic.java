

public class StreamsStatic {
    public static void main(String[] args) {
        Resources resource = new Resources();
        resource.i = 5;
        myThreads thread = new myThreads();
        myThreads thread2 = new myThreads();

        thread.start();
        thread2.start();

        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(Resources.i);
    }
}
class myThreads extends Thread{

    @Override
    public void run(){
        Resources.changeStaticI();
    }
}

class Resources{
    static int i;
    public synchronized static void changeStaticI(){
        int i = Resources.i;
        i++;
        System.out.println(i + " " + Thread.currentThread().getName());
        Resources.i = i;

    }
}
