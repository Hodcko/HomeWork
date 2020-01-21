package ClassesAndInterfaceses.api;

public class Hands implements IHands{
    int numberOfHands;

    public int getNumberOfHands() {
        return numberOfHands;
    }

    public Hands(int numberOfHands){
        this.numberOfHands = numberOfHands;

    }


    @Override
    public void toKeep() {

    }
}
