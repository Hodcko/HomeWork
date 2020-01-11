
import api.*;

public class Computer{
    private IParts[] parts;
    private IStandart [] standarts;

    public Computer(IParts[] parts, IStandart [] standarts){
        this.parts = parts;
        this.standarts = standarts;
    }

    public Computer(){
    }

    public IParts[] getParts() {
        return parts;
    }

    public void setParts(IParts[] parts) {
        this.parts = parts;
    }

    public void setStandarts(IStandart[] standarts) {
        this.standarts = standarts;
    }

    boolean start() {
         if (getParts()[0].compatible(standarts) && getParts()[1].compatible(standarts) && getParts()[2].compatible(standarts)
                 && getParts()[0].isWork() && getParts()[1].isWork() && getParts()[2].isWork()) {
                 System.out.println("Started");
                 return true;
         }else {
             return false;
         }
    }
}
