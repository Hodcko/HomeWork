package garage.parts.api;

import garage.cars.api.WheelType;

public interface IWheel {
    void changeWheels(double wheelRadius, String wheelName, WheelType type);
}
