package garage.cars.api;

import garage.cars.api.DriverLicense;
import garage.parts.api.IKey;
import garage.parts.api.ILock;

public interface IDriver{
    DriverLicense getLicense();

    void stop();
    void close();
    void driverSeat(IDriver driver);
    void passengerSeat(int numberOfPassengers);
    void start();
    double running();
    void addFuel(FuelType type, int amountOfGas);
    void open(IKey key, ILock lock);



    IDriver myDriver = new Driver(DriverLicense.TYPE_B);
}
