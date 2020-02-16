import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StreamWaitNotify {
    static List<String> strings = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        new Operator().start();
        new Machine().start();

    }
    static class Operator extends Thread{
        @Override
        public void run(){
            while(true){
                Scanner scanner = new Scanner(System.in);
                synchronized (strings){
                    strings.add(scanner.nextLine());
                    strings.notify();
                }
            }
        }
    }

    static class Machine extends Thread{
        @Override
        public void run(){
            while (strings.isEmpty()){
                synchronized (strings){
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(strings.remove(0));
                }
            }
        }
    }
}