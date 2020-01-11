import api.IStandart;
import api.IParts;

public class GamingPC extends ComputerBuilder{

    @Override
    void buildParts() {
        computer.setParts(IParts.gamingParts);
    }

    @Override
    void buildStandsrts() {
        computer.setStandarts(IStandart.gamingStandarts);
    }
}
