import api.IStandart;
import api.IParts;

public class ComputerMain{
    public static void main(String[] args) {
        Computer myComp = new Computer(IParts.parts, IStandart.standarts);
        myComp.start();
    }
}
