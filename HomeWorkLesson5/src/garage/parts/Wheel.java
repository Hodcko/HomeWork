package garage.parts;

import garage.parts.api.IWheel;
import garage.cars.api.WheelType;

public class Wheel implements IWheel {
    private final int radius;
    private final String id;
    private WheelType wheelType;

    public Wheel(int radius, String id, WheelType wheelType){
        this.radius = radius;
        this.id = id;
        this.wheelType = wheelType;
    }

    @Override
    public int getRadius() {
        return radius;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public WheelType getWheelType() {
        return wheelType;
    }

    @Override
    public void setWheelType(WheelType wheelType) {
        this.wheelType = wheelType;
    }

    @Override
    public void changeWheels(int radius, String id, WheelType wheelType){


    }
}





