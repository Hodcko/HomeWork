
package garage.cars.api;

import garage.parts.api.IKey;
import garage.parts.api.IEngine;

public interface ICar{
    String getModel();
    String getBrand();
    boolean open(IKey key);
    boolean close(IKey key);
    boolean driverSeat(IDriver driver);
    boolean passengerSeat (int numberOfPassengers);
    boolean start();
    boolean stop();
    double running();
    void addFuel(FuelType type, int amountOfGas);
    boolean isOpen();
    boolean isStarted();
    boolean isDriversSeat();



}
