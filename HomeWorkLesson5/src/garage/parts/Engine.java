
package garage.parts;

import garage.cars.api.FuelType;
import garage.parts.api.IEngine;
import java.util.Random;

public class Engine implements IEngine {

    private final String id;
    private final int capacity;
    private FuelType fuelType;
    private int amountOfGas;


    public Engine(int capacity, FuelType fuelType, String id){
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }


    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public int getAmountOfGas() {
        return amountOfGas;
    }

    @Override
    public void setAmountOfGas(int amountOfGas) {
        this.amountOfGas = amountOfGas;
    }

}
