import api.IStandart;
import api.IParts;
;

public class ComputerMain{
    public static void main(String[] args) {
        Computer myComp = new Computer(IParts.parts, IStandart.standarts);
        myComp.start();

        Director director = new Director();

        director.setBuilder(new OfficePC());
        Computer gamingComputer = director.buildComputer();
        gamingComputer.start();

        director.setBuilder(new GamingPC());
        Computer officeComputer = director.buildComputer();
        officeComputer.start();

    }
}
