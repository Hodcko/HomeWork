package garage.cars.api;

import garage.parts.api.IKey;
import garage.parts.api.IEngine;

public interface ICar{
    String getModel();
    String getBrand();
    void open(IKey key);
    void close();
    void driverSeat(IDriver driver);
    void passengerSeat(int numberOfPassengers);
    void start();
    void stop();
    double running();
    void addFuel(FuelType type, int amountOfGas);



}
