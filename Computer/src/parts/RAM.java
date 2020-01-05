package parts;


import api.ERAM;
import api.IStandart;

import java.util.Random;

public class RAM implements IParts {
    private Enum myPart;
    Random random = new Random();

    @Override
    public Enum getMyPart() {
        return myPart;
    }


    public RAM(ERAM myPart){
        this.myPart = myPart;
    }


    @Override
    public boolean isWork(){
        int number = random.nextInt(10);
        if (number == 4){
            System.out.println("RAM is defective");
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
        System.out.println("RAM is incompatible");
        return false;
    }
}
