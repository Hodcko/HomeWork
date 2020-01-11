
import api.*;

public class Computer{
    private IParts[] parts;
    private IStandart [] standarts;


    public Computer(IParts[] parts, IStandart [] standarts){
        this.parts = parts;
        this.standarts = standarts;
    }

    boolean start() {
         if (parts[0].compatible(standarts) && parts[1].compatible(standarts) && parts[2].compatible(standarts)
                 && parts[0].isWork() && parts[1].isWork() && parts[2].isWork()) {
                 System.out.println("Started");
                 return true;
         }else {
             return false;
         }

    }
}
