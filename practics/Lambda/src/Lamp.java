public class Lamp implements Electricity{

    public void lightOn(){
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn(Object object) {
        lightOn();
    }
}
