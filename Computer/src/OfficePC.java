import api.*;


public class OfficePC extends ComputerBuilder{
    @Override
    void buildParts() {
        computer.setParts(IParts.officeParts);
    }

    @Override
    void buildStandsrts() {
        computer.setStandarts(IStandart.officeStandarts);
    }
}
