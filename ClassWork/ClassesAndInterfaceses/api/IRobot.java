package ClassesAndInterfaceses.api;

public interface IRobot extends ILegs, IBody, IHands, IHead {
    @Override
    void getInfo();

    @Override
    void getName();

    @Override
    void toKeep();

    @Override
    int getNumberOfHands();

    @Override
    void look();

    @Override
    String getTypeOfYeyes();

    @Override
    void walk();

    @Override
    int getWeightOfLegs();
}
