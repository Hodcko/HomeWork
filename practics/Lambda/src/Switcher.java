import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<Electricity> consumers = new ArrayList<>();


    public void addConsumer(Electricity consumer){
        consumers.add(consumer);
    }

    public void removeConsumer(Electricity consumer){
        consumers.remove(consumer);
    }

    public void switchOn(){
        System.out.println("Выключатель включен");
        for (Electricity consumer : consumers) {
            consumer.electricityOn(this);
        }
    }

}
