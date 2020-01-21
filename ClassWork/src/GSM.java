package src;
public class GSM implements ITel {
    public void snake(){
        System.out.println("Змейка");
    }
    public void sendsms(){
        System.out.println("СМС");
    }

    @Override
    public void call() {

    }

}
