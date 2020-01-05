package parts;
import java.util.Random;
import api.ECPU;
import api.IStandart;

public class CPU implements IParts{
    private Enum myPart;
    Random random = new Random();

    @Override
    public Enum getMyPart() {
        return myPart;
    }

    public CPU(ECPU myPart){
        this.myPart = myPart;
    }

    @Override
    public boolean isWork(){
        int number = random.nextInt(10);
        if (number == 2){
            System.out.println("CPU is defective");
            return false;
        }
        return true;
    }

    @Override
    public boolean compatible(IStandart [] standarts){
        for (IStandart standart:standarts){
            if (standart == myPart){
                return true;
            }
        }
        System.out.println("CPU is incompatible");
        return false;
    }
}
