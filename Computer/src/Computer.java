
import api.*;
import parts.*;

public class Computer{
    private IParts[] parts;
    private IStandart [] standarts;


    public Computer(IParts[] parts, IStandart [] standarts){
        this.parts = parts;
        this.standarts = standarts;
    }

     void start() {
         if (parts[0].isWork() && parts[1].isWork() && parts[2].isWork()) {
             if ((standarts[0].equals(parts[2].getMyPart())) &&
                     (standarts[1].equals(parts[0].getMyPart())) &&
                     (standarts[2].equals(parts[1].getMyPart()))) {
                 System.out.println("Started");
             }else {
                 System.out.println("Some part is incompatible");
             }
         }else {
             System.out.println("Some part defective");
         }
     }
}
