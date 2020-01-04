
import api.*;
import parts.*;

import static parts.IParts.*;


public class Computer implements IParts, IStandart{
    private IParts[] parts;
    private IStandart [] standarts;

    @Override
    public boolean isWork() {
        return false;
    }

    @Override
    public Enum getMyPart() {
        return null;
    }

    public Computer(IParts[] parts, IStandart [] standarts){
        this.parts = parts;
        this.standarts = standarts;
    }

     void start() {
         if (Computer.part[0].isWork() && Computer.part[1].isWork() && Computer.part[2].isWork()) {
             if ((Computer.standart[0].equals(Computer.part[2].getMyPart())) &&
                     (Computer.standart[1].equals(Computer.part[0].getMyPart())) &&
                     (Computer.standart[2].equals(Computer.part[1].getMyPart()))) {
                 System.out.println("Started");
             }else {
                 System.out.println("Some part is incompatible");
             }
         }else {
             System.out.println("Some part defective");
         }
     }

    public static void main(String[] args) {

        Computer myComp = new Computer(part, standart);
        myComp.start();

    }
}
