package ClassesAndInterfaceses.api;

public class Legs implements ILegs{
    int weightOfLegs;

    public int getWeightOfLegs() {
        return weightOfLegs;
    }

    public Legs(int weightOfLegs){
        this.weightOfLegs = weightOfLegs;
    }


    @Override
    public void walk() {

    }
}
