package garage.parts.api;

import garage.cars.api.FuelType;

public interface IEngine {
    void changeEngine(double engineCapacity, String engineName, FuelType type);


}
