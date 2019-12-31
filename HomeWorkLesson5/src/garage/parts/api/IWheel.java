package garage.parts.api;

import garage.cars.api.WheelType;
import garage.parts.Wheel;

public interface IWheel {

    void changeWheels(int radius, String id, WheelType wheelType);
    void setWheelType(WheelType wheelType);
    WheelType getWheelType();
    String getId();
    int getRadius();
}
