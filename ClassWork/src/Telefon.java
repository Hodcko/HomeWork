package src;
public class Telefon implements ITel {
    public void call(){
        System.out.println("Гудки....");
    }
    protected void pause(){
        System.out.println("Минута тишины");
    }
    public void stop(){
        System.out.println("Положить......");
    }



}
