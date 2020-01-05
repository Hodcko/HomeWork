package parts;

import api.EHDD;
import api.IStandart;

import java.util.Random;

public class HDD implements IParts{
    private Enum myPart;
    Random random = new Random();

    @Override
    public Enum getMyPart() {
        return myPart;
    }

    public HDD(EHDD myPart){
        this.myPart = myPart;
    }


    @Override
    public boolean isWork(){
        int number = random.nextInt(10);
        if (number == 3){
            System.out.println("HDD is defective");
            return false;
        }
        return true;
    }

    @Override
    public boolean compatible(IStandart[] standarts){
        for (IStandart standart:standarts){
            if (standart == myPart){
                return true;
            }
        }
        System.out.println("HDD is incompatible");
        return false;
    }
}
