

public class StreamsSyncro {
    public static void main(String[] args) {
        Resource resource = new Resource();
        resource.i = 5;
        myThread thread = new myThread();
        myThread thread2 = new myThread();

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
    }
}
class myThread extends Thread{
    Resource resource;
    public void setResource(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run(){
        resource.changeI();
    }
}

class Resource{
    int i;
    public synchronized void changeI(){
            int i = this.i;
            i++;
            System.out.println(i + " " + Thread.currentThread().getName());
            this.i = i;

    }
}
