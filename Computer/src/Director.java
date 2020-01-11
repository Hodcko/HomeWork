
public class Director {

    ComputerBuilder builder;

    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    Computer buildComputer(){
        builder.createComputer();
        builder.buildParts();
        builder.buildStandsrts();
        Computer computer = builder.getComputer();
        return computer;
    }
}
