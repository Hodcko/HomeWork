
public abstract class ComputerBuilder{
    Computer computer;

    void createComputer(){
        computer = new Computer();
    }

    abstract void buildParts();

    abstract void buildStandsrts();

   Computer getComputer(){
        return computer;
   }
}
