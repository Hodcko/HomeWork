

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RentrantLock {
    public static void main(String[] args) {
        Resource1 resource = new Resource1();
        resource.i = 5;
        resource.j = 5;
        myThread1 thread = new myThread1();
        myThread1 thread2 = new myThread1();

        thread.setResource(resource);
        thread2.setResource(resource);

        thread.start();
        thread2.start();

        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(resource.i);
        System.out.println(resource.j);
    }
}
class myThread1 extends Thread{
    Resource1 resource;
    public void setResource(Resource1 resource){
        this.resource = resource;
    }

    @Override
    public void run(){
        resource.changeI();
        resource.changeJ();
    }

}

class Resource1{
    int i;
    int j;
    Lock lock = new ReentrantLock();
    public void changeI(){
        lock.lock();
        int i = this.i;
        i++;
        this.i = i;
    }

    public void changeJ(){
        int j = this.j;
        j++;
        this.j = j;
        lock.unlock();
    }
}

