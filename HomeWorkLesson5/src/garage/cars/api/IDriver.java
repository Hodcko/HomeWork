package garage.cars.api;

import garage.cars.api.DriverLicense;

public interface IDriver{
    DriverLicense getLicense();

    IDriver myDriver = new Driver(DriverLicense.TYPE_B);
}
