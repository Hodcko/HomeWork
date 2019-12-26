package garage.cars.api;

import garage.parts.api.IKey;

public interface ICar {
    void drive();
    void open(Keys key);
    void close();
    void start(DriverLicense license);
    void stop();
    void addFuel(FuelType type, int amountOfGas);
    void driverSeat(DriverLicense license);
    int passengerSeat();
}
