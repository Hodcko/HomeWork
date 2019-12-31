package garage.parts.api;

import garage.cars.api.FuelType;
import garage.parts.Engine;

public interface IEngine {



    String getId();
    int getCapacity();
    FuelType getFuelType();
    void setFuelType(FuelType fuelType);
    void setAmountOfGas(int amountOfGas);
    int getAmountOfGas();

}
