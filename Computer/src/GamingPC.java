import api.IStandart;
import parts.IParts;

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
