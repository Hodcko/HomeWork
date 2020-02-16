

public class LambdaMain {
    public static void fire (Object object){
        System.out.println("Fire");
    }
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        switcher.addConsumer(new Lamp());
        switcher.addConsumer(new Radio());
        switcher.addConsumer( object -> {System.out.println("Вентилятор крутится");
            System.out.println("!!!");
        });
        switcher.addConsumer(LambdaMain::fire);
        switcher.switchOn();
    }
}
